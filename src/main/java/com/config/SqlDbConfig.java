package com.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.lang.NonNull;

@ConfigurationProperties(prefix = "sql.db.connection")
public class SqlDbConfig {
    @NonNull
    private String url1;

    @NonNull
    private String username1;

    @NonNull
    private String password1;

    @NonNull
    public String getUrl1() {
        return url1;
    }

    public void setUrl1(@NonNull String url1) {
        this.url1 = url1;
    }

    @NonNull
    public String getUsername1() {
        return username1;
    }

    public void setUsername1(@NonNull String username1) {
        this.username1 = username1;
    }

    @NonNull
    public String getPassword1() {
        return password1;
    }

    public void setPassword1(@NonNull String password1) {
        this.password1 = password1;
    }
}
