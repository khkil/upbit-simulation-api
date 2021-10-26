package com.upbit.simulation.api.market;

import com.upbit.simulation.api.market.model.Market;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/api/market")
public class MarketRestController {

    @Autowired
    MarketService marketService;

    @GetMapping("")
    public ResponseEntity allMarkets(){
        List<Market> allMarkets = marketService.getAllMarkets();

        return ResponseEntity.ok(allMarkets);
    }


}
