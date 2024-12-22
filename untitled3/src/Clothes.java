public class Clothes {
    private String name;
    private String make;
    private String model;
    private String color;
    private String size;
    private float price;


    public Clothes(String name, String make, String model, String color, String size, float price) {
        this.name = name;
        this.make = make;
        this.model = model;
        this.color = color;
        this.size = size;
        this.price = price;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String toString() {
        return "Clothes{" +
                "name=" + name + '/' +
                ",make=" + make + '/' +
                ",model=" + model + '/' +
                ",color=" + color + '/' +
                ",size=" + size + '/' +
                ",price=" + price + ".}";
    }

}