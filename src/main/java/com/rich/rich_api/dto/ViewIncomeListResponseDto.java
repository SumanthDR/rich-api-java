package com.rich.rich_api.dto;

public class ViewIncomeListResponseDto 
{
    private int id;
    private String incomeType;
    private String description;
    private double amount;
    private String localCreatedDate;
    private long totalRecords;
    private double totalAmount;

    public int getId() 
    {
        return id;
    }

    public void setId(int id) 
    {
        this.id = id;
    }

    public String getIncomeType() 
    {
        return incomeType;
    }

    public void setIncomeType(String incomeType) 
    {
        this.incomeType = incomeType;
    }

    public String getDescription() 
    {
        return description;
    }

    public void setDescription(String description) 
    {
        this.description = description;
    }

    public double getAmount() 
    {
        return amount;
    }

    public void setAmount(double amount) 
    {
        this.amount = amount;
    }

    public String getLocalCreatedDate() 
    {
        return localCreatedDate;
    }

    public void setLocalCreatedDate(String localCreatedDate) 
    {
        this.localCreatedDate = localCreatedDate;
    }

    public long getTotalRecords() 
    {
        return totalRecords;
    }

    public void setTotalRecords(long totalRecords) 
    {
        this.totalRecords = totalRecords;
    }

    public double getTotalAmount()
    {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount)
    {
        this.totalAmount = totalAmount;
    }    
}