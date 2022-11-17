package com.api.dynamoestacionamentocontrol.model;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAutoGeneratedKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@DynamoDBTable(tableName = "vaga_estacionamento")
public class vagaEstacionamento {

	@DynamoDBHashKey
	@DynamoDBAutoGeneratedKey
	private String id;

	@DynamoDBAttribute
	private String vagaEstacionamentoNumero;

	@DynamoDBAttribute
	private String placaCarro;

	@DynamoDBAttribute
	private String marcaCarro;

	@DynamoDBAttribute
	private String modeloCarro;

	@DynamoDBAttribute
	private String corCarro;

	@DynamoDBAttribute
	private String responsavelNome;

	@DynamoDBAttribute
	private String apartamento;

	@DynamoDBAttribute
	private String bloco;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getVagaEstacionamentoNumero() {
		return vagaEstacionamentoNumero;
	}

	public void setVagaEstacionamentoNumero(String vagaEstacionamentoNumero) {
		this.vagaEstacionamentoNumero = vagaEstacionamentoNumero;
	}

	public String getPlacaCarro() {
		return placaCarro;
	}

	public void setPlacaCarro(String placaCarro) {
		this.placaCarro = placaCarro;
	}

	public String getMarcaCarro() {
		return marcaCarro;
	}

	public void setMarcaCarro(String marcaCarro) {
		this.marcaCarro = marcaCarro;
	}

	public String getModeloCarro() {
		return modeloCarro;
	}

	public void setModeloCarro(String modeloCarro) {
		this.modeloCarro = modeloCarro;
	}

	public String getCorCarro() {
		return corCarro;
	}

	public void setCorCarro(String corCarro) {
		this.corCarro = corCarro;
	}

	public String getResponsavelNome() {
		return responsavelNome;
	}

	public void setResponsavelNome(String responsavelNome) {
		this.responsavelNome = responsavelNome;
	}

	public String getApartamento() {
		return apartamento;
	}

	public void setApartamento(String apartamento) {
		this.apartamento = apartamento;
	}

	public String getBloco() {
		return bloco;
	}

	public void setBloco(String bloco) {
		this.bloco = bloco;
	}

}