package it.unicam.cs.mpgc.jbudget119163.Balance;

import it.unicam.cs.mpgc.jbudget119163.Model.Budget;
import it.unicam.cs.mpgc.jbudget119163.Model.Type;

import java.util.List;

public class Balance {

    public void updateBalance(Budget budget, List<Movement> movements) {

        for (Movement m : movements) {
            switch (m.getType()) {
                case IN  -> budget.setAmount(budget.getAmount().add(m.getAmount()));
                case OUT -> budget.setAmount(budget.getAmount().subtract(m.getAmount()));
            }
        }
    }
}
