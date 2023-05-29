package dev.backend.feign.controller;

import dev.backend.feign.service.DemoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class DemoController {

    private final DemoService demoService;

    @GetMapping("/get")
    public String getController() {
        return demoService.get();
    }

}