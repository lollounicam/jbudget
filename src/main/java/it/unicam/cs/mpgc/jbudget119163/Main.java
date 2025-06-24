package it.unicam.cs.mpgc.jbudget119163;


import it.unicam.cs.mpgc.jbudget119163.Model.Movement;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        Movement movement = new Movement(UUID.randomUUID(), BigDecimal.valueOf(20), "Macchina", LocalDate.now());
        System.out.println(movement);
        }
    }