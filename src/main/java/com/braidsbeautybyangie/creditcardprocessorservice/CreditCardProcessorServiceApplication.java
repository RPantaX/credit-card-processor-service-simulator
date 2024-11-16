package com.braidsbeautybyangie.creditcardprocessorservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignAutoConfiguration;

@SpringBootApplication
@EnableDiscoveryClient
@ImportAutoConfiguration({FeignAutoConfiguration.class})
@EnableFeignClients("com.braidsbeautybyangie.*")
public class CreditCardProcessorServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CreditCardProcessorServiceApplication.class, args);
    }

}
