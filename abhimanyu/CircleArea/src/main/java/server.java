/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.rmi.*;
import java.rmi.registry.*;


/**
 *
 * @author abhid
 */
public class server {
    public server() throws RemoteException{
        super();
    }
    public static void main (String args[] ) throws RemoteException {
        Registry reg = LocateRegistry.createRegistry(1011);
        circleImpl ci = new circleImpl();
        reg.rebind("circle" , ci);
        System.out.println("Server is waiting");
    }
    
}
