package com.selldok.toy.company.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.selldok.toy.company.entity.category.Category;
import com.selldok.toy.employee.entity.ApplyHistory;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.sql.Clob;
import java.util.Date;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Gogisung
 */
@Entity
@Table(name = "boards")
@Getter @Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Board extends JpaBaseEntity {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "board_id")
    private Long id;

    @NotBlank
    private String title;

    /**
     * default값이 255라 다 안들어가서
     * 수정했는데, 특수문자나 개행이 잘 안받아지는 것 같습니다.
     */
    @NotBlank
    @Column(length = 65535)
    private String content;

    @NotBlank
    private String image;

    /**
     * cascadetype이 all로 되어있어
     * 이미 저장된 company를 중복저장시도해 에러가 발생해 제거하였습니다.(error : detached entity passed to persist)
     * 확인부탁드립니다.
     */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "company_id")
    private Company company;

    @OneToOne
    @JoinColumn(name = "category_id")
    private Category category;

    @Temporal(TemporalType.DATE)
    private Date endDate;

    private int recommendation;

    /**
     * 입사지원이력
     */
    @JsonIgnore
    @OneToMany(mappedBy = "employmentBoard", cascade = CascadeType.ALL)
    @Builder.Default
    private List<ApplyHistory> applyHistories = new ArrayList<ApplyHistory>();
}
