package edu.ijse.supermarket;
import edu.ijse.supermarket.view.CustomerView;
import edu.ijse.supermarket.view.ItemView;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        new ItemView().setVisible(true);
        new CustomerView().setVisible(true);
    }
}