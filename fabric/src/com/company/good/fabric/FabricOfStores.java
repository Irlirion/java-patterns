package com.company.good.fabric;

public class FabricOfStores {
    protected static PizzaStore createStore(String type) {
        if (type.equals("NY")) {
            return new NYPizzaStore();
        } else if (type.equals("Chicago")) {
            return new ChicagoPizzaStore();
        } else return null;
    }
}
