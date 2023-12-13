package com.ldy.order.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "nacos.pattern")
@Data
@Component
public class NacosConfig {
    private String dateformat;
    private String dis;
    private String str1;
}