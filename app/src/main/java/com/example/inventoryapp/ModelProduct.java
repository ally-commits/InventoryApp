package com.example.inventoryapp;

public class ModelProduct {
    int _id;
    String _name;
    String _stockLeft;
    String _category;
    boolean _isAddedToCart;

    public ModelProduct() {}

    public ModelProduct(int id,String name,String stockLeft, String category) {
        this._id = id;
        this._name = name;
        this._stockLeft = stockLeft;
        this._category = category;
    }

    public ModelProduct(String name,String stockLeft, String category) {
        this._stockLeft = stockLeft;
        this._category = category;
        this._name = name;
    }

    public int getId() {return _id;}
    public void setId(int id) {this._id = id;}

    public String getName() {return this._name; }
    public void setName(String name) {this._name = name;}

    public String getStockLeft() {return this._stockLeft; }
    public void setStockLeft(String stockLeft) {this._stockLeft = stockLeft;}

    public String getCategory() {return this._category; }
    public void setCategory(String _category) {this._category = _category;}

    public void setIsAddedToCart(boolean isAddedToCart) {
        this._isAddedToCart = isAddedToCart;
    }
    public boolean getIsAddedToCart() {
        return _isAddedToCart;
    }
}
