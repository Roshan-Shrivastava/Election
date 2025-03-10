package com.Election.vote.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.Election.vote.LogEntity.LoginEntity;

import java.util.Optional;

public interface LoginRepository extends JpaRepository<LoginEntity, Long> {
    Optional<LoginEntity> findByVoterId(String voterId);
}
