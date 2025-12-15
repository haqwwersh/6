package com.sibsutis.devices;

import com.sibsutis.Printable;

public abstract class Device implements Printable {
    protected int id;
    protected int price;
    protected String ip;

    public Device(int id, int price, String ip) {
        this.id = id;
        this.price = price;
        this.ip = ip;
    }

    public int getId() {
        return id;
    }

    public int getPrice() {
        return price;
    }

    public String getIp() {
        return ip;
    }

    @Override
    public String print() {
        return "Device ID: " + id + ", Price: " + price + ", IP: " + ip;
    }

    public abstract String getDeviceType();
}
