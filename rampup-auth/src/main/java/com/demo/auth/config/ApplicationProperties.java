package com.demo.auth.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * 此步主要是获取配置文件中配置的白名单，可自行舍去或自定义实现其他方式
 **/
@Data
@Component
@ConfigurationProperties("application")
public class ApplicationProperties {
    private final Security security = new Security();

    @Data
    public static class Security {
        private Oauth2 oauth2;
        private List<String> excludeUrls = new ArrayList<>();

        @Data
        public static class Oauth2 {
            private String issuerUrl;

        }
    }
}
