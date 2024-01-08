package com.test1;

public class PortfolioManager {
	private long managerId;
	private String managerName;
	private String contact;
	private boolean hedgeAsset;
	private boolean investingAsset;
	private String capitalResource;
	private String tradeAction;
	private String exchangeFund;
	private String openEndFund;
	private String closeEndFund;
	private String investingFund;

	public PortfolioManager() {

	}

	public PortfolioManager(long managerId, String managerName, String contact, boolean hedgeAsset,
			boolean investingAsset, String capitalResource, String tradeAction, String exchangeFund, String openEndFund,
			String closeEndFund, String investingFund) {
		super();
		this.managerId = managerId;
		this.managerName = managerName;
		this.contact = contact;
		this.hedgeAsset = hedgeAsset;
		this.investingAsset = investingAsset;
		this.capitalResource = capitalResource;
		this.tradeAction = tradeAction;
		this.exchangeFund = exchangeFund;
		this.openEndFund = openEndFund;
		this.closeEndFund = closeEndFund;
		this.investingFund = investingFund;
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

	public boolean isHedgeAsset() {
		return hedgeAsset;
	}

	public void setHedgeAsset(boolean hedgeAsset) {
		this.hedgeAsset = hedgeAsset;
	}

	public boolean isInvestingAsset() {
		return investingAsset;
	}

	public void setInvestingAsset(boolean investingAsset) {
		this.investingAsset = investingAsset;
	}

	public String getCapitalResource() {
		return capitalResource;
	}

	public void setCapitalResource(String capitalResource) {
		this.capitalResource = capitalResource;
	}

	public String getTradeAction() {
		return tradeAction;
	}

	public void setTradeAction(String tradeAction) {
		this.tradeAction = tradeAction;
	}

	public String getExchangeFund() {
		return exchangeFund;
	}

	public void setExchangeFund(String exchangeFund) {
		this.exchangeFund = exchangeFund;
	}

	public String getOpenEndFund() {
		return openEndFund;
	}

	public void setOpenEndFund(String openEndFund) {
		this.openEndFund = openEndFund;
	}

	public String getCloseEndFund() {
		return closeEndFund;
	}

	public void setCloseEndFund(String closeEndFund) {
		this.closeEndFund = closeEndFund;
	}

	public String getInvestingFund() {
		return investingFund;
	}

	public void setInvestingFund(String investingFund) {
		this.investingFund = investingFund;
	}

}
