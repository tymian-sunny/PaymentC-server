package org.finacial.config;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Classname SwaggerConfig
 * @Description Swagger配置类
 * @Version 1.0.0
 * @Date 2025/08/30 21:22
 * @Created by tymian
 */

@Configuration
public class SwaggerConfig {
    @Bean
    public OpenAPI swaggerOpenAPI(){
        return new OpenAPI()
                .info(new Info().title("个人财务管理系统")
                        // 信息
                        .contact(new Contact().name("tymian").email("tymian.sunny@gmail.com").url("tymian.xyz"))
                        // 简介
                        .description("我的API文档")
                        // 版本
                        .version("v1")
                        // 许可证
                        .license(new License().name("Apache 2.0").url("http://springdoc.org")))
                .externalDocs(new ExternalDocumentation()
                        .description("外部文档")
                        .url("https://springshop.wiki.github.org/docs"));
    }
}