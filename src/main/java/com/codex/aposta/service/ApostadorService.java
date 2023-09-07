package com.codex.aposta.service;

import com.codex.aposta.model.Apostador;
import com.codex.aposta.model.dto.ApostadorIn;
import com.codex.aposta.repository.ApostadorRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

import java.util.Objects;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
@Log4j2
public class ApostadorService {

    private final ApostadorRepository apostadorRepository;
    private final ModelMapper modelMapper;

    public Apostador salvaApostador(ApostadorIn apostadorIn) {
    	Objects.requireNonNull(apostadorIn);
        Apostador apostador = modelMapper.map(apostadorIn, Apostador.class);
        apostador = apostadorRepository.save(apostador);
        log.debug(apostador);
        return apostador;
    }
}
