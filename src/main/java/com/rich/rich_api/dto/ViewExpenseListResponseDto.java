package com.rich.rich_api.dto;

public class ViewExpenseListResponseDto 
{
    private int id;
    private String category;
    private String description;
    private double amount;
    private String localCreatedDate;
    private long totalRecords;

    public int getId() 
    {
        return id;
    }
    public void setId(int id) 
    {
        this.id = id;
    }
    public String getCategory() 
    {
        return category;
    }
    public void setCategory(String category) 
    {
        this.category = category;
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
}