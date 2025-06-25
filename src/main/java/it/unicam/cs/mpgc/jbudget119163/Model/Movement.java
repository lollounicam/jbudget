package it.unicam.cs.mpgc.jbudget119163.Model;

import it.unicam.cs.mpgc.jbudget119163.interfaces.MovementInterface;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

public class Movement implements MovementInterface {

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
        checkDate();
        this.category = category;
        this.type = type;
        MOVEMENTS.add(this);
    }

    @Override
    public Type getType(){
        return type;
    }
    @Override
    public BigDecimal getAmount(){
        return amount;
    }

    public static List<Movement> getAll() {
        return Collections.unmodifiableList(MOVEMENTS);
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

    @Override
    public void checkDate() {
        if (date.isAfter(LocalDate.now())) {
            System.out.println("Date is after today");
        } else if (date.isBefore(LocalDate.now())) {
            System.out.println("Date is before today");
        } else {
            System.out.println("Date is today");
        }
    }


}
