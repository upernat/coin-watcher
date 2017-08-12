package coin.market.cap.business.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created on 17/07/17.
 *
 * @author urospernat
 */
public class Ticker {

    private String id;
    private String name;
    private String symbol;
    private String rank;
    private String price_usd;
    private String price_btc;
    private String market_cap_usd;
    private String available_supply;
    private String total_supply;
    private String percent_change_1h;
    private String percent_change_24h;
    private String percent_change_7d;
    private String last_updated;
    private String price_eur;
    private String market_cap_eur;

    @JsonProperty("24h_volume_usd")
    private String twentyfour_h_volume_usd;

    @JsonProperty("24h_volume_eur")
    private String twentyfour_h_volume_eur;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getPrice_usd() {
        return price_usd;
    }

    public void setPrice_usd(String price_usd) {
        this.price_usd = price_usd;
    }

    public String getPrice_btc() {
        return price_btc;
    }

    public void setPrice_btc(String price_btc) {
        this.price_btc = price_btc;
    }

    public String getMarket_cap_usd() {
        return market_cap_usd;
    }

    public void setMarket_cap_usd(String market_cap_usd) {
        this.market_cap_usd = market_cap_usd;
    }

    public String getAvailable_supply() {
        return available_supply;
    }

    public void setAvailable_supply(String available_supply) {
        this.available_supply = available_supply;
    }

    public String getTotal_supply() {
        return total_supply;
    }

    public void setTotal_supply(String total_supply) {
        this.total_supply = total_supply;
    }

    public String getPercent_change_1h() {
        return percent_change_1h;
    }

    public void setPercent_change_1h(String percent_change_1h) {
        this.percent_change_1h = percent_change_1h;
    }

    public String getPercent_change_24h() {
        return percent_change_24h;
    }

    public void setPercent_change_24h(String percent_change_24h) {
        this.percent_change_24h = percent_change_24h;
    }

    public String getPercent_change_7d() {
        return percent_change_7d;
    }

    public void setPercent_change_7d(String percent_change_7d) {
        this.percent_change_7d = percent_change_7d;
    }

    public String getLast_updated() {
        return last_updated;
    }

    public void setLast_updated(String last_updated) {
        this.last_updated = last_updated;
    }

    public String getPrice_eur() {
        return price_eur;
    }

    public void setPrice_eur(String price_eur) {
        this.price_eur = price_eur;
    }

    public String getMarket_cap_eur() {
        return market_cap_eur;
    }

    public void setMarket_cap_eur(String market_cap_eur) {
        this.market_cap_eur = market_cap_eur;
    }

    public String getTwentyfour_h_volume_usd() {
        return twentyfour_h_volume_usd;
    }

    public void setTwentyfour_h_volume_usd(String twentyfour_h_volume_usd) {
        this.twentyfour_h_volume_usd = twentyfour_h_volume_usd;
    }

    public String getTwentyfour_h_volume_eur() {
        return twentyfour_h_volume_eur;
    }

    public void setTwentyfour_h_volume_eur(String twentyfour_h_volume_eur) {
        this.twentyfour_h_volume_eur = twentyfour_h_volume_eur;
    }
}
