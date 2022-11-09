public class YouTube extends SocialMedia{
    private int priceOfYouTubePremium;

    public YouTube(String name, int amountOfLikes, int priceOfYouTubePremium) {
        super(name, amountOfLikes);
        this.priceOfYouTubePremium=priceOfYouTubePremium;
    }

    @Override
    public void print() {
        System.out.println("Amount of likes: "+getAmountOfLikes()
        +"\nname: "+getName()
        +"\nprice of YouTube Premium: "+priceOfYouTubePremium);
    }

    @Override
    public int calculateTheCostOfAdditionalServices() {
        return priceOfYouTubePremium;
    }
}
