/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ec.modelo;

/**
 *
 * @author braya
 */
public class Clientes {
    private String nombre;
    private int saldo;

    public Clientes(int saldo, String nombre) {
        this.nombre = nombre;
        this.saldo = saldo;
    }

    public Clientes(String nombre) {
        this.nombre = nombre;
    }
    
    public Clientes() {
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    @Override
    public String toString() {
        return "nombres="+nombre+" saldo=" + saldo + '}';
    }
    
}
