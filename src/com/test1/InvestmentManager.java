package com.test1;

public class InvestmentManager {
	private long managerId;
	private String managerName;
	private String contact;
	private String fundNature;
	private String investorName;
	private String clientAgreement;
	private String PreValidation;
	private String processAcknowledgement;
	private String actualTransaction;

	public InvestmentManager() {

	}

	public InvestmentManager(long managerId, String managerName, String contact, String fundNature, String investorName,
			String clientAgreement, String preValidation, String processAcknowledgement, String actualTransaction) {
		super();
		this.managerId = managerId;
		this.managerName = managerName;
		this.contact = contact;
		this.fundNature = fundNature;
		this.investorName = investorName;
		this.clientAgreement = clientAgreement;
		PreValidation = preValidation;
		this.processAcknowledgement = processAcknowledgement;
		this.actualTransaction = actualTransaction;
	}

	public long getManagerId() {
		return managerId;
	}

	public void setManagerId(long managerId) {
		this.managerId = managerId;
	}

	public String getManagerName() {
		return managerName;
	}

	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getFundNature() {
		return fundNature;
	}

	public void setFundNature(String fundNature) {
		this.fundNature = fundNature;
	}

	public String getInvestorName() {
		return investorName;
	}

	public void setInvestorName(String investorName) {
		this.investorName = investorName;
	}

	public String getClientAgreement() {
		return clientAgreement;
	}

	public void setClientAgreement(String clientAgreement) {
		this.clientAgreement = clientAgreement;
	}

	public String getPreValidation() {
		return PreValidation;
	}

	public void setPreValidation(String preValidation) {
		PreValidation = preValidation;
	}

	public String getProcessAcknowledgement() {
		return processAcknowledgement;
	}

	public void setProcessAcknowledgement(String processAcknowledgement) {
		this.processAcknowledgement = processAcknowledgement;
	}

	public String getActualTransaction() {
		return actualTransaction;
	}

	public void setActualTransaction(String actualTransaction) {
		this.actualTransaction = actualTransaction;
	}

}
