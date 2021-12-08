package com.ebix.rest;

import java.io.Serializable;
import java.util.List;

public class Listagem implements Serializable{

	private String searchType;
	private String expression;
	private List<Filme> results;
	private String errorMessage;
	
	public String getSearchType() {
		return searchType;
	}
	public void setSearchType(String searchType) {
		this.searchType = searchType;
	}
	public String getExpression() {
		return expression;
	}
	public void setExpression(String expression) {
		this.expression = expression;
	}
	public List<Filme> getResults() {
		return results;
	}
	public void setResults(List<Filme> results) {
		this.results = results;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	@Override
	public String toString() {
		return "Listagem [searchType=" + searchType + ", expression=" + expression + ", results=" + results
				+ ", errorMessage=" + errorMessage + "]";
	}
	
	
}
