package com.example.a2018024_tugasapi;

import java.util.List;

public class Foodpojo{
	private Meta meta;
	private List<ResultsItem> results;

	public void setMeta(Meta meta){
		this.meta = meta;
	}

	public Meta getMeta(){
		return meta;
	}

	public void setResults(List<ResultsItem> results){
		this.results = results;
	}

	public List<ResultsItem> getResults(){
		return results;
	}

	@Override
 	public String toString(){
		return 
			"Foodpojo{" + 
			"meta = '" + meta + '\'' + 
			",results = '" + results + '\'' + 
			"}";
		}
}