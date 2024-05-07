package com.project.api.anime_raking.works.manga;

import com.project.api.anime_raking.works.Works;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity(name = "MANGA")
@Table(name = "manga")

@PrimaryKeyJoinColumn(name = "title") 
public class Manga extends Works {
    private int volumes;
}
