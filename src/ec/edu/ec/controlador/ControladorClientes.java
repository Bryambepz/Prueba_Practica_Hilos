/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ec.controlador;

import ec.edu.ec.modelo.Clientes;
import javax.swing.JLabel;
import javax.swing.JTextArea;

/**
 *
 * @author braya
 */
public class ControladorClientes extends ControladorAbstracto implements Runnable {

    private JLabel[] cliente;
    private JLabel[] ventanillas;
    private JTextArea areaProgreso;
    private Thread th;
//    private static ControladorClientes ctrlCliente;

    public ControladorClientes() {
        super();
    }
    
//    public ControladorClientes getCtrlMonitor(){
//        if (ctrlCliente == null) {
//            ctrlCliente = new ControladorClientes();
//        }
//        return ctrlCliente;
//    }
            
    public  ControladorClientes(JLabel[] cliente, JLabel[] ventanillas, JTextArea areaProgreso) {
        super();
        this.cliente = cliente;
        this.ventanillas = ventanillas;
        this.areaProgreso = areaProgreso;
        th = new Thread(this);
        th.start();
    }

    @Override
    public void run() {
        this.avanzar(cliente, ventanillas, areaProgreso);
    }
}
