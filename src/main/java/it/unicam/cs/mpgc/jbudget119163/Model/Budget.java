package it.unicam.cs.mpgc.jbudget119163.Model;

import java.math.BigDecimal;

public class Budget {

    private BigDecimal amount;

    public Budget(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
}
