package com.project.api.anime_raking.works.manga;

public record MangaResponseDTO(String title, String cover, String releaseDate, String synopsis, String author,
        Float averageGrade,String status, int volumes) {

    public MangaResponseDTO(Manga manga) {
        this(manga.getTitle(), manga.getCover(), manga.getReleaseDate().toString(), manga.getSynopsis(),
                manga.getAuthor(), manga.getAverageGrade(),manga.getStatus(), manga.getVolumes());

    }

}
