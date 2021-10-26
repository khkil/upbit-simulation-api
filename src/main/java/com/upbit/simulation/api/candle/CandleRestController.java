package com.upbit.simulation.api.candle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/candle")
public class CandleRestController {

    @Autowired
    CandleService candleService;

    @GetMapping("/minutes/{minute}")
    public ResponseEntity getCandlesPerMinutes(@PathVariable int minute, @RequestParam Candle candle){
        List<Candle> candlesPerMinutes = candleService.getCandlesPerMinutes(minute, candle);
        return ResponseEntity.ok(candlesPerMinutes);
    }


}
