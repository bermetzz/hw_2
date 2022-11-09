public class Samsung extends Phone{
    private String cameraResolution;

    public Samsung(String name, String model, String cameraResolution) {
        super(name, model);
        this.cameraResolution = cameraResolution;
    }

    @Override
    public void print() {
        System.out.println("name: "+getName()
                +"\nmodel: "+getModel()
                +"\ncamera resolution: "+cameraResolution);
    }
}
