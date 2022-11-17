package com.api.dynamoestacionamentocontrol.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBSaveExpression;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBScanExpression;
import com.amazonaws.services.dynamodbv2.model.AttributeValue;
import com.amazonaws.services.dynamodbv2.model.ExpectedAttributeValue;
import com.api.dynamoestacionamentocontrol.model.vagaEstacionamento;

@Service
public class vagaEstacionamentoService {

	@Autowired
	private DynamoDBMapper dynamoDBMapper;

	public vagaEstacionamento save(vagaEstacionamento vagaEstacionamento) {
		dynamoDBMapper.save(vagaEstacionamento);
		return vagaEstacionamento;
	}

	public String delete(String id) {
		vagaEstacionamento emp = dynamoDBMapper.load(vagaEstacionamento.class, id);
		dynamoDBMapper.delete(emp);
		return "Vaga Deleteda!";
	}

	public String update(String id, vagaEstacionamento vagaEstacionamento) {
		dynamoDBMapper.save(vagaEstacionamento, new DynamoDBSaveExpression().withExpectedEntry("id",
				new ExpectedAttributeValue(new AttributeValue().withS(id))));
		return "Vaga Atualizada!";
	}

	public List<vagaEstacionamento> findAll() {
		return dynamoDBMapper.scan(vagaEstacionamento.class, new DynamoDBScanExpression());
	}

}
