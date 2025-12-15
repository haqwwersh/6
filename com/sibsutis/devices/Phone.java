package com.sibsutis.devices;

import java.util.Objects;

public class Phone extends Device {

    public Phone(int id, int price, String ip) {
        super(id, price, ip);
    }

    @Override
    public String getDeviceType() {
        return "Phone";
    }

    @Override
    public String print() {
        return super.print() + ", Type: " + getDeviceType();
    }

    @Override
public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Phone that = (Phone) obj;
    return id == that.id && price == that.price && ip.equals(that.ip);
}

@Override
public int hashCode() {
    return Objects.hash(id, price, ip);
}

}
