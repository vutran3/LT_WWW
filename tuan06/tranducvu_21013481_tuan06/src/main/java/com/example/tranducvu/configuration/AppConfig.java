package com.example.tranducvu.configuration;

import com.example.tranducvu.services.AddressService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan("com.example.tranducvu.services")
public class AppConfig {
    @Bean
    public AddressService addressService() {
        return new AddressService();
    }
}
