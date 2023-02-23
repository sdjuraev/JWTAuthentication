package com.example.jwtauthentication.models;

import org.springframework.data.jpa.repository.JpaRepository;


import java.util.Optional;

public interface UserInfoRepository extends JpaRepository<UserInfo, Long> {
Optional<Role> findByRoles(Erole name);
}