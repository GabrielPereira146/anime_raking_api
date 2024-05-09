package com.project.api.anime_raking.works;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface WorksRepository extends JpaRepository<Works, WorkIdClass>{

    @Query("SELECT w FROM Works w WHERE w.releaseDate >= :startDate AND w.releaseDate <= :endDate or w.status = 'Ongoing' ORDER BY w.averageGrade DESC LIMIT 7")
    List<Works> findBestWorks(@Param("startDate") LocalDate startDate, @Param("endDate") LocalDate endDate);


}
