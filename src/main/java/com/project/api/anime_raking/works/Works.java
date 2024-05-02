package com.project.api.anime_raking.works;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Table(name = "works")
@Entity(name = "works")

@Data
@NoArgsConstructor
@AllArgsConstructor

@EqualsAndHashCode(of = "title")
public class Works {
    @Id
    private String title;

    private String cover;
    private Date releaseDate;
    private String synopsis;
    private String author;
    private Float averageGrade;
    private String workType;
}
