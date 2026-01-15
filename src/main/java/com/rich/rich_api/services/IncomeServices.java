package com.rich.rich_api.services;

import java.util.List;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import com.rich.rich_api.dto.PaginationViewRequestDto;
import com.rich.rich_api.dto.SaveIncomeRequestDto;
import com.rich.rich_api.dto.ViewIncomeListResponseDto;
import com.rich.rich_api.model.Income;
import com.rich.rich_api.repository.IIncomeRepository;

@Service
public class IncomeServices 
{
    private final IIncomeRepository _incomeRepository;

    public IncomeServices(IIncomeRepository incomeRepository)
    {
        this._incomeRepository = incomeRepository;
    }    
    
    public Income saveIncome(SaveIncomeRequestDto saveIncomeRequestDto)
    {
        Income income = new Income();
        
        try
        {
            income.setAmount(saveIncomeRequestDto.getAmount());
            income.setDescription(saveIncomeRequestDto.getDescription());
            income.setLocalCreatedDate(saveIncomeRequestDto.getLocalDate());

            _incomeRepository.save(income);             
        }
        catch(Exception ex)
        {
            System.out.print(ex);
        }

        return income;
    }

    public List<ViewIncomeListResponseDto> getAllIncome(PaginationViewRequestDto paginationViewRequestDto)
    {
        int offset = paginationViewRequestDto.getPageNumber() * paginationViewRequestDto.getPageSize();
        
        List<ViewIncomeListResponseDto> incomeList = null;
        try
        {
                List<Object[]> incomeData = _incomeRepository.findIncomeWithPagination(
                paginationViewRequestDto.getStartDate(),
                paginationViewRequestDto.getEndDate(),
                paginationViewRequestDto.getPageSize(),
                offset  
            );

            incomeList = incomeData.stream().map(row -> 
                {
                    ViewIncomeListResponseDto incomeRow = new ViewIncomeListResponseDto();
                    incomeRow.setId(((Number)row[0]).intValue());                    
                    incomeRow.setAmount(((Double)row[3]));
                    incomeRow.setDescription((String)row[2]);
                    incomeRow.setLocalCreatedDate(row[4].toString());
                    incomeRow.setTotalRecords(((Number)row[5]).intValue());
                    incomeRow.setTotalAmount((Double)row[6]);
                    
                    return incomeRow;
                }
            ).toList();
        }
        catch(Exception ex)
        {
            System.out.print(ex);
        }

        return incomeList;
    }
}
