package com.test1;

public class MarketMaker {
	private long firmId;
	private String firmName;
	private String contract;
	private String bids;
	private String offers;
	private String tradingFee;
	private String tradeEcosystem;
	private String largerTransaction;
	private String commonTranscation;

	public MarketMaker() {

	}

	public MarketMaker(long firmId, String firmName, String contract, String bids, String offers, String tradingFee,
			String tradeEcosystem, String largerTransaction, String commonTranscation) {
		super();
		this.firmId = firmId;
		this.firmName = firmName;
		this.contract = contract;
		this.bids = bids;
		this.offers = offers;
		this.tradingFee = tradingFee;
		this.tradeEcosystem = tradeEcosystem;
		this.largerTransaction = largerTransaction;
		this.commonTranscation = commonTranscation;
	}

	public long getFirmId() {
		return firmId;
	}

	public void setFirmId(long firmId) {
		this.firmId = firmId;
	}

	public String getFirmName() {
		return firmName;
	}

	public void setFirmName(String firmName) {
		this.firmName = firmName;
	}

	public String getContract() {
		return contract;
	}

	public void setContract(String contract) {
		this.contract = contract;
	}

	public String getBids() {
		return bids;
	}

	public void setBids(String bids) {
		this.bids = bids;
	}

	public String getOffers() {
		return offers;
	}

	public void setOffers(String offers) {
		this.offers = offers;
	}

	public String getTradingFee() {
		return tradingFee;
	}

	public void setTradingFee(String tradingFee) {
		this.tradingFee = tradingFee;
	}

	public String getTradeEcosystem() {
		return tradeEcosystem;
	}

	public void setTradeEcosystem(String tradeEcosystem) {
		this.tradeEcosystem = tradeEcosystem;
	}

	public String getLargerTransaction() {
		return largerTransaction;
	}

	public void setLargerTransaction(String largerTransaction) {
		this.largerTransaction = largerTransaction;
	}

	public String getCommonTranscation() {
		return commonTranscation;
	}

	public void setCommonTranscation(String commonTranscation) {
		this.commonTranscation = commonTranscation;
	}

}
