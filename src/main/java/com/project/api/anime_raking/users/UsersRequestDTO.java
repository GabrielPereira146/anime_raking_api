package com.project.api.anime_raking.users;

import java.sql.Date;

public record UsersRequestDTO(String username, Date birth_Date, String email, String password) {

}
