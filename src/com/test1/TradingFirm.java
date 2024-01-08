package com.test1;

public class TradingFirm {
	private String propShop;
	private String profiltAsDirect;
	private String traderActivity;
	private String marketPlace;
	private Integer tradesPerDay;
	private String onlineMarket;
	private String strategy;
	private String researchStrategy;
	private String instByLarge;
	private String instByGrp;

	public TradingFirm() {

	}

	public TradingFirm(String propShop, String profiltAsDirect, String traderActivity, String marketPlace,
			Integer tradesPerDay, String onlineMarket, String strategy, String researchStrategy, String instByLarge,
			String instByGrp) {
		super();
		this.propShop = propShop;
		this.profiltAsDirect = profiltAsDirect;
		this.traderActivity = traderActivity;
		this.marketPlace = marketPlace;
		this.tradesPerDay = tradesPerDay;
		this.onlineMarket = onlineMarket;
		this.strategy = strategy;
		this.researchStrategy = researchStrategy;
		this.instByLarge = instByLarge;
		this.instByGrp = instByGrp;
	}

	public String getPropShop() {
		return propShop;
	}

	public void setPropShop(String propShop) {
		this.propShop = propShop;
	}

	public String getProfiltAsDirect() {
		return profiltAsDirect;
	}

	public void setProfiltAsDirect(String profiltAsDirect) {
		this.profiltAsDirect = profiltAsDirect;
	}

	public String getTraderActivity() {
		return traderActivity;
	}

	public void setTraderActivity(String traderActivity) {
		this.traderActivity = traderActivity;
	}

	public String getMarketPlace() {
		return marketPlace;
	}

	public void setMarketPlace(String marketPlace) {
		this.marketPlace = marketPlace;
	}

	public Integer getTradesPerDay() {
		return tradesPerDay;
	}

	public void setTradesPerDay(Integer tradesPerDay) {
		this.tradesPerDay = tradesPerDay;
	}

	public String getOnlineMarket() {
		return onlineMarket;
	}

	public void setOnlineMarket(String onlineMarket) {
		this.onlineMarket = onlineMarket;
	}

	public String getStrategy() {
		return strategy;
	}

	public void setStrategy(String strategy) {
		this.strategy = strategy;
	}

	public String getResearchStrategy() {
		return researchStrategy;
	}

	public void setResearchStrategy(String researchStrategy) {
		this.researchStrategy = researchStrategy;
	}

	public String getInstByLarge() {
		return instByLarge;
	}

	public void setInstByLarge(String instByLarge) {
		this.instByLarge = instByLarge;
	}

	public String getInstByGrp() {
		return instByGrp;
	}

	public void setInstByGrp(String instByGrp) {
		this.instByGrp = instByGrp;
	}

}
