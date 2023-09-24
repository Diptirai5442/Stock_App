package com.example.stockAPP.Repo;

import com.example.stockAPP.Model.Stock;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StockRepo extends CrudRepository<Stock,Long> {

}
