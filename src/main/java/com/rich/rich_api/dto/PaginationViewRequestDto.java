package com.rich.rich_api.dto;

import java.time.LocalDate;

public class PaginationViewRequestDto 
{
    private int pageNumber;
    private int pageSize;

    private LocalDate startDate;
    private LocalDate endDate;
    
    public int getPageNumber() 
    {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) 
    {
        this.pageNumber = pageNumber;
    }

    public int getPageSize() 
    {
        return pageSize;
    }

    public void setPageSize(int pageSize)
    {
        this.pageSize = pageSize;
    }

    public LocalDate getStartDate() 
    {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) 
    {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() 
    {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) 
    {
        this.endDate = endDate;
    }
}