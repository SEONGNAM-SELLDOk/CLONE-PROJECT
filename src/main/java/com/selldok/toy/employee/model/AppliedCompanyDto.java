package com.selldok.toy.employee.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author DongSeok,Kim
 */
@Getter
@Setter
@ToString
public class AppliedCompanyDto {
    private Long applicantId;
    private Long companyId;
}
