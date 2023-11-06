package com.sirbaconjr.jobmanagement.modules.candidate.controllers;

import com.sirbaconjr.jobmanagement.modules.candidate.CandidateEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/candidate")
public class CandidateController {
    @PostMapping("/")
    public void create(@RequestBody CandidateEntity candidateEntity) {
        System.out.println(candidateEntity.getEmail());
    }
}
