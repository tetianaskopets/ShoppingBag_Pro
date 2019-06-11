package com.ubs.wit.codered;

public class Item {
    String name;
    double price;
    int quantity;
    double coupon;

    public Item(String name, double price, int quantity, double coupon)
    {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.coupon = coupon;
    }
    public Item()
    {
        name = "DefaultName";
        price = 1.0;
        quantity = 1;
        coupon = 0.0;
    }
    ////
    public void setName(String n)
    {
        if (n.length()>20) {
            System.out.println("Item name is too long");
            return;
        } else {
            name = n;
        }
    }
    public void setPrice(double price)
    {
        if (price <0)
        {
            System.out.println("Price cannot be negative");
            return;
        }
        this.price = price;
    }
    public void setCoupon(double coupon)
    {
        if (coupon <0)
        {
            System.out.println("Coupon cannot be negative");
            return;
        }
        this.coupon = coupon;
    }
    public void setQuantity(int quantity)
    {
        if (quantity <0)
        {
            System.out.println("Quantity cannot be negative");
            return;
        }
        this.quantity = quantity;
    }
/////
    public String getName()
    {
        String name = this.name;
        return name;
    }
    public double getPrice()
    {
       return this.price ;
    }
    public double getCoupon()
    {
        return this.coupon;
    }
    public int getQuantity()
    {
      return this.quantity;
    }
}
