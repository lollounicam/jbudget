package it.unicam.cs.mpgc.jbudget119163.Balance;

import it.unicam.cs.mpgc.jbudget119163.Model.Budget;
import it.unicam.cs.mpgc.jbudget119163.Model.Type;

import java.math.BigDecimal;

public class Balance {

    public void UpdateBalance(Budget budget, Movement movement) {
        if(movement.type.equals(Type.IN)){
            BigDecimal sum = budget.amount.add(movement.amount);
            budget.amount = sum;
            System.out.println(budget.amount);
        }else{
            budget.amount.subtract(movement.amount);
            System.out.println(budget.amount.toString());
        }
    }
}
