package it.unicam.cs.mpgc.jbudget119163.interfaces;

import it.unicam.cs.mpgc.jbudget119163.Model.Type;

import java.math.BigDecimal;

public interface MovementInterface {

    public String toString();
    public void checkDate();
    public Type getType();
    public BigDecimal getAmount();

}
