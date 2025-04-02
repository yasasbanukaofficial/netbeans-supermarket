/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.supermarket.controller;
import edu.ijse.supermarket.dto.ItemDto;
import edu.ijse.supermarket.model.ItemModel;
import java.sql.SQLException;
import java.util.ArrayList;


public class ItemController {
    private ItemModel itemModel = new ItemModel();
    
    public ArrayList<ItemDto> getAll() throws ClassNotFoundException, SQLException{ 
        ArrayList<ItemDto> resp = itemModel.getAll();
        return resp;
    }
    public String saveItem(ItemDto itemDto) throws ClassNotFoundException, SQLException {
        String resp = itemModel.saveItem(itemDto);
        return resp;
    }
    public String updateItem(ItemDto itemDto) throws ClassNotFoundException, SQLException {
        String resp = itemModel.updateItem(itemDto);
        return resp;
    }
    public String deleteItem(ItemDto itemDto) throws ClassNotFoundException, SQLException{
        String resp = itemModel.deleteItem(itemDto);
        return resp;
    }
}
