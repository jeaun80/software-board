package com.example.softwareboard.domain.mail;


import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Builder
@NoArgsConstructor
@Getter
public class Mail {
//연관관계를 아무것도 설정하지않는다. 저장하기위한 테이블이 아니라 인증할때 일시저장하기위한 테이블
    @Id
    private String mail;
    @Column(nullable = false)
    private String msg;
    private String key;
    private String title;

}