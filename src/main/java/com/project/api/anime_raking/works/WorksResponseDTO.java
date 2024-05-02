package com.project.api.anime_raking.works;


public record WorksResponseDTO(String title, String cover, String releaseDate, String synopsis, String author, Float averageGrade,
        String workType) {

    public WorksResponseDTO(Works works) {
        this(works.getTitle(), works.getCover(), works.getReleaseDate().toString(), works.getSynopsis(), works.getAuthor(), works.getAverageGrade(),
                works.getWorkType());

    }

}
