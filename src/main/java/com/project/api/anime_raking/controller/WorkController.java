package com.project.api.anime_raking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.api.anime_raking.works.WorksRepository;
import com.project.api.anime_raking.works.WorksResponseDTO;

import org.springframework.web.bind.annotation.GetMapping;

@RestController
@CrossOrigin(origins = "http://localhost:5173")
@RequestMapping("/works")
public class WorkController {

    @Autowired
    private WorksRepository worksRepository;

    @GetMapping("/")
    public List<WorksResponseDTO> getAll() {
        List<WorksResponseDTO> workList = worksRepository.findAll().stream().map(WorksResponseDTO::new).toList();
        return workList;

    }
}