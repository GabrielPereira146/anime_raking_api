package com.project.api.anime_raking.works;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface WorksRepository extends JpaRepository<Works, String>{

    @Query("SELECT w FROM Works w ORDER BY w.averageGrade DESC LIMIT 7")
    List<Works> findBestWorks();
}
