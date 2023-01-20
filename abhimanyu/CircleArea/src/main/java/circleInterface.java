/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
import java.rmi.*;

/**
 *
 * @author abhid
 */
public interface circleInterface extends Remote {
    public double Area(int radius) throws RemoteException;
    
}
