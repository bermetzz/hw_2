public abstract class SocialMedia implements Printable{
    private String name;
    private int amountOfLikes;

    public SocialMedia(String name, int amountOfLikes) {
        this.name = name;
        this.amountOfLikes = amountOfLikes;
    }

    public String getName() {
        return name;
    }

    public int getAmountOfLikes() {
        return amountOfLikes;
    }

    public abstract int calculateTheCostOfAdditionalServices();
}
