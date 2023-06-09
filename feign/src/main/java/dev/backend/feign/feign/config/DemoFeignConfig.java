package dev.backend.feign.feign.config;

import dev.backend.feign.feign.decoder.DemoFeignErrorDecoder;
import dev.backend.feign.feign.interceptor.DemoFeignInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DemoFeignConfig {

    @Bean
    public DemoFeignInterceptor feignInterceptor() {
        return DemoFeignInterceptor.of();
    }

    @Bean
    public DemoFeignErrorDecoder errorDecoder() {
        return new DemoFeignErrorDecoder();
    }

}
