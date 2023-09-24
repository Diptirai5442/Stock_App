package com.example.stockAPP.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Stock {
    @Id
    private Long stockId;
    private String stockName;
    private double stockPrice;
    private int stockOwnerCount;
    private Type stockType;
    private LocalDateTime stockCreationTimeStamp;
}
