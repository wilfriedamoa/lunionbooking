package com.lunionlab.booking.repository;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lunionlab.booking.models.RefreshTokenModel;

public interface RefreshTokenRepository extends JpaRepository<RefreshTokenModel, UUID> {
    Optional<RefreshTokenModel> findFirstByTokenAndDeleted(String token, Boolean deteted);
}
