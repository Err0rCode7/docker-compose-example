package com.example.myapp.member;

import jdk.jfr.ContentType;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/members")
@RequiredArgsConstructor
@RestController
public class MemberController {

    private final MemberService memberService;

    @GetMapping("/")
    public List<ResponseMemberDto> getMembers() {
        return memberService.findAll();
    }

    @PostMapping(value = "/", consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    public String saveMemberForFormRequest(@ModelAttribute RequestMemberDto requestMemberDto) {
        memberService.save(requestMemberDto);
        return "Ok";
    }

    @PostMapping("/")
    public String saveMember(@RequestBody RequestMemberDto requestMemberDto) {
        memberService.save(requestMemberDto);
        return "Ok";
    }
}
