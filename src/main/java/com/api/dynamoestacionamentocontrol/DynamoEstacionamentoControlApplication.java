package com.api.dynamoestacionamentocontrol;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication

public class DynamoEstacionamentoControlApplication {

	public static void main(String[] args) {
		SpringApplication.run(DynamoEstacionamentoControlApplication.class, args);
	}

	@GetMapping("/")
	public String index() {
		return "Funcionando!";
	}

}
