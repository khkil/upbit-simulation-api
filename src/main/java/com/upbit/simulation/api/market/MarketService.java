package com.upbit.simulation.api.market;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;

@Service
public class MarketService {

    @Autowired
    WebClient webClient;

    public List<Market> getAllMarkets(){
        List<Market> allMarkets = webClient.get()
                .uri("/v1/market/all")
                .retrieve()
                .bodyToMono(List.class).block();

        return allMarkets;
    }

}
