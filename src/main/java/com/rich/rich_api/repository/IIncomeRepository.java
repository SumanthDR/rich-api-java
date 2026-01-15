package com.rich.rich_api.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.rich.rich_api.model.Income;

public interface IIncomeRepository extends JpaRepository<Income, Long>
{
    @Query(value = "SELECT id, category, description, amount, local_created_date,"
                   + " COUNT(id) OVER() AS total_records,"
                   + " SUM(amount) OVER() AS total_amount"
                   + " FROM expense WHERE local_created_date BETWEEN"
                   + " :startDate AND :endDate  ORDER BY local_created_date DESC"
                   + " LIMIT :pageSize OFFSET :offset", nativeQuery = true)
    
    List<Object[]> findIncomeWithPagination(
        @Param("startDate") LocalDate startDate,
        @Param("endDate") LocalDate endDate,
        @Param("pageSize") int pageSize,
        @Param("offset") int offset
    );
}