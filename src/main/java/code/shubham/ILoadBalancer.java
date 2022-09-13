package code.shubham;

import code.shubham.models.Server;

import java.util.Optional;

public interface ILoadBalancer {

    boolean register(Server server);
    Server get(Optional<String> key);

}
