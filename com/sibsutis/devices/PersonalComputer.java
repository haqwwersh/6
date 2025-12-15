
package com.sibsutis.devices;

import java.util.Objects;

public class PersonalComputer extends Device {

    public PersonalComputer(int id, int price, String ip) {
        super(id, price, ip);
    }

    @Override
    public String getDeviceType() {
        return "PersonalComputer";
    }

    @Override
    public String print() {
        return super.print() + ", Type: " + getDeviceType();
    }

    @Override
public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    PersonalComputer that = (PersonalComputer) obj;
    return id == that.id && price == that.price && ip.equals(that.ip);
}

@Override
public int hashCode() {
    return Objects.hash(id, price, ip);
}

}
