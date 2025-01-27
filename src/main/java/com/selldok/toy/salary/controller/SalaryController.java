package com.selldok.toy.salary.controller;

import com.selldok.toy.salary.entity.Occupation;
import com.selldok.toy.salary.model.SalaryRequest;
import com.selldok.toy.salary.model.SalaryResponse;
import com.selldok.toy.salary.service.SalaryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @author Seil Park
 */
@Controller
@RequiredArgsConstructor
public class SalaryController {

    private final SalaryService salaryService;

    @GetMapping("/salary")
    public String getSalaryView(){
        return "/salary/main";
    }

    @GetMapping("/salary/{id}")
    public ResponseEntity<SalaryResponse> getSalary(@PathVariable Long id){
        SalaryResponse salaryResponse = salaryService.getSalaryById(id);
        return new ResponseEntity<>(salaryResponse,HttpStatus.OK);
    }

    @GetMapping("/salary/edit")
    public String getEditView(){
        return "/salary/edit";
    }

    @ResponseBody
    @PutMapping("/salary/{id}")
    public String updateSalary(@PathVariable Long id, @RequestBody SalaryRequest salaryRequest){
        salaryService.updateSalary(id, salaryRequest);
        return "success";
    }
}
