package com.braidsbeautybyangie.creditcardprocessorservice.web.controller;

import com.braidsbeautybyangie.creditcardprocessorservice.request.CreditCardProcessRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/credit-card/ccp")
public class CreditCardProcessorController {

    private static final Logger LOGGER = LoggerFactory.getLogger(CreditCardProcessorController.class);

    @PostMapping("/process")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void processCreditCard(@RequestBody CreditCardProcessRequest request) {
        LOGGER.info("Processing request payment: {}", request);
    }
}
