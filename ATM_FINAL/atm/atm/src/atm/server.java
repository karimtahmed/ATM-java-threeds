/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm;
import java.awt.event.ActionEvent;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Scanner;
public class server {
    static String ClientUserName1="Bob",ClientPassword1="1",ClientUserName2="Mesho",
            ClientPassword2="2",ClientUsername3="Zizo",ClientPassword3="3";
    static int ClientBalance1=5000,ClientBalance2=5000,ClientBalance3=5000;
             static ServerGui server;
    
   
    
    public static void main(String[] args)throws IOException {
                 //String amount_money="";

         //Client1Frame f=new Client1Frame();
         server=new ServerGui();
         server.setVisible(true);
         ServerSocket s = new ServerSocket(8080); 
Socket ss;
             while(true) { 

             ss = s.accept(); //to accept the connection between server &amp; client
              System.out.println("Connected: "+ ss);
              server.jTextArea1.append("Connected");
            //Defing the InputStream on Socket
            DataOutputStream OutToServer = new DataOutputStream(ss.getOutputStream());
            DataInputStream in = new DataInputStream(ss.getInputStream()); 
            
           

            //Reading  From Client
            //amount_money = infromclient.readLine();

                  String username = in.readUTF(); 
                  System.out.println(username);
                  String password = in.readUTF();    
                  System.out.println("client:" + username);
                  System.out.println("client:" + password);
                  
                  //
                  if (ClientUserName1.equals(username) && ClientPassword1.equals(password) )
                  {
                    OutToServer.writeUTF("Client1 Login Success");
                    server.jTextArea1.append("Bob Logged in"+"\n");
                    
                    String operation=in.readUTF();
                  System.out.println("Opera:" + operation);

                  String amount=in.readUTF();
                   System.out.println("amount:" + amount);

                  int money=Integer.parseInt(amount);
                  
                  if(operation.equals("Withdraw")){
                    ClientBalance1-=money;
                    OutToServer.writeUTF("Withdraw Success");
                    server.jTextArea1.append("Bob Withdrawed"+amount+"\n");
                    
                    }
                    
                    
                    
                    
                  }
                  
                  //
                 
                  else if (ClientUserName2.equals(username) && ClientPassword2.equals(password) )
                  {
                    OutToServer.writeUTF("Client2 Login Success");
                    server.jTextArea1.append("Mesho Logged in"+"\n");
                                  
                      
                    
                    
                    
                    
                                  
                  }
                 
                  //
                  
                 else if (ClientUsername3.equals(username) && ClientPassword3.equals(password) )
                  {
                    OutToServer.writeUTF("Client3 Login Success");
                                  server.jTextArea1.append("Zizo Logged in"+"\n");

                                  
                                  
                                  
                  }
                 
                  else
                  {
                      OutToServer.writeUTF("Login Failed");
                  }
                  //
                  if (username.equalsIgnoreCase("exit"))
                  {
                      break;
                  }
                  
                  
                  
                  
                  
             }
              
            ss.close();
//                 

            
            

            
            
            
            
            
            
            
            
            
            
            
            
            
              
//       while(true)
//        {
//          
//            if(f.res == "deposit")
//            {
//                        System.out.println("true");
//
//                //float DepOutputbalance = Deposit(money);
//                            int money = Integer.parseInt(amount_money);
//
//                f.balance=f.balance+money;
//            OutToClient.writeUTF("Your balance is  " + f.balance + "\n");
//            }
//
//            if(f.res == "withdraw"){
//                //float Outputbalance = Withdraw(money);
//                 //float balance=5000;
//               int money = Integer.parseInt(amount_money);
//
//                 if(money <= f.balance && money<=7000){
//
//                f.balance=f.balance-money;
//                
//                OutToClient.writeUTF("Your balance is  " + f.balance + "\n");
//
//            }
//            }
//            if(f.res == "check"){
//                //newbalance=balance+money;
//                OutToClient.writeUTF("Your balance is  " + f.balance + "\n");
//
//            }
//            if (amount_money.equalsIgnoreCase("-1"))
//                  {
//                      break;
//                  }
//
//               }
                    


    }




    }