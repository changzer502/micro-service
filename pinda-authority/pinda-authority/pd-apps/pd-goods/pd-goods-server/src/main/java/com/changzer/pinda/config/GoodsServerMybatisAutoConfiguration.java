package com.changzer.pinda.config;

import com.changzer.pinda.database.datasource.BaseMybatisConfiguration;
import com.changzer.pinda.database.properties.DatabaseProperties;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;

/**
 * 配置一些拦截器
 */
@Configuration
@Slf4j

public class GoodsServerMybatisAutoConfiguration extends BaseMybatisConfiguration {
    public GoodsServerMybatisAutoConfiguration(DatabaseProperties databaseProperties) {
        super(databaseProperties);
    }
}
