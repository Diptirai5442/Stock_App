package com.example.stockAPP.Service;

import com.example.stockAPP.Model.Stock;
import com.example.stockAPP.Repo.StockRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StockService {
    @Autowired
    StockRepo stockRepo;

    public String addStocks(List<Stock> newStocks) {
        stockRepo.saveAll(newStocks);
        return "added";
    }
}
