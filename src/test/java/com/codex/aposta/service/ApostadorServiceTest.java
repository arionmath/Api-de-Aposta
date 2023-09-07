package com.codex.aposta.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.codex.aposta.model.Apostador;
import com.codex.aposta.model.dto.ApostadorIn;

@SpringBootTest
public class ApostadorServiceTest {

	@Autowired
	ApostadorService apostadorService;

	@Test
	public void salvaApostador_true_if_new_id() {
		ApostadorIn apostador = new ApostadorIn("Bob", "bob@email.com");
		Apostador idEntity = this.apostadorService.salvaApostador(apostador);
		
		Assertions.assertNotNull(idEntity.getId(), "The saved object must be with id not null!");
	}
}
