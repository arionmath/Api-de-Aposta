package com.codex.aposta.service;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.modelmapper.ModelMapper;

import com.codex.aposta.model.Apostador;
import com.codex.aposta.model.dto.ApostadorIn;
import com.codex.aposta.repository.ApostadorRepository;

//@SpringBootTest //Unit tests doesn't need this
@ExtendWith(MockitoExtension.class)
public class ApostadorServiceTest {

	//@Autowired //Unit tests doesn't need this
	@InjectMocks
	private ApostadorService apostadorService;
	
	@Mock
	private ApostadorRepository apostadorMockRepository;
	
	@Mock
	private ModelMapper modelMapperMock;	

	private ApostadorIn apostadorIn;

	@BeforeEach
	void SetUp() {
		apostadorIn = new ApostadorIn("Bob", "bob@email.com");
	}

	@Test
	public void salvaApostador_true_if_new_id() {
		
		when(modelMapperMock.map(this.apostadorIn, Apostador.class))
		.thenReturn( new Apostador(null,this.apostadorIn.getNome(), this.apostadorIn.getEmail()));
		
		when(apostadorMockRepository.save( any(Apostador.class) ))
			.thenReturn( new Apostador(10L,this.apostadorIn.getNome(), this.apostadorIn.getEmail()));
		
		
		Assertions.assertNotNull( this.apostadorService.salvaApostador(this.apostadorIn).getId(),
				"The saved object must be with id not null!");
	}
	

}
