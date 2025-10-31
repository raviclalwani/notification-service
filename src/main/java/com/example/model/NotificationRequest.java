package com.example.model;

public class NotificationRequest {
    private String budgetCategory;
    private Double budgetAmount;
    private String expenseDescription;
    private Double expenseAmount;

    public NotificationRequest(String budgetCategory, Double budgetAmount, String expenseDescription, Double expenseAmount) {
        this.budgetCategory = budgetCategory;
        this.budgetAmount = budgetAmount;
        this.expenseDescription = expenseDescription;
        this.expenseAmount = expenseAmount;
    }

    public String getBudgetCategory() {
        return budgetCategory;
    }

    public void setBudgetCategory(String budgetCategory) {
        this.budgetCategory = budgetCategory;
    }

    public Double getBudgetAmount() {
        return budgetAmount;
    }

    public void setBudgetAmount(Double budgetAmount) {
        this.budgetAmount = budgetAmount;
    }

    public String getExpenseDescription() {
        return expenseDescription;
    }

    public void setExpenseDescription(String expenseDescription) {
        this.expenseDescription = expenseDescription;
    }

    public Double getExpenseAmount() {
        return expenseAmount;
    }

    public void setExpenseAmount(Double expenseAmount) {
        this.expenseAmount = expenseAmount;
    }
}
