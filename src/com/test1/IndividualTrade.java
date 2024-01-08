package com.test1;

public class IndividualTrade {
	private long guestLoginId;
	private String guestLoginName;
	private String electronicTrade;
	private String riskManagement;
	private String tradeExecution;
	private String accessToMarket;
	private String fundsource;
	private String paymentSource;

	public IndividualTrade() {

	}

	public IndividualTrade(long guestLoginId, String guestLoginName, String electronicTrade, String riskManagement,
			String tradeExecution, String accessToMarket, String fundsource, String paymentSource) {
		super();
		this.guestLoginId = guestLoginId;
		this.guestLoginName = guestLoginName;
		this.electronicTrade = electronicTrade;
		this.riskManagement = riskManagement;
		this.tradeExecution = tradeExecution;
		this.accessToMarket = accessToMarket;
		this.fundsource = fundsource;
		this.paymentSource = paymentSource;
	}

	public long getGuestLoginId() {
		return guestLoginId;
	}

	public void setGuestLoginId(long guestLoginId) {
		this.guestLoginId = guestLoginId;
	}

	public String getGuestLoginName() {
		return guestLoginName;
	}

	public void setGuestLoginName(String guestLoginName) {
		this.guestLoginName = guestLoginName;
	}

	public String getElectronicTrade() {
		return electronicTrade;
	}

	public void setElectronicTrade(String electronicTrade) {
		this.electronicTrade = electronicTrade;
	}

	public String getRiskManagement() {
		return riskManagement;
	}

	public void setRiskManagement(String riskManagement) {
		this.riskManagement = riskManagement;
	}

	public String getTradeExecution() {
		return tradeExecution;
	}

	public void setTradeExecution(String tradeExecution) {
		this.tradeExecution = tradeExecution;
	}

	public String getAccessToMarket() {
		return accessToMarket;
	}

	public void setAccessToMarket(String accessToMarket) {
		this.accessToMarket = accessToMarket;
	}

	public String getFundsource() {
		return fundsource;
	}

	public void setFundsource(String fundsource) {
		this.fundsource = fundsource;
	}

	public String getPaymentSource() {
		return paymentSource;
	}

	public void setPaymentSource(String paymentSource) {
		this.paymentSource = paymentSource;
	}

}
