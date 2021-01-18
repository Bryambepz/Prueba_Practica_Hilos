/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ec.controlador;

import ec.edu.ec.modelo.Clientes;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JTextArea;

/**
 *
 * @author braya
 * @param <T>
 */
public abstract class ControladorAbstracto {

    private Clientes[] listaSaldos;
    int con20;
    int con50;
    int con100;
    String info;
    
    public ControladorAbstracto() {
        this.listaSaldos = new Clientes[10];
    }

    public synchronized void avanzar(JLabel[] clientes, JLabel[] ventanillas, JTextArea areaProgreso) {
        int pos_x = 0;
        int pos_y = 0;
        int contador = 0;

        for (int i = 0; i < 10; i++) {
            Clientes clientes1 = new Clientes(clientes[i].getName());
            listaSaldos[i] = clientes1;
        }
        for (int i = 0; i < clientes.length; i++) {
            int t = (int) (Math.random() * 2);
            System.out.println((i+1) + ") -- " + t);
            try {
                JLabel cliente = clientes[i];
                pos_x = cliente.getX();
                pos_y = cliente.getY();
                JLabel nVntall = ventanillas[contador];
                if (i == 9) {
                    Thread.sleep(500);
                    mover(pos_x, pos_y, cliente, nVntall);
                    if (t == 0) {
                        System.out.println("deposito");
                        if (listaSaldos[i].getSaldo() >= 100) {
//                                depositar(cantidad(), cliente, nVntall, i, areaProgreso);
                                retirar(i, cantidad(), cliente, nVntall, areaProgreso);
                                info = "ha llegado al limite en su cuenta\n";
                                areaProgreso.append(info);
                            } else {
                                depositar(cantidad(), cliente, nVntall, i, areaProgreso);
                            }
//                                System.out.println(cliente.getName() + " ha llegado al limite en su cuenta");
                    } else if (t == 1) {
                        System.out.println("retiro");
                        retirar(i, cantidad(), cliente, nVntall, areaProgreso);
                    }
                    Thread.sleep(500);
                    i = -1;
                    for (JLabel clientess : clientes) {
                        clientess.setVisible(true);
                    }
                    cliente.setLocation(759, 190 + (i * 84));
                } else {
                    mover(pos_x, pos_y, cliente, nVntall);
                    if (t == 0) {
                        System.out.println("deposito");
                        if (listaSaldos[i].getSaldo() >= 100) {
//                            depositar(cantidad(), cliente, nVntall, i, areaProgreso);
                            retirar(i, cantidad(), cliente, nVntall, areaProgreso);
                            info = "ha llegado al limite en su cuenta\n";
                            areaProgreso.append(info);
                        } else {
                            depositar(cantidad(), cliente, nVntall, i, areaProgreso);
                        }
                    } else if (t == 1) {
                        System.out.println("retiro");
                        retirar(i, cantidad(), cliente, nVntall, areaProgreso);
                    }

                    Thread.sleep(500);
                    cliente.setVisible(false);
                    cliente.setLocation(759, 190 + (i * 84));
                }
                System.out.println(con20 + " / " + con50 + " / " + con100);
                if (contador < 2) {
                    contador++;
                } else {
                    contador = 0;
                }
            } catch (InterruptedException ex) {
                Logger.getLogger(ControladorAbstracto.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void mover(int pos_x, int pos_y, JLabel cliente, JLabel nVntall) {
        for (int j = pos_x; j > nVntall.getX() + 37; j--) {
            try {
                cliente.setLocation(j, pos_y);
                Thread.sleep(4);
                if (j == nVntall.getX() + 38) {
                    for (int k = pos_y; k > 191; k--) {
                        cliente.setLocation(j, k);
                        Thread.sleep(4);
                    }
//                    System.out.println(" nC " + cliente.getName());
                }
            } catch (InterruptedException ex) {
                Logger.getLogger(ControladorAbstracto.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void depositar(int deposito, JLabel cliente, JLabel nVntall, int id, JTextArea areaProgreso) {
        try {
            Thread.sleep(1000);
            var saldo = listaSaldos[id].getSaldo() + deposito;
            listaSaldos[id].setSaldo(saldo);
            info = "El " + cliente.getName() + " deposito " + deposito + "\nSaldo actual = " + saldo + "\n";
            areaProgreso.append(info);
        } catch (InterruptedException ex) {
            Logger.getLogger(ControladorAbstracto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void retirar(int id, int cantidad, JLabel cliente, JLabel nVntall, JTextArea areaProgreso) {
        try {
            Thread.sleep(1000);
            int saldoR = 0;
            if (listaSaldos[id].getSaldo() >= cantidad) {
                saldoR = listaSaldos[id].getSaldo() - cantidad;
                listaSaldos[id].setSaldo(saldoR);
                info = cliente.getName() + " retiro " + cantidad + "\nEl saldo actual es de " + saldoR + "\n";
                areaProgreso.append(info);
            } else {
//                depositar(cantidad, cliente, cliente, id, areaProgreso);
                info = cliente.getName() + " no pudo retirar " + cantidad
                        + "\nSaldo insuciente en cuenta \n" + "Saldo actual = " + listaSaldos[id].getSaldo() + "\n";
                areaProgreso.append(info);
            }
        } catch (InterruptedException ex) {
            Logger.getLogger(ControladorAbstracto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public int cantidad() {

        int valor = (int) (Math.random() * 3);
        switch (valor) {
            case 0:
                while (con20 <= 60) {                    
                    con20++;
                    return 20;
                }
            case 1:
                while (con50 <= 20) {                    
                    con50++;
                    return 50;
                }
            case 2:
                while (con100 <= 40) {                    
                    con100++;
                    return 100;
                }
            default:
                break;
        }
        return 0;
    }
}
