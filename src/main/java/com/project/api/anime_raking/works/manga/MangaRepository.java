package com.project.api.anime_raking.works.manga;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.project.api.anime_raking.works.WorkIdClass;


public interface MangaRepository extends JpaRepository<Manga,WorkIdClass> {

    @Query("SELECT m FROM MANGA m WHERE m.releaseDate >= :startDate AND m.releaseDate <= :endDate or m.status = 'Ongoing' ORDER BY m.releaseDate")
    List<Manga> findSeasonManga(@Param("startDate") LocalDate startDate, @Param("endDate") LocalDate endDate);

     @Query("SELECT m FROM MANGA m ORDER BY m.averageGrade DESC")
    List<Manga> findTopMangas();

    @Query("SELECT m FROM MANGA m WHERE m.releaseDate >= :startDate AND m.releaseDate <= :endDate or m.status = 'Ongoing' ORDER BY m.averageGrade DESC LIMIT 7")
    List<Manga> findPopularMangas(@Param("startDate") LocalDate startDate, @Param("endDate") LocalDate endDate);
}
