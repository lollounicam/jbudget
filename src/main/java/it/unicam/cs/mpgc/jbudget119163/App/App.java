package it.unicam.cs.mpgc.jbudget119163.App;

import it.unicam.cs.mpgc.jbudget119163.Balance.Balance;
import it.unicam.cs.mpgc.jbudget119163.Balance.Movement;
import it.unicam.cs.mpgc.jbudget119163.Model.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

public class App {
    Budget budget = new Budget(BigDecimal.ZERO);
    Movement movement = new Movement(UUID.randomUUID(), BigDecimal.valueOf(10000), "Stipendio", LocalDate.now(), Category.LAVORO, Type.IN);
    public void run(){
        Balance balance = new Balance();
        balance.UpdateBalance(budget, movement);
        System.out.println("Balance updated, budget=" + budget.amount);
    }


}
