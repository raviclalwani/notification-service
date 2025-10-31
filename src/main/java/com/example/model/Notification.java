package com.example.model;


import jakarta.persistence.*;
import java.math.BigDecimal;


@Entity
public class Notification {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String budgetCategory;
    private BigDecimal budgetAmount;
    private String expenseDescription;
    private BigDecimal expenseAmount;
    private String time; // ISO timestamp


// getters setters
}