package edu.ijse.supermarket.dto;

public class ItemDto {
    private String itemCode;
    private String description;
    private String packSize;
    private double unitPrice;
    private int qoh;

    public ItemDto() {}

    public ItemDto(String itemCode, String description, String packSize, double unitPrice, int qoh) {
        this.itemCode = itemCode;
        this.description = description;
        this.packSize = packSize;
        this.unitPrice = unitPrice;
        this.qoh = qoh;
    }

    /**
     * @return the itemCode
     */
    public String getItemCode() {
        return itemCode;
    }

    /**
     * @param itemCode the itemCode to set
     */
    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the packSize
     */
    public String getPackSize() {
        return packSize;
    }

    /**
     * @param packSize the packSize to set
     */
    public void setPackSize(String packSize) {
        this.packSize = packSize;
    }

    /**
     * @return the unitPrice
     */
    public double getUnitPrice() {
        return unitPrice;
    }

    /**
     * @param unitPrice the unitPrice to set
     */
    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    /**
     * @return the qoh
     */
    public int getQoh() {
        return qoh;
    }

    /**
     * @param qoh the qoh to set
     */
    public void setQoh(int qoh) {
        this.qoh = qoh;
    }
    
    @Override
    public String toString() {
        return "ItemDto{" + "itemCode=" + getItemCode() + ", description=" + getDescription() + ", packSize=" + getPackSize() + ", unitPrice=" + getUnitPrice() + ", qoh=" + getQoh() + '}';
    }
    
}
