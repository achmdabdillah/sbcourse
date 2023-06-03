package com.abdillah.catalog.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abdillah.catalog.domain.Publisher;

public interface PublisherRepository extends JpaRepository<Publisher, Long> {
    public Optional<Publisher> findBySecureId(String secureId);
}
