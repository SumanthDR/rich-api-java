package com.rich.rich_api.dto;

import java.time.LocalDate;
import com.rich.rich_api.model.Category;


public class SaveExpenseRequestDto 
{
    private Category category;
    private String description;
    private Double amount;
    private LocalDate localCreatedDate;     
        
    public Category getCategory() 
    {
        return category;
    }

    public void setCategory(Category category) 
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

    public Double getAmount() 
    {
        return amount;
    }
    
    public void setAmount(Double amount)
    {
        this.amount = amount;
    }

    public LocalDate getLocalCreatedDate()
    {
        return localCreatedDate;
    }
    
    public void setLocalCreatedDate(LocalDate createdLocalDate) 
    {
        this.localCreatedDate = createdLocalDate;
    }
}