package Controller;

import StoreItems.Menu;
import StoreManager.OrderManager;
import StoreManager.UI;

import java.io.IOException;

public class Controller {
    public boolean gameOn = true;

    OrderManager _management = new OrderManager();
    Menu _menu = new Menu();
    UI _userInterface = new UI();



    public void go() throws IOException {
      gameOn();
    }

    public void gameOn() throws IOException {
        _userInterface.GetWelcomeMsg();
        _menu.PrintMenu();

        //while(gameOn == true){ // switch case
            _management.viewOrder();
            // adding order in queue
            _management.AddOrderToQueue();
            _management.viewQueueList();
            //_userInterface.SelectNextClientOrder();
            _userInterface.ProcceedInfo();
            _userInterface.ReadKey();
            _management.RemoveOrderFromQueue();
            _management.viewQueueList();


        //}
    }

}

