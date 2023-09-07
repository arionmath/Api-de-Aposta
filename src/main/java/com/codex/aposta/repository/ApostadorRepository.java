package com.codex.aposta.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codex.aposta.model.Apostador;

public interface ApostadorRepository extends JpaRepository<Apostador, Long> {
}
