package edu.ijse.supermarket.model;

// String - save

import java.sql.Connection;
import edu.ijse.supermarket.dto.ItemDto;
import edu.ijse.supermarket.db.DBConnection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

// String - delete
// String - update
// list - getItem
// Item - search
public class ItemModel {
    public String saveItem(ItemDto itemDto) throws ClassNotFoundException, SQLException{
        Connection connection = DBConnection.getInstance().getConnection();
        String save = "INSERT INTO Item VALUES (?,?,?,?,?)";
        PreparedStatement statement = connection.prepareStatement(save);
        statement.setString(1, itemDto.getItemCode());
        statement.setString(2, itemDto.getDescription());
        statement.setString(3, itemDto.getPackSize());
        statement.setDouble(4, itemDto.getUnitPrice());
        statement.setInt(5, itemDto.getQoh());
        
        return statement.executeUpdate() > 0 ? "Successfully added an item" : "Failed to add an item";
    }
    public String deleteItem(ItemDto itemDto) throws ClassNotFoundException, SQLException{
        Connection connection = DBConnection.getInstance().getConnection();
        String delete = "DELETE FROM Item WHERE ItemCode = ?";
        PreparedStatement statement = connection.prepareStatement(delete);
        statement.setString(1, itemDto.getItemCode());
        
        return statement.executeUpdate() > 0 ? "Successfully deleted an item" : "Failed to delete an item";
    }
    public String updateItem(ItemDto itemDto) throws ClassNotFoundException, SQLException{
        Connection connection = DBConnection.getInstance().getConnection();
        String update = "UPDATE Item SET Description = ?, PackSize = ?, UnitPrice = ?, QtyOnHand = ? WHERE ItemCode = ?";
        PreparedStatement statement = connection.prepareStatement(update);
        statement.setString(1, itemDto.getDescription());
        statement.setString(2, itemDto.getPackSize());
        statement.setDouble(3, itemDto.getUnitPrice());
        statement.setInt(4, itemDto.getQoh());
        statement.setString(5, itemDto.getItemCode());
        
        return statement.executeUpdate() > 0 ? "Successfully updated an item" : "Failed to update an item";
    }
    public ItemDto searchItem(String itemCode) throws ClassNotFoundException, SQLException{
        Connection connection = DBConnection.getInstance().getConnection();
        String search = "SELECT * FROM Item WHERE ItemCode = ?";
        PreparedStatement statement = connection.prepareStatement(search);
        statement.setString(1, itemCode);
        
        ResultSet rst = statement.executeQuery();
        while (rst.next()){
            ItemDto dto = new ItemDto(rst.getString("ItemCode"), rst.getString("Description"), rst.getString("PackSize"), rst.getDouble("UnitPrice"), rst.getInt("QtyOnHand"));
            return dto;
        }
        return null;
    }
    public ArrayList<ItemDto> getAll() throws ClassNotFoundException, SQLException{
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "SELECT * FROM Item ";
        PreparedStatement statement = connection.prepareStatement(sql);
        
        ArrayList<ItemDto> itemDtos = new ArrayList<>();
        ResultSet rst = statement.executeQuery();
        while(rst.next()){
            ItemDto dto = new ItemDto(rst.getString("ItemCode"), rst.getString("Description"), rst.getString("PackSize"), rst.getDouble("UnitPrice"), rst.getInt("QtyOnHand"));
            itemDtos.add(dto);
        }
        return itemDtos;
    }
}
