import java.io.Serializable;

public class Vehicle implements Serializable {
    private int id;
    private String type;
    private String Manufacturer;

    public Vehicle(int id, String type, String manufacturer) {
        this.id = id;
        this.type = type;
        this.Manufacturer = manufacturer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setManufacturer(String manufacturer) {
        Manufacturer = manufacturer;
    }

    public String getType() {
        return type;
    }

    public String getManufacturer() {
        return Manufacturer;
    }
}
