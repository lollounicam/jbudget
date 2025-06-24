package it.unicam.cs.mpgc.jbudget119163.App;

import it.unicam.cs.mpgc.jbudget119163.Balance.Balance;
import it.unicam.cs.mpgc.jbudget119163.Balance.Movement;
import it.unicam.cs.mpgc.jbudget119163.Model.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class App {
    private final Budget budget = new Budget(BigDecimal.ZERO);
    public void run(){
        new Movement(UUID.randomUUID(),
                BigDecimal.valueOf(10_000),
                "Stipendio",
                LocalDate.now(),
                Category.LAVORO,
                Type.IN);

        // Eventuale altro movimento di spesa
        new Movement(UUID.randomUUID(),
                BigDecimal.valueOf(250),
                "Bolletta luce",
                LocalDate.now().minusDays(2),
                Category.SVAGO,
                Type.OUT);


        Balance balance = new Balance();

        balance.updateBalance(budget, Movement.getAll());
        System.out.println("Balance: " + budget.getAmount());
    }


}
