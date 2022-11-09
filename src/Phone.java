public abstract class Phone implements Printable {
    private String name;
    private String model;

    public Phone(String name, String model) {
        this.name = name;
        this.model = model;
    }

    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }
}
