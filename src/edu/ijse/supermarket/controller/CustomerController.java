package edu.ijse.supermarket.controller;

import edu.ijse.supermarket.model.CustomerModel;
import java.util.ArrayList;
import java.sql.SQLException;
import edu.ijse.supermarket.dto.CustomerDto;

public class CustomerController {
    private CustomerModel custModel = new CustomerModel();
    public ArrayList<CustomerDto> getAll() throws ClassNotFoundException, SQLException{
        ArrayList<CustomerDto> resp = custModel.getAll();
        return resp;
    }
    
}
