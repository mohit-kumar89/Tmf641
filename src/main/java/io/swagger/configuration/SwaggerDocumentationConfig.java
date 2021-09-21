package io.swagger.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-08-05T10:49:44.666Z[GMT]")
@Configuration
public class SwaggerDocumentationConfig {

    @Bean
    public Docket customImplementation(){
        return new Docket(DocumentationType.OAS_30)
                .select()
                    .apis(RequestHandlerSelectors.basePackage("io.swagger.api"))
                    .build()
                .directModelSubstitute(org.threeten.bp.LocalDate.class, java.sql.Date.class)
                .directModelSubstitute(org.threeten.bp.OffsetDateTime.class, java.util.Date.class)
                .apiInfo(apiInfo());
    }

    ApiInfo apiInfo() {
        return new ApiInfoBuilder()
            .title("API ServiceOrdering")
            .description("## TMF API Reference : TMF 641 - Service Ordering Management   Version 4.1   The Service Order API provides a standardized mechanism for managing Service Order, a type of order which can be used to place an order between internal Customer Order management system to service order management system or between a service provider and a partner and vice versa.  ### Service Order resource A service order will describe a list of service order items.  A service order item references an action on an existing  or  future  service.  By  service  we  designed  Customer Facing  Service  (CFS)  as  well  as  Resource Facing Service (RFS). From a component perspective, a service order should be available - from a Service Orchestration Component (and it could mix CFS and RFS) - from an Infrastructure Control & Management component (and it would have only RFS)  ### TMF641 performs the following operations on service order resource : - Retrieval of a service order or a collection of service orders depending on filter criteria - Partial update of a service order (including updating rules) - Creation of a service order (including default values and creation rules) - Deletion of service order (for administration purposes) - Notification of events on Service order  **Cancel Service Order resource**  This resource is used to request a service order cancellation.  **TMF641 provides following operations on Cancel Service Order resource :**  - Retrieval of a cancel service order or a collection of cancel service orders  - Creation of a cancel service order  - Notification of events on cancel service order.  Copyright © TM Forum 2020. All Rights Reserved")
            .license("")
            .licenseUrl("http://unlicense.org")
            .termsOfServiceUrl("")
            .version("4.1.0")
            .contact(new Contact("","", ""))
            .build();
    }

    @Bean
    public OpenAPI openApi() {
        return new OpenAPI()
            .info(new Info()
                .title("API ServiceOrdering")
                .description("## TMF API Reference : TMF 641 - Service Ordering Management   Version 4.1   The Service Order API provides a standardized mechanism for managing Service Order, a type of order which can be used to place an order between internal Customer Order management system to service order management system or between a service provider and a partner and vice versa.  ### Service Order resource A service order will describe a list of service order items.  A service order item references an action on an existing  or  future  service.  By  service  we  designed  Customer Facing  Service  (CFS)  as  well  as  Resource Facing Service (RFS). From a component perspective, a service order should be available - from a Service Orchestration Component (and it could mix CFS and RFS) - from an Infrastructure Control & Management component (and it would have only RFS)  ### TMF641 performs the following operations on service order resource : - Retrieval of a service order or a collection of service orders depending on filter criteria - Partial update of a service order (including updating rules) - Creation of a service order (including default values and creation rules) - Deletion of service order (for administration purposes) - Notification of events on Service order  **Cancel Service Order resource**  This resource is used to request a service order cancellation.  **TMF641 provides following operations on Cancel Service Order resource :**  - Retrieval of a cancel service order or a collection of cancel service orders  - Creation of a cancel service order  - Notification of events on cancel service order.  Copyright © TM Forum 2020. All Rights Reserved")
                .termsOfService("")
                .version("4.1.0")
                .license(new License()
                    .name("")
                    .url("http://unlicense.org"))
                .contact(new io.swagger.v3.oas.models.info.Contact()
                    .email("")));
    }

}
