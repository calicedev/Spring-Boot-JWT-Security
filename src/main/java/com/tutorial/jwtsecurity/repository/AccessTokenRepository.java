package com.tutorial.jwtsecurity.repository;

import com.tutorial.jwtsecurity.entity.AccessToken;
import com.tutorial.jwtsecurity.entity.RefreshToken;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AccessTokenRepository extends JpaRepository<AccessToken, Long> {
    Optional<AccessToken> findByKey(String key);
}
