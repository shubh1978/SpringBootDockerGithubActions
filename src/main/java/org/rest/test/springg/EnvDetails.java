package org.rest.test.springg;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class EnvDetails {

    @Value("${app.server.name}")
    private String appServerName;

    @Value("${spring.datasource.username}")
    private String datasourceUsername;

    @Value("${spring.datasource.password}")
    private String datasourcePassword;

    @Value("${app.server.detail}")
    public String appServerDetail;

    @Value("${spring.datasource.url}")
    public String dbUrl;

    public String getDbUrl(){
        return dbUrl;
    }

    public String getAppServerName(){
        return appServerName;
    }

    public String getAppServerDetail(){
        return appServerDetail;
    }
    public String getDatasourceUsername() {
        return datasourceUsername;
    }

    public String getDatasourcePassword() {
        return datasourcePassword;
    }

    @Override
    public String toString() {
        return "EnvDetails{" +
                "appServerName'=" + appServerName + '\'' +
                ",appServerDetail='" + appServerDetail + '\'' +
                ", dbUrl='" + dbUrl + '\'' +
                ", datasourceUsername='" + datasourceUsername + '\'' +
                ", datasourcePassword='" + datasourcePassword + '\'' +
                '}';
    }
}
