package com.selldok.toy.salary.model;

import com.selldok.toy.salary.entity.Occupation;
import lombok.*;

/**
 * @author Seil Park
 */
@Getter @Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SalaryResponse {
    private Occupation occupation;

    private int yearOne;

    private int yearTwo;

    private int yearThree;

    private int yearFour;

    private int yearFive;

    private int yearSix;

    private int yearSeven;

    private int yearEight;

    private int yearNine;

    private int yearTen;
}
