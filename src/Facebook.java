public class Facebook extends SocialMedia {
    private int priceOfMonthlySubscription;
    private int priceOfAds;

    public Facebook(String name, int amountOfLikes, int priceOfMonthlySubscription, int priceOfAds) {
        super(name, amountOfLikes);
        this.priceOfMonthlySubscription=priceOfMonthlySubscription;
        this.priceOfAds=priceOfAds;
    }

    @Override
    public void print() {
        System.out.println("Amount of likes: "+getAmountOfLikes()
                +"\nname: "+getName()
                +"\nprice of Monthly Subscription: "+priceOfMonthlySubscription
                +"\nprice of Ads: "+priceOfAds);
    }

    @Override
    public int calculateTheCostOfAdditionalServices() {
        return priceOfAds+priceOfMonthlySubscription;
    }
}
