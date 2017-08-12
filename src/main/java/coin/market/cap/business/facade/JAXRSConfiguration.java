package coin.market.cap.business.facade;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

/**
 * Created on 12/08/17.
 *
 * @author urospernat
 */
@ApplicationPath("resources")
public class JAXRSConfiguration extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> s = new HashSet<Class<?>>();
        s.add(WatcherResource.class);
        return s;
    }
}
