package com.upbit.simulation.api.candle;

import com.upbit.simulation.api.market.Market;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;

@Service
public class CandleService {

    @Autowired
    WebClient webClient;

    public List<Candle> getCandlesPerMinutes(int minute, Candle candle){
        List<Candle> candlesPerMinutes = webClient.get()
                .uri(uriBuilder -> uriBuilder
                        .path("/v1/candles/minutes/" + minute)
                        .queryParam("market", candle.getMarket())
                        .queryParam("count", candle.getCount())
                        .build())
                .retrieve()
                .bodyToMono(List.class).block();

        return candlesPerMinutes;
    }

}
