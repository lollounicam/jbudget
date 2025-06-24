package it.unicam.cs.mpgc.jbudget119163.Balance;

import it.unicam.cs.mpgc.jbudget119163.Model.Category;
import it.unicam.cs.mpgc.jbudget119163.Model.Type;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

public class Movement {

    private final UUID id;
    private final BigDecimal amount;
    private final String description;
    private final LocalDate date;
    private final Category category;
    private final Type type;

    // Lista statica per raccogliere tutti i movimenti
    private static final List<Movement> MOVEMENTS = new ArrayList<>();

    public Movement(UUID id, BigDecimal amount, String description, LocalDate date, Category category, Type type) {
        this.id = id;
        this.amount = amount;
        this.description = description;
        this.date = date;
        checkDate(this.date);
        this.category = category;
        this.type = type;
        MOVEMENTS.add(this);
    }

    public static List<Movement> getAll() {
        return Collections.unmodifiableList(MOVEMENTS); // sicurezza: lista non modificabile
    }

    public UUID getId() {
        return id;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public String getDescription() {
        return description;
    }

    public LocalDate getDate() {
        return date;
    }

    public Category getCategory() {
        return category;
    }

    public Type getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Movement{" +
                "id=" + id +
                ", amount=" + amount +
                ", description='" + description + '\'' +
                ", date=" + date +
                ", category=" + category +
                ", type=" + type +
                '}';
    }

    // Gestione date
    private void checkDate(LocalDate date) {
        if (date.isAfter(LocalDate.now())) {
            System.out.println("Date is after today");
        } else if (date.isBefore(LocalDate.now())) {
            System.out.println("Date is before today");
        } else {
            System.out.println("Date is today");
        }
    }
}
