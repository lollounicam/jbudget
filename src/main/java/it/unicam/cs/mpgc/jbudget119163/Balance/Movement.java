package it.unicam.cs.mpgc.jbudget119163.Balance;

import it.unicam.cs.mpgc.jbudget119163.Model.Category;
import it.unicam.cs.mpgc.jbudget119163.Model.Type;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

public class Movement {
    UUID id;
    public BigDecimal amount;
    String description;
    static LocalDate date;
    Category category;
    public Type type;

    public Movement(UUID id, BigDecimal amount, String description, LocalDate date, Category category, Type type) {
        this.id = id;
        this.amount = amount;
        this.description = description;
        Movement.date = date;
        checkDate(Movement.date);
        this.category = category;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Movement{" +
                "id=" + id +
                ", amount=" + amount +
                ", description='" + description + '\'' +
                ", date=" + date +
                ", category=" + category +
                '}';
    }
    //Da implementare il metodo che gestisce i movimenti post datati e pre datati
    private void checkDate(LocalDate date) {
        if (date.isAfter(LocalDate.now())) {
            System.out.println("Date is after date");
        } else if (date.isBefore(LocalDate.now())) {
            System.out.println("Date is before date");
        } else if  (date.isEqual(date)) {
            System.out.println("Date is equal");
        }else {
            throw new IllegalArgumentException("Invalid date");
        }
    }
}
