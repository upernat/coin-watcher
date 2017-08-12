package coin.market.cap.business.service;

import coin.market.cap.business.entity.Ticker;

import javax.annotation.PostConstruct;
import javax.ejb.Stateless;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * Created on 17/07/17.
 *
 * @author urospernat
 */
@Stateless
public class BitCoinService {

    private WebTarget coinMarketCap;

    @PostConstruct
    private void init() {
        Client client = ClientBuilder.newClient();
        coinMarketCap = client.target("https://api.coinmarketcap.com/v1/ticker/bitcoin/?convert=EUR");

    }

    public Ticker getBitcoinFromMarket() {
        List<Ticker> tickers = coinMarketCap.request(MediaType.APPLICATION_JSON)
                .get(new GenericType<List<Ticker>>() {});
        return tickers.get(0);
    }
}
