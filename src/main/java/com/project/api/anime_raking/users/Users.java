package com.project.api.anime_raking.users;

import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Table(name = "users")
@Entity(name = "users")

@Data
@NoArgsConstructor
@AllArgsConstructor

@EqualsAndHashCode(of = "username")
public class Users {

    @Id
    private String username;

    private Date date_birth;
    private String email;
    private String user_password;

    public Users(UsersRequestDTO data) throws ParseException {
        this.username = data.username();
        this.date_birth = converDate(data.date_birth());
        this.email = data.email();
        this.user_password = data.password();
    }

    private java.sql.Date converDate(String dateString) throws ParseException {
        DateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
        java.sql.Date date = new java.sql.Date(fmt.parse(dateString).getTime());
        return date;
    }

}
