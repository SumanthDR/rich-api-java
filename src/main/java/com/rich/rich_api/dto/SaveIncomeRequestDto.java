package com.rich.rich_api.dto;

import java.time.LocalDate;

public class SaveIncomeRequestDto 
{       
    private Double amount;
    private String description;
    private LocalDate localDate;
    
    public void setAmount(Double amount)
    {
        this.amount = amount;
    }

    public Double getAmount()
    {
        return amount;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public String getDescription()
    {
        return description;
    }

    public void setLocalDate(LocalDate localDate)
    {
        this.localDate = localDate;
    }

    public LocalDate getLocalDate()
    {
        return localDate;
    }
}