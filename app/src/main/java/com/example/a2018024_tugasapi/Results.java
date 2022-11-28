package com.example.a2018024_tugasapi;

public class Results{
	private int total;
	private int limit;
	private int skip;

	public void setTotal(int total){
		this.total = total;
	}

	public int getTotal(){
		return total;
	}

	public void setLimit(int limit){
		this.limit = limit;
	}

	public int getLimit(){
		return limit;
	}

	public void setSkip(int skip){
		this.skip = skip;
	}

	public int getSkip(){
		return skip;
	}

	@Override
 	public String toString(){
		return 
			"Results{" + 
			"total = '" + total + '\'' + 
			",limit = '" + limit + '\'' + 
			",skip = '" + skip + '\'' + 
			"}";
		}
}
