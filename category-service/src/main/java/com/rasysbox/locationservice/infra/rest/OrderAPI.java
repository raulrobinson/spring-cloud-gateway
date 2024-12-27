package com.rasysbox.locationservice.infra.rest;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Tag(name = "Orders", description = "Orders Management")
@RequestMapping(path = "${controller.properties.base-path}/orders", produces = MediaType.APPLICATION_JSON_VALUE)
public class OrderAPI {
}
