package com.codex.aposta.controller;

import com.codex.aposta.model.dto.ApostadorIn;
import com.codex.aposta.service.ApostadorService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

import static org.springframework.http.HttpStatus.CREATED;

@RequiredArgsConstructor
@RestController
@RequestMapping("/apostador")
public class ApostadorController {

    private final ApostadorService apostadorService;

    @PostMapping
    public ResponseEntity<Object> salvarApostador(@Valid @RequestBody ApostadorIn apostadorIn) {
        apostadorService.salvaApostador(apostadorIn);

        return ResponseEntity.status(CREATED).build();
    }
}
