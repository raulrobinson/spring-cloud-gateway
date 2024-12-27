package com.rasysbox.locationservice.infra.rest;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Tag(name = "Customer", description = "Customers Management")
@RequestMapping(path = "${controller.properties.base-path}/customers", produces = MediaType.APPLICATION_JSON_VALUE)
public class CustomerAPI {
}
