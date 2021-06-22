package com.example.myapp.member;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class MemberService {

    private final MemberRepository memberRepository;

    @Transactional(readOnly = true)
    public List<ResponseMemberDto> findAll() {
        return memberRepository.findAll().stream()
                .map(ResponseMemberDto::new)
                .collect(Collectors.toList());
    }

    @Transactional()
    public void save(RequestMemberDto requestMemberDto) {
        memberRepository.save(requestMemberDto.toEntity());
    }
}
