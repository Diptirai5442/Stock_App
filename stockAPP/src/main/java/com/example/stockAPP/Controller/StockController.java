package com.example.stockAPP.Controller;

import com.example.stockAPP.Model.Stock;
import com.example.stockAPP.Service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StockController {
    @Autowired
    StockService stockService;
    @PostMapping
    public String addStocks(@RequestBody List<Stock> newStocks){
        return stockService.addStocks(newStocks);
    }
}
