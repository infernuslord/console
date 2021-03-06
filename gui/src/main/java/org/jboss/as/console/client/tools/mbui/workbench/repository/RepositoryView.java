/*
 * JBoss, Home of Professional Open Source
 * Copyright 2011 Red Hat Inc. and/or its affiliates and other contributors
 * as indicated by the @author tags. All rights reserved.
 * See the copyright.txt in the distribution for a
 * full listing of individual contributors.
 *
 * This copyrighted material is made available to anyone wishing to use,
 * modify, copy, or redistribute it subject to the terms and conditions
 * of the GNU Lesser General Public License, v. 2.1.
 * This program is distributed in the hope that it will be useful, but WITHOUT A
 * WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A
 * PARTICULAR PURPOSE.  See the GNU Lesser General Public License for more details.
 * You should have received a copy of the GNU Lesser General Public License,
 * v.2.1 along with this distribution; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA  02110-1301, USA.
 */
package org.jboss.as.console.client.tools.mbui.workbench.repository;

import static com.google.gwt.user.cellview.client.HasKeyboardSelectionPolicy.KeyboardSelectionPolicy.BOUND_TO_SELECTION;

import com.google.gwt.cell.client.AbstractCell;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.safehtml.shared.SafeHtmlBuilder;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.cellview.client.CellList;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.view.client.ProvidesKey;
import com.google.gwt.view.client.SelectionChangeEvent;
import com.google.gwt.view.client.SingleSelectionModel;
import com.google.inject.Inject;
import com.gwtplatform.mvp.client.ViewImpl;

/**
 * @author Harald Pehl
 * @date 10/30/2012
 */
public class RepositoryView extends ViewImpl implements RepositoryPresenter.MyView
{
    public interface Binder extends UiBinder<Widget, RepositoryView>
    {
    }

    class SampleCell extends AbstractCell<Sample>
    {
        @Override
        public void render(final Context context, final Sample sample, final SafeHtmlBuilder sb)
        {
            sb.appendEscaped(sample.getName());
        }
    }

    class KeyProvider implements ProvidesKey<Sample>
    {
        @Override
        public Object getKey(final Sample ample)
        {
            return ample == null ? null : ample.getName();
        }
    }

    private final Widget widget;
    private final SingleSelectionModel<Sample> selectionModel;
    private RepositoryPresenter presenter;

    @UiField Button visualize;
    @UiField Button reify;
    @UiField Button activate;
    @UiField Button reset;
    @UiField Button passivate;
    @UiField(provided = true) CellList<Sample> list;

    @Inject
    public RepositoryView(final Binder binder, final SampleRepository sampleRepository)
    {
        KeyProvider keyProvider = new KeyProvider();
        this.list = new CellList<Sample>(new SampleCell(), keyProvider);
        this.list.setRowCount(sampleRepository.getSamples().size());
        this.list.setRowData(sampleRepository.getSamples());

        this.selectionModel = new SingleSelectionModel<Sample>(keyProvider);
        this.selectionModel.addSelectionChangeHandler(new SelectionChangeEvent.Handler()
        {
            @Override
            public void onSelectionChange(final SelectionChangeEvent event)
            {
                reify.setEnabled(true);
            }
        });
        this.list.setSelectionModel(selectionModel);
        this.list.setKeyboardSelectionPolicy(BOUND_TO_SELECTION);

        this.widget = binder.createAndBindUi(this);
        this.reify.setEnabled(false);
    }

    @Override
    public Widget asWidget()
    {
        return widget;
    }

    @UiHandler("visualize")
    public void onVisualize(ClickEvent event)
    {
        presenter.visualize(selectionModel.getSelectedObject());
    }

    @UiHandler("reify")
    public void onReify(ClickEvent event)
    {
        presenter.reify(selectionModel.getSelectedObject());
    }

    @UiHandler("activate")
    public void onActivate(ClickEvent event)
    {
        presenter.activate(selectionModel.getSelectedObject());
    }

    @UiHandler("reset")
    public void onReset(ClickEvent event)
    {
        presenter.reset(selectionModel.getSelectedObject());
    }

    @UiHandler("passivate")
    public void onPassivate(ClickEvent event)
    {
        presenter.passivate(selectionModel.getSelectedObject());
    }

    @Override
    public void setPresenter(final RepositoryPresenter presenter)
    {
        this.presenter = presenter;
    }
}
