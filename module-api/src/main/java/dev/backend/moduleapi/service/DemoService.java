package dev.backend.moduleapi.service;

import dev.backend.moduleapi.exception.CustomException;
import dev.backend.modulecommon.domain.Member;
import dev.backend.modulecommon.enums.CodeEnum;
import dev.backend.modulecommon.repositories.MemberRepository;
import dev.backend.modulecommon.service.CommonDemoService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@RequiredArgsConstructor
@Service
public class DemoService {

    private final CommonDemoService commonDemoService;

    private final MemberRepository memberRepository;

    public String save() {
        memberRepository.save(Member.builder()
                .name(Thread.currentThread().getName()).build());
        return "save";
    }

    public String find() {
        int size = memberRepository.findAll().size();
        log.info("DB size : " + size);
        return "find";
    }

    public String exception() {
        if (true) {
            throw new CustomException(CodeEnum.UNKNOWN_ERROR);
        }
        return "exception";
    }

}
