public class Sony extends Phone{
    private int storage;

    public Sony(String name, String model, int storage) {
        super(name, model);
        this.storage = storage;
    }

    @Override
    public void print() {
        System.out.println("name: "+getName()
        +"\nmodel: "+getModel()
        +"\nstorage: "+storage);
    }
}
