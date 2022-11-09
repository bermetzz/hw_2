public class iPhone extends Phone{
    private String screenResolution;

    public iPhone(String name, String model, String screenResolution) {
        super(name, model);
        this.screenResolution = screenResolution;
    }

    @Override
    public void print() {
        System.out.println("name: "+getName()
                +"\nmodel: "+getModel()
                +"\nscreen resolution: "+screenResolution);
    }
}
