package code.shubham.models;

import code.shubham.ILoadBalancer;
import code.shubham.LoadBalancer;
import code.shubham.strategies.ILoadBalanceStrategy;

import java.util.Optional;

public class Backend implements ILoadBalancer {

    private String name;
    private final ILoadBalancer loadBalancer;

    public Backend(String name, int maxServers, ILoadBalanceStrategy loadBalanceStrategy) {
        this.name = name;
        this.loadBalancer = new LoadBalancer(maxServers, loadBalanceStrategy);
    }

    @Override
    public boolean register(Server server) {
        return this.loadBalancer.register(server);
    }

    @Override
    public Server get(Optional<String> key) {
        return this.loadBalancer.get(key);
    }
}
