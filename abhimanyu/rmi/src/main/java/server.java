/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
/**
 *
 * @author abhid
 */
public class server  extends UnicastRemoteObject implements adder{
    public server() throws RemoteException {
     // super();   
        
    }
    @Override
    public int add(int n1, int n2) throws RemoteException {
        return n1+n2;
    }
    public static void main(String[] args) throws RemoteException {
        try{
            Registry reg = LocateRegistry.createRegistry(9999);
            reg.rebind("hi server" ,new server());
            System.out.println("server is ready");
        }
        catch(RemoteException e)
        {
            System.out.println("exception" +e);
        }
    }
    
}
