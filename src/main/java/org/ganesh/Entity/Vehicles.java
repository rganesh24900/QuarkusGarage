package org.ganesh.Entity;

public class Vehicles {


    private String name;
    private int price;
    private String status;

    public Vehicles() {
    }

    public Vehicles(String name, int price, String status) {



        this.name = name;
        this.price = price;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }




    @Override
    public String toString() {
        return "Vehicles{" +

                ", name='" + name + '\'' +
                ", price=" + price +
                ", status='" + status + '\'' +
                '}';
    }
}
