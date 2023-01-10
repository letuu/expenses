package pro.sky.expenses.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pro.sky.expenses.entity.Expense;
import pro.sky.expenses.entity.ExpenseByCategory;

import java.util.List;

@Repository
public interface ExpenseRepository extends JpaRepository<Expense, Integer> {

    @Query(value = "SELECT category, SUM(amount) AS amount FROM expensesdb GROUP BY category", nativeQuery = true)
    List<ExpenseByCategory> getExpensesByCategory();
}
