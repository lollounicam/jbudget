package it.unicam.cs.mpgc.jbudget119163.App;

import it.unicam.cs.mpgc.jbudget119163.service.Balance;
import it.unicam.cs.mpgc.jbudget119163.Model.Movement;
import it.unicam.cs.mpgc.jbudget119163.Model.*;

import java.math.BigDecimal;
import java.time.LocalDate;
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

        new Movement(UUID.randomUUID(),
                BigDecimal.valueOf(250),
                "Bolletta luce",
                LocalDate.now().minusDays(2),
                Category.SVAGO,
                Type.OUT);

        new Movement(UUID.randomUUID(),
                BigDecimal.valueOf(1500),
                "Vendita vecchio computer",
                LocalDate.now().minusDays(10),
                Category.LAVORO,
                Type.IN);

        new Movement(UUID.randomUUID(),
                BigDecimal.valueOf(80),
                "Cena con amici",
                LocalDate.now().minusDays(5),
                Category.SVAGO,
                Type.OUT);

        new Movement(UUID.randomUUID(),
                BigDecimal.valueOf(300),
                "Riparazione auto",
                LocalDate.now().minusDays(3),
                Category.SVAGO,
                Type.OUT);

        new Movement(UUID.randomUUID(),
                BigDecimal.valueOf(2000),
                "Bonus annuale",
                LocalDate.now().minusDays(15),
                Category.LAVORO,
                Type.IN);

        new Movement(UUID.randomUUID(),
                BigDecimal.valueOf(50),
                "Abbonamento palestra",
                LocalDate.now().minusDays(20),
                Category.SVAGO,
                Type.OUT);

        new Movement(UUID.randomUUID(),
                BigDecimal.valueOf(1200),
                "Affitto ricevuto",
                LocalDate.now().minusDays(7),
                Category.LAVORO,
                Type.IN);

        new Movement(UUID.randomUUID(),
                BigDecimal.valueOf(60),
                "Acquisto libri",
                LocalDate.now().minusDays(1),
                Category.SVAGO,
                Type.OUT);

        new Movement(UUID.randomUUID(),
                BigDecimal.valueOf(500),
                "Regalo famiglia",
                LocalDate.now().minusDays(12),
                Category.SVAGO,
                Type.OUT);


        Balance balance = new Balance();
        BigDecimal nuovoSaldo = balance.updateBalance(budget, Movement.getAll());

        System.out.println("Balance: " + budget.getAmount());
    }

    public static void main(String[] args) {
        App app = new App();
        app.run();
    }

}
