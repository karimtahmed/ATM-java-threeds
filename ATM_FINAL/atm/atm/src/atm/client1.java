
package atm;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class client1 {
    String name="1";
    String password="1";
    int balance =5000;

    login l = new login();
    
         public static void main(String[] args)throws IOException{
             login l = new login();
             l.setVisible(true);

             Client1Frame f = new Client1Frame();
            
if (f.res.equals("withdraw")){
        
    try {
             String amount_money= f.t1.getText();
        Socket connectionsocket = new Socket("localhost",8080);
        DataOutputStream outtoserver= new DataOutputStream(connectionsocket.getOutputStream());
        outtoserver.writeBytes(amount_money+'\n');
        //InPut From Server
        InputStreamReader ISR2 =new InputStreamReader(connectionsocket.getInputStream());
        BufferedReader infromserver = new BufferedReader(ISR2);
        String x=infromserver.readLine()+"\n";
      
    } catch (IOException ex) {
        Logger.getLogger(client1.class.getName()).log(Level.SEVERE, null, ex);
    }
        } 
if (f.res.equals("deposit")){
    try {
        String amount_money= f.t1.getText();
        Socket connectionsocket = new Socket("localhost",8080);
        
        DataOutputStream outtoserver= new DataOutputStream(connectionsocket.getOutputStream());
        outtoserver.writeBytes(amount_money+'\n');
        
      
        //InPut From Server
        InputStreamReader ISR3 =new InputStreamReader(connectionsocket.getInputStream());
        BufferedReader infromserver2 = new BufferedReader(ISR3);
        String y=infromserver2.readLine()+"\n";
      
        
    } 
    catch (IOException ex)
    {
        Logger.getLogger(client1.class.getName()).log(Level.SEVERE, null, ex);
    } 
        } 
    
//  if (o==b4){   
//     res="check";
//    try {
////        tt= t1.getText();
//// 
//       Socket connectionsocket = new Socket("localhost",8080);
//        String amount_money = tt;
////        
//        DataOutputStream outtoserver= new DataOutputStream(connectionsocket.getOutputStream());
//       outtoserver.writeBytes(amount_money+'\n');
//        
//      
//        //InPut From Server
//        InputStreamReader ISR4 =new InputStreamReader(connectionsocket.getInputStream());
//        BufferedReader infromserver3 = new BufferedReader(ISR4);
//        String w=infromserver3.readLine()+"\n";
//      
//        f=new frames(w);
//        this.setVisible(false);      
//    } 
//    catch (IOException ex)
//    {
//        Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
//    } 
//        } 
//   
//  if (o==button){  
//     res="login";
//     
//        String Username = username.getText();
//        String Password1 = Password.getText();
//
//	if (Username.equals("1") && Password1.equals("1")){
//		JOptionPane.showMessageDialog(null, "Login Successful");
//                 frame2.setVisible(true);
//                 frame.setVisible(false);
//        }

//        
//	else
//		JOptionPane.showMessageDialog(null, "Username or Password mismatch ");
//  
    }
         }
 