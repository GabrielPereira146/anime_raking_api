package com.project.api.anime_raking.users;

import java.sql.Date;

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

    public Users(UsersRequestDTO data){
        this.username = data.username();
        this.date_birth = data.birth_Date();
        this.email = data.email();
        this.user_password = data.password(); 

    }
}
