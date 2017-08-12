package coin.market.cap.business.facade;

import coin.market.cap.business.service.BitCoinService;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Created on 17/07/17.
 *
 * @author urospernat
 */
@Path("status")
public class WatcherResource {

    @Inject
    private BitCoinService bitCoinService;

    @GET
    public Response latestStatus() {
        return Response
                .ok(bitCoinService.getBitcoinFromMarket(), MediaType.APPLICATION_JSON_TYPE)
                .build();
    }
}
