package edu.ijse.supermarket.model;


import java.sql.PreparedStatement;
import edu.ijse.supermarket.db.DBConnection;
import edu.ijse.supermarket.dto.CustomerDto;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;

public class CustomerModel {
    public String saveCustomer(CustomerDto customerDto) throws ClassNotFoundException, SQLException{
        Connection connection = DBConnection.getInstance().getConnection();
        String save = "INSERT INTO Customer VALUES (?,?,?,?,?,?,?,?,?)";
        PreparedStatement statement = connection.prepareStatement(save);
        statement.setString(1, customerDto.getCustID());
        statement.setString(2, customerDto.getCustTitle());
        statement.setString(3, customerDto.getCustName());
        statement.setDate(4, customerDto.getDob());
        statement.setDouble(5, customerDto.getSalary());
        statement.setString(6, customerDto.getCustAddress());
        statement.setString(7, customerDto.getCity());
        statement.setString(8, customerDto.getProvince());
        statement.setString(9, customerDto.getPostalCode());
        
        return statement.executeUpdate() > 0 ? "Successfully added a customer" : "Failed to add a customer";
    }
    
    public String deleteCustomer(CustomerDto customerDto) throws ClassNotFoundException, SQLException{
        Connection connection = DBConnection.getInstance().getConnection();
        String delete = "DELETE FROM Customer WHERE CustID = ?";
        PreparedStatement statement = connection.prepareStatement(delete);
        statement.setString(1, customerDto.getCustID());
        return statement.executeUpdate() > 0 ? "Successfully deleted a customer" : "Failed to delete a customer";
    }
    
    public String updateCustomer(CustomerDto customerDto)throws ClassNotFoundException, SQLException{
        Connection connection = DBConnection.getInstance().getConnection();
        String delete = "UPDATE Customer SET CustTitle = ?, CustName = ?, DOB = ?, salary = ?, CustAddress = ?, City = ?, Province = ?, PostalCode = ? WHERE CustID = ?";
        PreparedStatement statement = connection.prepareStatement(delete);
        statement.setString(1, customerDto.getCustTitle());
        statement.setString(2, customerDto.getCustName());
        statement.setDate(3, customerDto.getDob());
        statement.setDouble(4, customerDto.getSalary());
        statement.setString(5, customerDto.getCustAddress());
        statement.setString(6, customerDto.getCity());
        statement.setString(7, customerDto.getProvince());
        statement.setString(8, customerDto.getPostalCode());
        statement.setString(9, customerDto.getCustID());
        
        return statement.executeUpdate() > 0 ? "Successfully update a customer" : "Failed to update a customer";
    }
    
    public CustomerDto searchCustomer(String CustID) throws ClassNotFoundException, SQLException{
        Connection connection = DBConnection.getInstance().getConnection();
        String search = "SELECT * FROM Customer WHERE CustID = ?";
        PreparedStatement statement = connection.prepareStatement(search);
        statement.setString(1, CustID);
        
        ResultSet rst = statement.executeQuery();
        while(rst.next()){
            CustomerDto dto = new CustomerDto(rst.getString("CustID"), rst.getString("CustTitle"), rst.getString("CustName"),
                              rst.getDate("DOB"), rst.getDouble("salary"), rst.getString("CustAddress"), rst.getString("City"),
                              rst.getString("Province"), rst.getString("PostalCode"));
            return dto;
        }
        return null;
    }
    
    public ArrayList<CustomerDto> getAll() throws ClassNotFoundException, SQLException{
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "SELECT * FROM Customer";
        PreparedStatement statement = connection.prepareStatement(sql);
        
        ResultSet rst = statement.executeQuery();
        ArrayList<CustomerDto> customerDtos = new ArrayList<>();
        while(rst.next()){
            CustomerDto dto = new CustomerDto(rst.getString("CustID"), rst.getString("CustTitle"), rst.getString("CustName"),
                              rst.getDate("DOB"), rst.getDouble("salary"), rst.getString("CustAddress"), rst.getString("City"),
                              rst.getString("Province"), rst.getString("PostalCode"));
            customerDtos.add(dto);
        }
        return customerDtos;
    }
}
