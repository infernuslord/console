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
package org.jboss.as.console.client.shared.subsys.jacorb.model;

import org.jboss.as.console.client.shared.properties.PropertyRecord;
import org.jboss.as.console.client.shared.viewframework.HasProperties;
import org.jboss.as.console.client.shared.viewframework.NamedEntity;
import org.jboss.as.console.client.widgets.forms.Address;
import org.jboss.as.console.client.widgets.forms.Binding;
import org.jboss.as.console.client.widgets.forms.FormItem;

import java.util.List;

/**
 * @author David Bosschaert
 */
@Address("/subsystem=jacorb")
public interface JacOrbSubsystem extends NamedEntity, HasProperties {
    @Override
    @Binding(detypedName="name", key=true)
    @FormItem(defaultValue="",
              localLabel="common_label_name",
              required=true,
              formItemTypeForEdit="TEXT",
              formItemTypeForAdd="TEXT_BOX",
              order=10,
              localTabName ="subsys_jacorb_orbTab")
    public String getName();
    @Override
    public void setName(String name);

    @Binding(detypedName="print-version")
    @FormItem(defaultValue="off",
              localLabel="subsys_jacorb_printVersion",
              formItemTypeForEdit="COMBO_BOX",
              formItemTypeForAdd="COMBO_BOX",
              acceptedValues={"off", "on"},
              order=20,
              localTabName ="subsys_jacorb_orbTab")
    public String getPrintVersion();
    public void setPrintVersion(String value);

    @Binding(detypedName="use-imr")
    @FormItem(defaultValue="off",
              localLabel="subsys_jacorb_useIMR",
              formItemTypeForEdit="COMBO_BOX",
              formItemTypeForAdd="COMBO_BOX",
              acceptedValues={"off", "on"},
              order=30,
              localTabName ="subsys_jacorb_orbTab")
    public String getUseIMR();
    public void setUseIMR(String value);

    @Binding(detypedName="use-bom")
    @FormItem(defaultValue="off",
              localLabel="subsys_jacorb_useBOM",
              formItemTypeForEdit="COMBO_BOX",
              formItemTypeForAdd="COMBO_BOX",
              acceptedValues={"off", "on"},
              order=40,
              localTabName ="subsys_jacorb_orbTab")
    public String getUseBOM();
    public void setUseBOM(String value);

    @Binding(detypedName="cache-typecodes")
    @FormItem(defaultValue="off",
              localLabel="subsys_jacorb_cacheTypecodes",
              formItemTypeForEdit="COMBO_BOX",
              formItemTypeForAdd="COMBO_BOX",
              acceptedValues={"off", "on"},
              order=50,
              localTabName ="subsys_jacorb_orbTab")
    public String getCacheTypecodes();
    public void setCacheTypecodes(String value);

    @Binding(detypedName="cache-poa-names")
    @FormItem(defaultValue="off",
              localLabel="subsys_jacorb_cachePOANames",
              formItemTypeForEdit="COMBO_BOX",
              formItemTypeForAdd="COMBO_BOX",
              acceptedValues={"off", "on"},
              order=60,
              localTabName ="subsys_jacorb_orbTab")
    public String getCachePOANames();
    public void setCachePOANames(String value);

    @Binding(detypedName="giop-minor-version")
    @FormItem(defaultValue="2",
              localLabel="subsys_jacorb_GIOPMinorVersion",
              formItemTypeForAdd="NUMBER_BOX",
              formItemTypeForEdit="NUMBER_BOX",
              order=70,
              localTabName ="subsys_jacorb_orbTab")
    public int getGiopMinorVersion();
    public void setGiopMinorVersion(int value);

    @Binding(detypedName="retries")
    @FormItem(defaultValue="5",
              localLabel="subsys_jacorb_retries",
              formItemTypeForAdd="NUMBER_BOX",
              formItemTypeForEdit="NUMBER_BOX",
              order=80,
              localTabName ="subsys_jacorb_orbTab")
    public int getRetries();
    public void setRetries(int value);

    @Binding(detypedName="retry-interval")
    @FormItem(defaultValue="500",
              localLabel="subsys_jacorb_retryInterval",
              formItemTypeForAdd="NUMBER_BOX",
              formItemTypeForEdit="NUMBER_BOX",
              order=90,
              localTabName ="subsys_jacorb_orbTab")
    public int getRetryInterval();
    public void setRetryInterval(int value);

    @Binding(detypedName="client-timeout")
    @FormItem(defaultValue="0",
              localLabel="subsys_jacorb_clientTimeout",
              formItemTypeForAdd="NUMBER_BOX",
              formItemTypeForEdit="NUMBER_BOX",
              order=100,
              localTabName ="subsys_jacorb_orbTab")
    public int getClientTimeout();
    public void setClientTimeout(int value);

    @Binding(detypedName="server-timeout")
    @FormItem(defaultValue="0",
              localLabel="subsys_jacorb_serverTimeout",
              formItemTypeForAdd="NUMBER_BOX",
              formItemTypeForEdit="NUMBER_BOX",
              order=110,
              localTabName ="subsys_jacorb_orbTab")
    public int getServerTimeout();
    public void setServerTimeout(int value);

    @Binding(detypedName="max-server-connections")
    @FormItem(defaultValue="2147483647",
              localLabel="subsys_jacorb_maxServerConnections",
              formItemTypeForAdd="NUMBER_BOX",
              formItemTypeForEdit="NUMBER_BOX",
              order=120,
              localTabName ="subsys_jacorb_orbTab")
    public int getMaxServerConnections();
    public void setMaxServerConnections(int value);

    @Binding(detypedName="max-managed-buf-size")
    @FormItem(defaultValue="24",
              localLabel="subsys_jacorb_maxManagedBufSize",
              formItemTypeForAdd="NUMBER_BOX",
              formItemTypeForEdit="NUMBER_BOX",
              order=130,
              localTabName ="subsys_jacorb_orbTab")
    public int getMaxManagedBufSize();
    public void setMaxManagedBufSize(int value);

    @Binding(detypedName="outbuf-size")
    @FormItem(defaultValue="2048",
              localLabel="subsys_jacorb_outbufSize",
              formItemTypeForAdd="NUMBER_BOX",
              formItemTypeForEdit="NUMBER_BOX",
              order=140,
              localTabName ="subsys_jacorb_orbTab")
    public int getOutbufSize();
    public void setOutbufSize(int value);

    @Binding(detypedName="outbuf-cache-timeout")
    @FormItem(defaultValue="-1",
              localLabel="subsys_jacorb_outbufCacheTimeout",
              formItemTypeForAdd="NUMBER_BOX_ALLOW_NEGATIVE",
              formItemTypeForEdit="NUMBER_BOX_ALLOW_NEGATIVE",
              order=150,
              localTabName ="subsys_jacorb_orbTab")
    public int getOutbufCacheTimeout();
    public void setOutbufCacheTimeout(int value);

    @Binding(detypedName="security")
    @FormItem(defaultValue="off",
              localLabel="subsys_jacorb_security",
              formItemTypeForEdit="COMBO_BOX",
              formItemTypeForAdd="COMBO_BOX",
              acceptedValues={"off", "on", "identity", "client"},
              order=160,
              localTabName ="subsys_jacorb_initializersTab")
    public String getSecurity();
    public void setSecurity(String value);

    @Binding(detypedName="transactions")
    @FormItem(defaultValue="off",
              localLabel="subsys_jacorb_transactions",
              formItemTypeForEdit="COMBO_BOX",
              formItemTypeForAdd="COMBO_BOX",
              acceptedValues={"off", "on", "spec"},
              order=170,
              localTabName ="subsys_jacorb_initializersTab")
    public String getTransactions();
    public void setTransactions(String value);

    @Binding(detypedName="monitoring")
    @FormItem(defaultValue="off",
              localLabel="subsys_jacorb_monitoring",
              formItemTypeForEdit="COMBO_BOX",
              formItemTypeForAdd="COMBO_BOX",
              acceptedValues={"off", "on"},
              order=180,
              localTabName ="subsys_jacorb_poaTab")
    public String getMonitoring();
    public void setMonitoring(String value);

    @Binding(detypedName="queue-wait")
    @FormItem(defaultValue="off",
              localLabel="subsys_jacorb_queueWait",
              formItemTypeForEdit="COMBO_BOX",
              formItemTypeForAdd="COMBO_BOX",
              acceptedValues={"off", "on"},
              order=190,
              localTabName ="subsys_jacorb_poaTab")
    public String getQueueWait();
    public void setQueueWait(String value);

    @Binding(detypedName="queue-min")
    @FormItem(defaultValue="10",
              localLabel="subsys_jacorb_queueMin",
              formItemTypeForAdd="NUMBER_BOX",
              formItemTypeForEdit="NUMBER_BOX",
              order=200,
              localTabName ="subsys_jacorb_poaTab")
    public int getQueueMin();
    public void setQueueMin(int value);

    @Binding(detypedName="queue-max")
    @FormItem(defaultValue="100",
              localLabel="subsys_jacorb_queueMax",
              formItemTypeForAdd="NUMBER_BOX",
              formItemTypeForEdit="NUMBER_BOX",
              order=210,
              localTabName ="subsys_jacorb_poaTab")
    public int getQueueMax();
    public void setQueueMax(int value);

    @Binding(detypedName="pool-size")
    @FormItem(defaultValue="5",
              localLabel="subsys_jacorb_poolSize",
              formItemTypeForAdd="NUMBER_BOX",
              formItemTypeForEdit="NUMBER_BOX",
              order=220,
              localTabName ="subsys_jacorb_poaTab")
    public int getPoolSize();
    public void setPoolSize(int value);

    @Binding(detypedName="max-threads")
    @FormItem(defaultValue="32",
    		  localLabel="subsys_jacorb_maxThreads",
              formItemTypeForAdd="NUMBER_BOX",
              formItemTypeForEdit="NUMBER_BOX",
              order=230,
              localTabName ="subsys_jacorb_poaTab")
    public int getMaxThreads();
    public void setMaxThreads(int value);

    @Binding(detypedName="root-context")
    @FormItem(defaultValue="JBoss/Naming/root",
              localLabel="subsys_jacorb_rootContext",
              order=240,
              localTabName ="subsys_jacorb_namingTab")
    public String getRootContext();
    public void setRootContext(String value);

    @Binding(detypedName="export-corbaloc")
    @FormItem(defaultValue="on",
              localLabel="subsys_jacorb_exportCorbaloc",
              formItemTypeForEdit="COMBO_BOX",
              formItemTypeForAdd="COMBO_BOX",
              acceptedValues={"off", "on"},
              order=250,
              localTabName ="subsys_jacorb_namingTab")
    public String getExportCorbaloc();
    public void setExportCorbaloc(String value);

    @Binding(detypedName="sun")
    @FormItem(defaultValue="on",
              localLabel="subsys_jacorb_sun",
              formItemTypeForEdit="COMBO_BOX",
              formItemTypeForAdd="COMBO_BOX",
              acceptedValues={"off", "on"},
              order=260,
              localTabName ="subsys_jacorb_interoperabilityTab")
    public String getSun();
    public void setSun(String value);

    @Binding(detypedName="comet")
    @FormItem(defaultValue="off",
              localLabel="subsys_jacorb_comet",
              formItemTypeForEdit="COMBO_BOX",
              formItemTypeForAdd="COMBO_BOX",
              acceptedValues={"off", "on"},
              order=270,
              localTabName ="subsys_jacorb_interoperabilityTab")
    public String getComet();
    public void setComet(String value);

    @Binding(detypedName="iona")
    @FormItem(defaultValue="off",
              localLabel="subsys_jacorb_iona",
              formItemTypeForEdit="COMBO_BOX",
              formItemTypeForAdd="COMBO_BOX",
              acceptedValues={"off", "on"},
              order=280,
              localTabName ="subsys_jacorb_interoperabilityTab")
    public String getIona();
    public void setIona(String value);

    @Binding(detypedName="chunk-custom-rmi-valuetypes")
    @FormItem(defaultValue="on",
              localLabel="subsys_jacorb_chunkCustomRMIValuetypes",
              formItemTypeForEdit="COMBO_BOX",
              formItemTypeForAdd="COMBO_BOX",
              acceptedValues={"off", "on"},
              order=290,
              localTabName ="subsys_jacorb_interoperabilityTab")
    public String getChunkCustomRMIValueTypes();
    public void setChunkCustomRMIValueTypes(String value);

    @Binding(detypedName="lax-boolean-encoding")
    @FormItem(defaultValue="off",
              localLabel="subsys_jacorb_laxBooleanEncoding",
              formItemTypeForEdit="COMBO_BOX",
              formItemTypeForAdd="COMBO_BOX",
              acceptedValues={"off", "on"},
              order=300,
              localTabName ="subsys_jacorb_interoperabilityTab")
    public String getLaxBooleanEncoding();
    public void setLaxBooleanEncoding(String value);

    @Binding(detypedName="indirection-encoding-disable")
    @FormItem(defaultValue="off",
              localLabel="subsys_jacorb_indirectionEncodingDisable",
              formItemTypeForEdit="COMBO_BOX",
              formItemTypeForAdd="COMBO_BOX",
              acceptedValues={"off", "on"},
              order=310,
              localTabName ="subsys_jacorb_interoperabilityTab")
    public String getIndirectionEncodingDisable();
    public void setIndirectionEncodingDisable(String value);

    @Binding(detypedName="strict-check-on-tc-creation")
    @FormItem(defaultValue="off",
              localLabel="subsys_jacorb_strictCheckOnTCCreation",
              formItemTypeForEdit="COMBO_BOX",
              formItemTypeForAdd="COMBO_BOX",
              acceptedValues={"off", "on"},
              order=320,
              localTabName ="subsys_jacorb_interoperabilityTab")
    public String getStrictCheckOnTCCreation();
    public void setStrictCheckOnTCCreation(String value);

    @Binding(detypedName="support-ssl")
    @FormItem(defaultValue="off",
              localLabel="subsys_jacorb_supportSSL",
              formItemTypeForEdit="COMBO_BOX",
              formItemTypeForAdd="COMBO_BOX",
              acceptedValues={"off", "on"},
              order=330,
              localTabName ="subsys_jacorb_securityTab")
    public String getSupportSSL();
    public void setSupportSSL(String value);

    @Binding(detypedName="security-domain")
    @FormItem(localLabel="subsys_jacorb_securityDomain",
              required=false,
              order=340,
              localTabName ="subsys_jacorb_securityTab")
    public String getSecurityDomain();
    public void setSecurityDomain(String value);

    @Binding(detypedName="add-component-via-interceptor")
    @FormItem(defaultValue="on",
              localLabel="subsys_jacorb_addComponentViaInterceptor",
              formItemTypeForEdit="COMBO_BOX",
              formItemTypeForAdd="COMBO_BOX",
              acceptedValues={"off", "on"},
              order=350,
              localTabName ="subsys_jacorb_securityTab")
    public String getAddComponentViaInterceptor();
    public void setAddComponentViaInterceptor(String value);

    @Binding(detypedName="client-supports")
    @FormItem(defaultValue="MutualAuth",
              localLabel="subsys_jacorb_clientSupports",
              formItemTypeForAdd="COMBO_BOX",
              formItemTypeForEdit="COMBO_BOX",
              acceptedValues={"None", "ServerAuth", "ClientAuth", "MutualAuth"},
              order=360,
              localTabName ="subsys_jacorb_securityTab")
    public String getClientSupports();
    public void setClientSupports(String value);

    @Binding(detypedName="client-requires")
    @FormItem(defaultValue="None",
              localLabel="subsys_jacorb_clientRequires",
              formItemTypeForAdd="COMBO_BOX",
              formItemTypeForEdit="COMBO_BOX",
              acceptedValues={"None", "ServerAuth", "ClientAuth", "MutualAuth"},
              order=370,
              localTabName ="subsys_jacorb_securityTab")
    public String getClientRequires();
    public void setClientRequires(String value);

    @Binding(detypedName="server-supports")
    @FormItem(defaultValue="MutualAuth",
              localLabel="subsys_jacorb_serverSupports",
              formItemTypeForAdd="COMBO_BOX",
              formItemTypeForEdit="COMBO_BOX",
              acceptedValues={"None", "ServerAuth", "ClientAuth", "MutualAuth"},
              order=380,
              localTabName ="subsys_jacorb_securityTab")
    public String getServerSupports();
    public void setServerSupports(String value);

    @Binding(detypedName="server-requires")
    @FormItem(defaultValue="None",
              localLabel="subsys_jacorb_serverRequires",
              formItemTypeForAdd="COMBO_BOX",
              formItemTypeForEdit="COMBO_BOX",
              acceptedValues={"None", "ServerAuth", "ClientAuth", "MutualAuth"},
              order=390,
              localTabName ="subsys_jacorb_securityTab")
    public String getServerRequires();
    public void setServerRequires(String value);

    @Override
    @Binding(detypedName="properties",
             listType="org.jboss.as.console.client.shared.properties.PropertyRecord")
    @FormItem(localLabel="common_label_properties",
              formItemTypeForEdit="PROPERTY_EDITOR",
              formItemTypeForAdd="PROPERTY_EDITOR",
              order=1000,
              tabName ="CUSTOM")
    List<PropertyRecord> getProperties();
    void setProperties(List<PropertyRecord> properties);
}
