package dev.backend.moduleapi.service;

import dev.backend.moduleapi.exception.CustomException;
import dev.backend.modulecommon.enums.CodeEnum;
import dev.backend.modulecommon.service.CommonDemoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class DemoService {

    private final CommonDemoService commonDemoService;

    public String save() {
        System.out.println(CodeEnum.SUCCESS.getCode());
        System.out.println(commonDemoService.commonService());
        return "save";
    }

    public String find() {
        return "find";
    }

    public String exception() {
        if (true) {
            throw new CustomException(CodeEnum.UNKNOWN_ERROR);
        }
        return "exception";
    }

}
