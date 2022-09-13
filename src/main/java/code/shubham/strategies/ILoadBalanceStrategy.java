package code.shubham.strategies;

import code.shubham.models.Server;

import java.util.ArrayList;
import java.util.Optional;

public interface ILoadBalanceStrategy {
    Server get(ArrayList<Server> servers, Optional<String> key);
}
