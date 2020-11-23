package com.selldok.toy.company.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UpdateCompany {
    private String name;
    private String country;
    private String city;
    private String street;

    private String totalSales; // 매출액
    private String employees; // 직원수
    private String info; // 회사소개
    private String email; // 대표 이메일
    private String phone; // 대표전화
    private String homepage; // 대표사이트 필수 x
}
