package com.project.api.anime_raking.works.anime;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.api.anime_raking.works.WorkIdClass;

public interface AnimeRepository extends JpaRepository<Anime, WorkIdClass> {

}
