/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package edu.ijse.supermarket.view;

import edu.ijse.supermarket.dto.ItemDto;
import edu.ijse.supermarket.controller.ItemController;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ItemView extends javax.swing.JFrame {
    
    private ItemController itemController = new ItemController();

    public ItemView() {
        initComponents();
        loadTable();
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        headerLabel = new java.awt.Label();
        itemCodeLabel = new java.awt.Label();
        itemCodeTxt = new java.awt.TextField();
        descriptionTxt = new java.awt.TextField();
        descriptionLabel = new java.awt.Label();
        packSizeLabel = new java.awt.Label();
        packSizeTxt = new java.awt.TextField();
        unitPriceLabel = new java.awt.Label();
        unitPriceTxt = new java.awt.TextField();
        qohLabel = new java.awt.Label();
        qohTxt = new java.awt.TextField();
        saveItemBtn = new java.awt.Button();
        deleteItemBtn1 = new java.awt.Button();
        updateItemBtn1 = new java.awt.Button();
        jScrollPane1 = new javax.swing.JScrollPane();
        itemTbl = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        headerLabel.setAlignment(java.awt.Label.CENTER);
        headerLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        headerLabel.setText("Manage Items");

        itemCodeLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        itemCodeLabel.setText("Item Code");

        itemCodeTxt.setBackground(new java.awt.Color(102, 102, 102));
        itemCodeTxt.setForeground(new java.awt.Color(255, 255, 255));

        descriptionTxt.setBackground(new java.awt.Color(102, 102, 102));
        descriptionTxt.setForeground(new java.awt.Color(255, 255, 255));

        descriptionLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        descriptionLabel.setForeground(new java.awt.Color(0, 0, 0));
        descriptionLabel.setText("Description");

        packSizeLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        packSizeLabel.setForeground(new java.awt.Color(0, 0, 0));
        packSizeLabel.setText("Pack Size");

        packSizeTxt.setBackground(new java.awt.Color(102, 102, 102));
        packSizeTxt.setForeground(new java.awt.Color(255, 255, 255));

        unitPriceLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        unitPriceLabel.setForeground(new java.awt.Color(0, 0, 0));
        unitPriceLabel.setText("Unit Price");

        unitPriceTxt.setBackground(new java.awt.Color(102, 102, 102));
        unitPriceTxt.setForeground(new java.awt.Color(255, 255, 255));

        qohLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        qohLabel.setForeground(new java.awt.Color(0, 0, 0));
        qohLabel.setText("Qty On Hand");

        qohTxt.setBackground(new java.awt.Color(102, 102, 102));
        qohTxt.setForeground(new java.awt.Color(255, 255, 255));

        saveItemBtn.setBackground(new java.awt.Color(51, 153, 255));
        saveItemBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        saveItemBtn.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        saveItemBtn.setForeground(new java.awt.Color(255, 255, 255));
        saveItemBtn.setLabel("Save Item");
        saveItemBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveItemBtnActionPerformed(evt);
            }
        });

        deleteItemBtn1.setBackground(new java.awt.Color(51, 153, 255));
        deleteItemBtn1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        deleteItemBtn1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        deleteItemBtn1.setForeground(new java.awt.Color(255, 255, 255));
        deleteItemBtn1.setLabel("Delete Item");
        deleteItemBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteItemBtn1ActionPerformed(evt);
            }
        });

        updateItemBtn1.setBackground(new java.awt.Color(51, 153, 255));
        updateItemBtn1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        updateItemBtn1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        updateItemBtn1.setForeground(new java.awt.Color(255, 255, 255));
        updateItemBtn1.setLabel("Update Item");
        updateItemBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateItemBtn1ActionPerformed(evt);
            }
        });

        itemTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        itemTbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                itemTblMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(itemTbl);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(394, 394, 394)
                        .addComponent(headerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(327, 327, 327)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(itemCodeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(itemCodeTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(descriptionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(descriptionTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(packSizeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(packSizeTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(unitPriceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(unitPriceTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(qohLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(qohTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(deleteItemBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(updateItemBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(saveItemBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(343, Short.MAX_VALUE))
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(headerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(itemCodeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(itemCodeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(descriptionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(descriptionTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(packSizeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(packSizeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(unitPriceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(unitPriceTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(qohLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(qohTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(saveItemBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(deleteItemBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(updateItemBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void deleteItemBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteItemBtn1ActionPerformed
        deleteItem();
    }//GEN-LAST:event_deleteItemBtn1ActionPerformed

    private void updateItemBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateItemBtn1ActionPerformed
        updateItem();
    }//GEN-LAST:event_updateItemBtn1ActionPerformed

    private void saveItemBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveItemBtnActionPerformed
        saveItem();
    }//GEN-LAST:event_saveItemBtnActionPerformed

    private void itemTblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemTblMouseClicked
        // TODO add your handling code here:
        itemSearch();
    }//GEN-LAST:event_itemTblMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button deleteItemBtn1;
    private java.awt.Label descriptionLabel;
    private java.awt.TextField descriptionTxt;
    private java.awt.Label headerLabel;
    private java.awt.Label itemCodeLabel;
    private java.awt.TextField itemCodeTxt;
    private javax.swing.JTable itemTbl;
    private javax.swing.JScrollPane jScrollPane1;
    private java.awt.Label packSizeLabel;
    private java.awt.TextField packSizeTxt;
    private java.awt.Label qohLabel;
    private java.awt.TextField qohTxt;
    private java.awt.Button saveItemBtn;
    private java.awt.Label unitPriceLabel;
    private java.awt.TextField unitPriceTxt;
    private java.awt.Button updateItemBtn1;
    // End of variables declaration//GEN-END:variables
    public void loadTable(){
        String columns [] = {"Item Code", "Description", "Pack Size", "Unit Price", "Qty On Hand"};
        DefaultTableModel dtm = new DefaultTableModel(columns, 0){
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        itemTbl.setModel(dtm);
        try {
            ArrayList<ItemDto> items = itemController.getAll();
            for(ItemDto item : items){
                Object [] rows = {item.getItemCode(), item.getDescription(), item.getPackSize(), item.getUnitPrice(), item.getQoh()};
                dtm.addRow(rows);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());

        }
    }
    
    private void itemSearch() {
        String itemCode = (String) itemTbl.getValueAt(itemTbl.getSelectedRow(), 0);
        
        try{
            ItemDto dto = itemController.searchItem(itemCode);
            if(dto != null){
                itemCodeTxt.setText(dto.getItemCode());
                packSizeTxt.setText(dto.getPackSize());
                descriptionTxt.setText(dto.getDescription());
                unitPriceTxt.setText(Double.toString(dto.getQoh()));
                qohTxt.setText(Integer.toString(dto.getQoh()));
            } else {
                JOptionPane.showMessageDialog(this, "Item not found");
            }
        }catch (Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Item Not Found");
        }
    }
    
    private void saveItem(){
        ItemDto itemDto = new ItemDto(
                itemCodeTxt.getText(),
                descriptionTxt.getText(),
                packSizeTxt.getText(),
                Double.parseDouble(unitPriceTxt.getText()),
                Integer.parseInt(qohTxt.getText())
        );
        
        try {
            String resp = itemController.saveItem(itemDto);
            JOptionPane.showMessageDialog(this, resp);
            loadTable();
            clearTable();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }
    
    private void updateItem() {
        ItemDto itemDto = new ItemDto(
                itemCodeTxt.getText(),
                descriptionTxt.getText(),
                packSizeTxt.getText(),
                Double.parseDouble(unitPriceTxt.getText()),
                Integer.parseInt(qohTxt.getText())
        );
        
        try {
            String resp = itemController.updateItem(itemDto);
            JOptionPane.showMessageDialog(this, resp);
            loadTable();
            clearTable();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }
    
    private void deleteItem() {
        ItemDto itemDto = new ItemDto();
        itemDto.setItemCode(itemCodeTxt.getText());
        
        try {
            String resp = itemController.deleteItem(itemDto);
            JOptionPane.showMessageDialog(this, resp);
            loadTable();
            clearTable();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    } 
    
    private void clearTable(){
            itemCodeTxt.setText("");
            descriptionTxt.setText("");
            packSizeTxt.setText("");
            unitPriceTxt.setText("");
            qohTxt.setText("");
    }
}
