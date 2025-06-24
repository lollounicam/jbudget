package it.unicam.cs.mpgc.jbudget119163.Model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

public class Movement {
    UUID id;
    BigDecimal amount;
    String description;
    LocalDate date;

    public Movement(UUID id, BigDecimal amount, String description, LocalDate date) {
        this.id = id;
        this.amount = amount;
        this.description = description;
        this.date = date;
    }

    @Override
    public String toString() {
        return "Movement{" +
                "id=" + id +
                ", amount=" + amount +
                ", description='" + description + '\'' +
                ", date=" + date +
                '}';
    }
}
