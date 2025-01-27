package com.selldok.toy.company.model;

import com.querydsl.core.annotations.QueryProjection;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
/**
 * @gogisung
 * */
@Data
@Builder
@NoArgsConstructor
public class CompanyListResponse {

    private Long id;
    private String name; // 기업명
    private String employees; // 직원수
    private String email; // 대표 이메일
    private String phone; // 대표전화
    private String homepage; // 대표사이트
    private Long memberId;
    private String memberName;

    @QueryProjection
    public CompanyListResponse(Long id, String name, String employees, String email, String phone, String homepage, Long memberId, String memberName) {
        this.id = id;
        this.name = name;
        this.employees = employees;
        this.email = email;
        this.phone = phone;
        this.homepage = homepage;
        this.memberId = memberId;
        this.memberName = memberName;
    }
}
