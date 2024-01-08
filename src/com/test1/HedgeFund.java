package com.test1;

public class HedgeFund {
	private long id;
	private String managedFunds;
	private String portfolioArchive;
	private String managedPortFolio;
	private String marketExposure;
	private String delicateBalance;
	private String maximizeReturn;
	private String marketBenchmark;
	private String bearerRisk;
	private String shorting;
	private String diverseFund;
	private String liquidity;
	private String portExpose;

	public HedgeFund() {

	}

	public HedgeFund(long id, String managedFunds, String portfolioArchive, String managedPortFolio,
			String marketExposure, String delicateBalance, String maximizeReturn, String marketBenchmark,
			String bearerRisk, String shorting, String diverseFund, String liquidity, String portExpose) {
		super();
		this.id = id;
		this.managedFunds = managedFunds;
		this.portfolioArchive = portfolioArchive;
		this.managedPortFolio = managedPortFolio;
		this.marketExposure = marketExposure;
		this.delicateBalance = delicateBalance;
		this.maximizeReturn = maximizeReturn;
		this.marketBenchmark = marketBenchmark;
		this.bearerRisk = bearerRisk;
		this.shorting = shorting;
		this.diverseFund = diverseFund;
		this.liquidity = liquidity;
		this.portExpose = portExpose;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getManagedFunds() {
		return managedFunds;
	}

	public void setManagedFunds(String managedFunds) {
		this.managedFunds = managedFunds;
	}

	public String getPortfolioArchive() {
		return portfolioArchive;
	}

	public void setPortfolioArchive(String portfolioArchive) {
		this.portfolioArchive = portfolioArchive;
	}

	public String getManagedPortFolio() {
		return managedPortFolio;
	}

	public void setManagedPortFolio(String managedPortFolio) {
		this.managedPortFolio = managedPortFolio;
	}

	public String getMarketExposure() {
		return marketExposure;
	}

	public void setMarketExposure(String marketExposure) {
		this.marketExposure = marketExposure;
	}

	public String getDelicateBalance() {
		return delicateBalance;
	}

	public void setDelicateBalance(String delicateBalance) {
		this.delicateBalance = delicateBalance;
	}

	public String getMaximizeReturn() {
		return maximizeReturn;
	}

	public void setMaximizeReturn(String maximizeReturn) {
		this.maximizeReturn = maximizeReturn;
	}

	public String getMarketBenchmark() {
		return marketBenchmark;
	}

	public void setMarketBenchmark(String marketBenchmark) {
		this.marketBenchmark = marketBenchmark;
	}

	public String getBearerRisk() {
		return bearerRisk;
	}

	public void setBearerRisk(String bearerRisk) {
		this.bearerRisk = bearerRisk;
	}

	public String getShorting() {
		return shorting;
	}

	public void setShorting(String shorting) {
		this.shorting = shorting;
	}

	public String getDiverseFund() {
		return diverseFund;
	}

	public void setDiverseFund(String diverseFund) {
		this.diverseFund = diverseFund;
	}

	public String getLiquidity() {
		return liquidity;
	}

	public void setLiquidity(String liquidity) {
		this.liquidity = liquidity;
	}

	public String getPortExpose() {
		return portExpose;
	}

	public void setPortExpose(String portExpose) {
		this.portExpose = portExpose;
	}

}
