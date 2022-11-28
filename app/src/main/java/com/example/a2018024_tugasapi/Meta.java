package com.example.a2018024_tugasapi;

public class Meta{
	private String license;
	private String lastUpdated;
	private String terms;
	private Results results;
	private String disclaimer;

	public void setLicense(String license){
		this.license = license;
	}

	public String getLicense(){
		return license;
	}

	public void setLastUpdated(String lastUpdated){
		this.lastUpdated = lastUpdated;
	}

	public String getLastUpdated(){
		return lastUpdated;
	}

	public void setTerms(String terms){
		this.terms = terms;
	}

	public String getTerms(){
		return terms;
	}

	public void setResults(Results results){
		this.results = results;
	}

	public Results getResults(){
		return results;
	}

	public void setDisclaimer(String disclaimer){
		this.disclaimer = disclaimer;
	}

	public String getDisclaimer(){
		return disclaimer;
	}

	@Override
 	public String toString(){
		return 
			"Meta{" + 
			"license = '" + license + '\'' + 
			",last_updated = '" + lastUpdated + '\'' + 
			",terms = '" + terms + '\'' + 
			",results = '" + results + '\'' + 
			",disclaimer = '" + disclaimer + '\'' + 
			"}";
		}
}
