package StoreManager;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class UI {
  Scanner sc = new Scanner(System.in);

  public UI(){

  }
  public void GetWelcomeMsg(){
    System.out.println("------------------------------------------------------------");
    System.out.println("                                 -----");
    System.out.println("                                | - - |");
    System.out.println("Hello! Wellcome to MarioPizza   |  -  |");
    System.out.println("                                  ---");
    System.out.println("Please Find our order list on the Menu Kort.\n");
  }

  public int GiveOrderQuantity(){
    System.out.print("How many pizza would you like to order? : ");
    int qty = Integer.parseInt(sc.nextLine());
    return qty;
  }

  public  void SelectNextClientOrder(){
    System.out.println("Next Client..., Please Step forward!");
  }

  public  void ProcceedInfo(){
    System.out.println("you have a new order...!");
    System.out.println("Would you like to Delete order once delivered ? ");
    System.out.println("if yes, Press any key to pursue" +
        "...");
  }
  public void ReadKey() throws IOException {
    // uncomment below to implement key reader for any keys
    /*
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    br.readLine();

     */

    System.in.read();
  }
}
