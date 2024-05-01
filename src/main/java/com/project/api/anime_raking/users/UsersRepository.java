package com.project.api.anime_raking.users;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<Users, String> {
    Users findByUsername(String username);
}
