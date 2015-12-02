package org.mule.modules.eloquaemail;

import org.mule.api.annotations.Config;
import org.mule.api.annotations.Connector;
import org.mule.modules.eloquaemail.config.ConnectorConfig;

@Connector(name="eloqua-email", friendlyName="EloquaEmail", minMuleVersion = "3.7")
public class EloquaEmailConnector {

    @Config
    ConnectorConfig config;

    public ConnectorConfig getConfig() {
        return config;
    }

    public void setConfig(ConnectorConfig config) {
        this.config = config;
    }

}