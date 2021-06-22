package com.example.myapp.member;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class RequestMemberDto {
    private String name;

    public RequestMemberDto(String name) {
        this.name = name;
    }

    public Member toEntity() {
        return new Member(this.name);
    }
}
