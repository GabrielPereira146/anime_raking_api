package com.project.api.anime_raking.works.anime;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.project.api.anime_raking.works.WorkIdClass;

public interface AnimeRepository extends JpaRepository<Anime, WorkIdClass> {

    @Query("SELECT a FROM ANIME a WHERE a.releaseDate >= :startDate AND a.releaseDate <= :endDate ORDER BY a.releaseDate")
    List<Anime> findSeasonAnime(@Param("startDate") LocalDate startDate, @Param("endDate") LocalDate endDate);
}
