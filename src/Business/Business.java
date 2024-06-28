package Business;

public class Business {
    private String name,address,city,state;


    public Business(String name, String address, String city, String state) {
        this.name = name;
        this.address = address;
        this.city = city;
        this.state = state;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String toString () {
        return "Business [Name=" + name + ", Address=" + address + ", City=" + city + ", State=" + state + "]";
    }
}