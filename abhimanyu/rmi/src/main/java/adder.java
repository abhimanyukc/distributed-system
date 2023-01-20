/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
import java.rmi.*;
/**
 *
 * @author abhid
 */
public interface adder extends Remote{
    public int add(int n1,  int n2) throws RemoteException;
    
}
