package com.project.api.anime_raking.works.manga;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.api.anime_raking.works.WorkIdClass;

public interface MangaRepository extends JpaRepository<Manga,WorkIdClass> {

}
