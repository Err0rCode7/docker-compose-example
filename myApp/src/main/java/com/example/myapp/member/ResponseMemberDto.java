package com.example.myapp.member;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Getter
public class ResponseMemberDto {

    private Long id;
    private String name;

    public ResponseMemberDto(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public ResponseMemberDto(Member member){
        this.id = member.getId();
        this.name = member.getName();
    }
}
