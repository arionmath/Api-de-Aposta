package com.codex.aposta.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.codex.aposta.model.Aposta;

public interface ApostaRepository extends JpaRepository<Aposta, String> {

    @Query(value = "SELECT * FROM Aposta WHERE id_Apostador = ?", nativeQuery = true)
    List<Aposta> findByIdApostador(@Param("idApostador") Long idApostador);
}
