package com.loja.apiRest.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
	
	@Bean
    public Docket productApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .paths(PathSelectors.regex("/api.*")) 
                .paths(PathSelectors.any())
                .build()
                .apiInfo(metaInfo());
      
    }
	 private ApiInfo metaInfo() {

		 	return new ApiInfoBuilder().title("Luis Carlos").description("API para o cadastro de Produtos").version("1.0.1").license("2022").licenseUrl("crluis521@gmail.com")
		 			.build();
	        
	        
	    }
	
}