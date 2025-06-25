package it.unicam.cs.mpgc.jbudget119163.Abstract;

import it.unicam.cs.mpgc.jbudget119163.Balance.Movement;
import it.unicam.cs.mpgc.jbudget119163.Model.Type;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public interface MovementInterface {

    public String toString();
    public void checkDate();
    public Type getType();
    public BigDecimal getAmount();

}
