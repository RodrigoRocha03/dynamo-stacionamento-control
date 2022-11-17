package com.api.dynamoestacionamentocontrol.controller;

import java.util.List;

import org.springframework.beans.BeanUtils;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.dynamoestacionamentocontrol.dto.vagaEstacionamentoDto;
import com.api.dynamoestacionamentocontrol.model.vagaEstacionamento;

import com.api.dynamoestacionamentocontrol.service.vagaEstacionamentoService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/vaga-estacionamento")
@Api(value = "Controle de Estacionamento API REST")
@CrossOrigin(origins = "*", maxAge = 3600)
public class vagaEstacionamentoController {

	final vagaEstacionamentoService vvagaEstacionamentoRepository;

	public vagaEstacionamentoController(vagaEstacionamentoService vvagaEstacionamentoRepository) {
		this.vvagaEstacionamentoRepository = vvagaEstacionamentoRepository;
	}

	@PostMapping
	@ApiOperation(value = "Cadastra uma vaga")
	public ResponseEntity<Object> saveVagaEstacionamento(@RequestBody vagaEstacionamentoDto vagaEstacionamentoDto) {
		var vagaestacionamento = new vagaEstacionamento();
		BeanUtils.copyProperties(vagaEstacionamentoDto, vagaestacionamento);
		return ResponseEntity.status(HttpStatus.CREATED).body(vvagaEstacionamentoRepository.save(vagaestacionamento));
	}

	@GetMapping()
	@ApiOperation(value = "Retorna a lista do cadastro de vagas")
	public ResponseEntity<List<vagaEstacionamento>> getAllVagaEstacionamento() {
		return ResponseEntity.status(HttpStatus.OK).body(vvagaEstacionamentoRepository.findAll());
	}

	@DeleteMapping
	@ApiOperation(value = "Deleta uma vaga")
	public String deleteVagaEstacionamento(String id) {
		return vvagaEstacionamentoRepository.delete(id);
	}

	@PutMapping
	@ApiOperation(value = "Atualiza uma vaga")
	public String updateVagaEstacionamento(String id, @RequestBody vagaEstacionamento vagaEstacionamento) {
		return vvagaEstacionamentoRepository.update(id, vagaEstacionamento);
	}

}
