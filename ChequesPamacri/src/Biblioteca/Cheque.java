/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Biblioteca;

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
    private String estado;
    private LocalDate fechaCobro;
    private int idProveedor;

    public Cheque(int id, String nroCheque, LocalDate fechaEmision, String nroFactura, double monto, String estado, LocalDate fechaCobro,int idProveedor) {
        this.id = id;
        this.nroCheque = nroCheque;
        this.fechaEmision = fechaEmision;
        this.nroFactura = nroFactura;
        this.monto = monto;
        this.estado = estado;
        this.fechaCobro = fechaCobro;
        this.idProveedor = idProveedor;
    }

    public Cheque() {
        this.id = 0;
        this.nroCheque = "";
        this.fechaEmision = LocalDate.of(Calendar.getInstance().get(Calendar.YEAR), Month.of(Calendar.getInstance().get(Calendar.MONTH)+1), Calendar.getInstance().get(Calendar.DAY_OF_MONTH ));
        this.nroFactura = "";
        this.monto = 0;
        this.estado = "";
        this.fechaCobro = null;
        this.idProveedor = 0;
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

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public LocalDate getFechaCobro() {
        return fechaCobro;
    }

    public void setFechaCobro(LocalDate fechaCobro) {
        if(fechaCobro==null){
            this.fechaCobro = LocalDate.now();
            
        }else{
            this.fechaCobro = fechaCobro;
        }
    }

    public int getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(int idProveedor) {
        this.idProveedor = idProveedor;
    }

    @Override
    public String toString() {
        return "Cheque{" + "id=" + id + ", nroCheque=" + nroCheque + ", fechaEmision=" + fechaEmision + ", nroFactura=" + nroFactura + ", monto=" + monto + ", estado=" + estado + ", fechaCobro=" + fechaCobro + ", idProveedor=" + idProveedor + '}';
    }
    
    
    
}
