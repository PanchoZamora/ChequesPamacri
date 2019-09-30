/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chequespamacri.Biblioteca;

import java.time.*;
import java.util.*;

/**
 *
 * @author franc
 */
public class Cheque {
    
    private int id;
    private String nroCheque;
    private LocalDate fechaEmision;
    private String nroFactura;
    private double monto;

    public Cheque(int id, String nroCheque, LocalDate fechaEmision, String nroFactura, double monto) {
        this.id = id;
        this.nroCheque = nroCheque;
        this.fechaEmision = fechaEmision;
        this.nroFactura = nroFactura;
        this.monto = monto;
    }

    public Cheque() {
        this.id = 0;
        this.nroCheque = "";
        this.fechaEmision = LocalDate.of(Calendar.getInstance().get(Calendar.YEAR), Month.of(Calendar.getInstance().get(Calendar.MONTH)+1), Calendar.getInstance().get(Calendar.DAY_OF_MONTH ));
        this.nroFactura = "";
        this.monto = 0;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNroCheque() {
        return nroCheque;
    }

    public void setNroCheque(String nroCheque) {
        this.nroCheque = nroCheque;
    }

    public LocalDate getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(LocalDate fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public String getNroFactura() {
        return nroFactura;
    }

    public void setNroFactura(String nroFactura) {
        this.nroFactura = nroFactura;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }
    
    
    
    
    
}
