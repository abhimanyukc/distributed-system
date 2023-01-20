/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.net.MalformedURLException;
import java.rmi.RemoteException;
import java.rmi.Naming;
import java.rmi.NotBoundException;

import java.util.Scanner;


/**
 *
 * @author abhid
 */
public class client {
    public client()
    {
    }
    public static void main(String args[]) throws RemoteException, NotBoundException, MalformedURLException 
    {
        int radius;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the radius of the circle");
        radius = in.nextInt();
        circleInterface c = (circleInterface) Naming.lookup("rmi://localhost:1011/CircleArea");
        System.out.println("The area of the circle is"+c.Area(radius));
        
    }
    
}
