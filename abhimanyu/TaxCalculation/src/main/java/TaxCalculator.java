/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author abhid
 */
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface TaxCalculator extends Remote {
    double calculateTax(double amount) throws RemoteException;
    void setTaxRate(double rate) throws RemoteException;
}
