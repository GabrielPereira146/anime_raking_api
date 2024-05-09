package com.project.api.anime_raking.works;

import java.sql.Date;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@IdClass(WorkIdClass.class)
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "work_type", discriminatorType = DiscriminatorType.STRING)
@Table(name = "works")

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
    private String status;

    @Id
    @Column(name = "work_type", insertable = false, updatable = false)
    private String work_type;

}
