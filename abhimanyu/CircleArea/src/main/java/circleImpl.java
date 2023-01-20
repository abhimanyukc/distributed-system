/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.rmi.server.*;
import java.rmi.RemoteException;
public class circleImpl extends UnicastRemoteObject implements circleInterface
{
  public circleImpl()  throws RemoteException
  {
      super();
  }
  @Override
  public double Area(int radius) throws RemoteException
  {
      double pi= 3.14;
      return pi*radius*radius;
  }
}
/**
 *
 * @author abhid
 */

