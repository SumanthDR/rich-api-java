package com.rich.rich_api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rich.rich_api.dto.PaginationViewRequestDto;
import com.rich.rich_api.dto.SaveIncomeRequestDto;
import com.rich.rich_api.dto.ViewIncomeListResponseDto;
import com.rich.rich_api.model.Income;
import com.rich.rich_api.services.IncomeServices;

@RestController
@RequestMapping("api/income")
public class IncomeController 
{
    
    @Autowired
    private IncomeServices incomeServices;

    @PostMapping("/save")   
    public Income saveIncome(@RequestBody SaveIncomeRequestDto incomeDto)
    {
        return incomeServices.saveIncome(incomeDto);
    }

    @PostMapping("/getAllIncome")
    public List<ViewIncomeListResponseDto> getAllIncome(@RequestBody PaginationViewRequestDto paginationViewRequestDto)
    {
        return incomeServices.getAllIncome(paginationViewRequestDto);
    }
}