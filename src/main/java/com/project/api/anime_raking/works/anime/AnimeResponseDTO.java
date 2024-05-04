package com.project.api.anime_raking.works.anime;

public record AnimeResponseDTO(String title, String cover, String releaseDate, String synopsis, String author,
        Float averageGrade, int episodes) {

    public AnimeResponseDTO(Anime anime) {
        this(anime.getTitle(), anime.getCover(), anime.getReleaseDate().toString(), anime.getSynopsis(),
                anime.getAuthor(), anime.getAverageGrade(), anime.getEpisodes());

    }

}
