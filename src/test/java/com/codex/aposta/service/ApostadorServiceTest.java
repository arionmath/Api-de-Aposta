package com.codex.aposta.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.codex.aposta.model.dto.ApostadorIn;

@SpringBootTest
public class ApostadorServiceTest {

	@Autowired
	private ApostadorService apostadorService;

	private ApostadorIn apostador;

	@BeforeEach
	void SetUp() {
		apostador = new ApostadorIn("Bob", "bob@email.com");
	}

	@Test
	public void salvaApostador_true_if_new_id() {
		Assertions.assertNotNull(this.apostadorService.salvaApostador(apostador).getId(),
				"The saved object must be with id not null!");
	}
	

}
