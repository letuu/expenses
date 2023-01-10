package pro.sky.expenses.entity;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Objects;

@Entity
@Table(name = "expensesDB")
public class Expense {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private LocalDate data;
    private String category;
    private Integer amount;

    public Expense() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Expense expense = (Expense) o;
//        return Objects.equals(id, expense.id);    //оригинал, проверял - это равнозначно как у автора, здесь сравниваются тоже null - проверял в ExpensesApplicationTests
//        return id != null ? Objects.equals(id, expense.id) : expense.id == null;    //возможно надо так - нет, это излишнк
        return id != null ? id.equals(expense.id) : expense.id == null;   //у автора - здесь предупреждение
    }

    @Override
    public int hashCode() {
//        return Objects.hash(id);  //оригинал
        return id != null ? id.hashCode() : 0;
    }
}
