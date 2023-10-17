package com.example.testApi.controller;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class apiController {

    private static final Logger LOGGER = LoggerFactory.getLogger(apiController.class);

    @PostMapping(value = "/save", produces = "application/json")
    public String logRequest(@RequestBody String requestBody) {
        LOGGER.info("Received API Request Body: {}", requestBody);
        return "Message from the API: " + requestBody;
    }
}
