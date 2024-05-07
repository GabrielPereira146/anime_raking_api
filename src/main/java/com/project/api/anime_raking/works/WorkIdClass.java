package com.project.api.anime_raking.works;

import java.io.Serializable;

import lombok.Data;

@Data
public class WorkIdClass implements Serializable {
    private String title;
    private String work_type;
}
