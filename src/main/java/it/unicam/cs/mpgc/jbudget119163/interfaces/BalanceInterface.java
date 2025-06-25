package it.unicam.cs.mpgc.jbudget119163.interfaces;

import java.util.UUID;

public interface BalanceInterface {
    public void addMovement(UUID id);
    public void removeMovement(UUID id);
    public void removeAllMovements();
}
