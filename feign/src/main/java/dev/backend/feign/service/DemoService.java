package dev.backend.feign.service;

import dev.backend.feign.common.dto.BaseResponseInfo;
import dev.backend.feign.feign.client.DemoFeignClient;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class DemoService {

    private final DemoFeignClient demoFeignClient;

    public String get() {
        ResponseEntity<BaseResponseInfo> response =
                demoFeignClient.callGet("CustomHeader", "CustomName", 1L);
        System.out.println("Name : " + response.getBody().getName());
        System.out.println("Age : " + response.getBody().getAge());
        System.out.println("Header : " + response.getBody().getHeader());
        return "get";
    }

}
