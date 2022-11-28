package com.example.a2018024_tugasapi;

public class ResultsItem{
	private String country;
	private String city;
	private String address1;
	private String reasonForRecall;
	private String address2;
	private String productQuantity;
	private String codeInfo;
	private String centerClassificationDate;
	private String distributionPattern;
	private String state;
	private String productDescription;
	private String reportDate;
	private String classification;
	private Openfda openfda;
	private String recallingFirm;
	private String recallNumber;
	private String initialFirmNotification;
	private String productType;
	private String eventId;
	private String terminationDate;
	private String moreCodeInfo;
	private String recallInitiationDate;
	private String postalCode;
	private String voluntaryMandated;
	private String status;

	public void setCountry(String country){
		this.country = country;
	}

	public String getCountry(){
		return country;
	}

	public void setCity(String city){
		this.city = city;
	}

	public String getCity(){
		return city;
	}

	public void setAddress1(String address1){
		this.address1 = address1;
	}

	public String getAddress1(){
		return address1;
	}

	public void setReasonForRecall(String reasonForRecall){
		this.reasonForRecall = reasonForRecall;
	}

	public String getReasonForRecall(){
		return reasonForRecall;
	}

	public void setAddress2(String address2){
		this.address2 = address2;
	}

	public String getAddress2(){
		return address2;
	}

	public void setProductQuantity(String productQuantity){
		this.productQuantity = productQuantity;
	}

	public String getProductQuantity(){
		return productQuantity;
	}

	public void setCodeInfo(String codeInfo){
		this.codeInfo = codeInfo;
	}

	public String getCodeInfo(){
		return codeInfo;
	}

	public void setCenterClassificationDate(String centerClassificationDate){
		this.centerClassificationDate = centerClassificationDate;
	}

	public String getCenterClassificationDate(){
		return centerClassificationDate;
	}

	public void setDistributionPattern(String distributionPattern){
		this.distributionPattern = distributionPattern;
	}

	public String getDistributionPattern(){
		return distributionPattern;
	}

	public void setState(String state){
		this.state = state;
	}

	public String getState(){
		return state;
	}

	public void setProductDescription(String productDescription){
		this.productDescription = productDescription;
	}

	public String getProductDescription(){
		return productDescription;
	}

	public void setReportDate(String reportDate){
		this.reportDate = reportDate;
	}

	public String getReportDate(){
		return reportDate;
	}

	public void setClassification(String classification){
		this.classification = classification;
	}

	public String getClassification(){
		return classification;
	}

	public void setOpenfda(Openfda openfda){
		this.openfda = openfda;
	}

	public Openfda getOpenfda(){
		return openfda;
	}

	public void setRecallingFirm(String recallingFirm){
		this.recallingFirm = recallingFirm;
	}

	public String getRecallingFirm(){
		return recallingFirm;
	}

	public void setRecallNumber(String recallNumber){
		this.recallNumber = recallNumber;
	}

	public String getRecallNumber(){
		return recallNumber;
	}

	public void setInitialFirmNotification(String initialFirmNotification){
		this.initialFirmNotification = initialFirmNotification;
	}

	public String getInitialFirmNotification(){
		return initialFirmNotification;
	}

	public void setProductType(String productType){
		this.productType = productType;
	}

	public String getProductType(){
		return productType;
	}

	public void setEventId(String eventId){
		this.eventId = eventId;
	}

	public String getEventId(){
		return eventId;
	}

	public void setTerminationDate(String terminationDate){
		this.terminationDate = terminationDate;
	}

	public String getTerminationDate(){
		return terminationDate;
	}

	public void setMoreCodeInfo(String moreCodeInfo){
		this.moreCodeInfo = moreCodeInfo;
	}

	public String getMoreCodeInfo(){
		return moreCodeInfo;
	}

	public void setRecallInitiationDate(String recallInitiationDate){
		this.recallInitiationDate = recallInitiationDate;
	}

	public String getRecallInitiationDate(){
		return recallInitiationDate;
	}

	public void setPostalCode(String postalCode){
		this.postalCode = postalCode;
	}

	public String getPostalCode(){
		return postalCode;
	}

	public void setVoluntaryMandated(String voluntaryMandated){
		this.voluntaryMandated = voluntaryMandated;
	}

	public String getVoluntaryMandated(){
		return voluntaryMandated;
	}

	public void setStatus(String status){
		this.status = status;
	}

	public String getStatus(){
		return status;
	}

	@Override
 	public String toString(){
		return 
			"ResultsItem{" + 
			"country = '" + country + '\'' + 
			",city = '" + city + '\'' + 
			",address_1 = '" + address1 + '\'' + 
			",reason_for_recall = '" + reasonForRecall + '\'' + 
			",address_2 = '" + address2 + '\'' + 
			",product_quantity = '" + productQuantity + '\'' + 
			",code_info = '" + codeInfo + '\'' + 
			",center_classification_date = '" + centerClassificationDate + '\'' + 
			",distribution_pattern = '" + distributionPattern + '\'' + 
			",state = '" + state + '\'' + 
			",product_description = '" + productDescription + '\'' + 
			",report_date = '" + reportDate + '\'' + 
			",classification = '" + classification + '\'' + 
			",openfda = '" + openfda + '\'' + 
			",recalling_firm = '" + recallingFirm + '\'' + 
			",recall_number = '" + recallNumber + '\'' + 
			",initial_firm_notification = '" + initialFirmNotification + '\'' + 
			",product_type = '" + productType + '\'' + 
			",event_id = '" + eventId + '\'' + 
			",termination_date = '" + terminationDate + '\'' + 
			",more_code_info = '" + moreCodeInfo + '\'' + 
			",recall_initiation_date = '" + recallInitiationDate + '\'' + 
			",postal_code = '" + postalCode + '\'' + 
			",voluntary_mandated = '" + voluntaryMandated + '\'' + 
			",status = '" + status + '\'' + 
			"}";
		}
}
