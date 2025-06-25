package it.unicam.cs.mpgc.jbudget119163.Balance;

import it.unicam.cs.mpgc.jbudget119163.Abstract.BalanceInterface;
import it.unicam.cs.mpgc.jbudget119163.Model.Budget;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

public class Balance implements BalanceInterface {

    public BigDecimal updateBalance(Budget budget, List<Movement> movements) {
        for (Movement m : movements) {
            switch (m.getType()) {
                case IN  -> budget.setAmount(budget.getAmount().add(m.getAmount()));
                case OUT -> budget.setAmount(budget.getAmount().subtract(m.getAmount()));
            }
        }
        return budget.getAmount();
    }

    @Override
    public void addMovement(UUID id) {

    }

    @Override
    public void removeMovement(UUID id) {

    }

    @Override
    public void removeAllMovements() {

    }
}
