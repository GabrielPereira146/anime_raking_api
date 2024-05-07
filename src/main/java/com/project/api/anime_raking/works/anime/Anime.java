package com.project.api.anime_raking.works.anime;

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

@Entity(name = "ANIME")
@Table(name = "anime")

@PrimaryKeyJoinColumn(name = "title")
public class Anime extends Works {

    private int episodes;

}
