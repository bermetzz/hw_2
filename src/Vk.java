public class Vk extends SocialMedia{
    private int vkMusicPrice;

    public Vk(String name, int amountOfLikes, int vkMusicPrice) {
        super(name, amountOfLikes);
        this.vkMusicPrice=vkMusicPrice;
    }

    @Override
    public void print() {
        System.out.println("Amount of likes: "+getAmountOfLikes()
                +"\nname: "+getName()
                +"\nprice of Vk Music: "+vkMusicPrice);
    }

    @Override
    public int calculateTheCostOfAdditionalServices() {
        return vkMusicPrice;
    }
}
