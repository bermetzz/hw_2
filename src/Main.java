public class Main {
    public static Printable createObject (String className){
        return switch (className) {
            case "Vk" -> new Vk("Vk", 1300, 500);
            case "Facebook" -> new Facebook("Facebook", 2000, 600, 350);
            case "YouTube" -> new YouTube("YouTube", 3100, 650);
            case "iPhone" -> new iPhone("iPhone", "11", "1792 x 828 resolution at 326 pixels per inch");
            case "Samsung" -> new Samsung("Samsung", "Galaxy s20", "64 megapixel");
            case "Sony" -> new Sony("Sony", "Xperia 1 iv", 128);
            default -> null;
        };
    }

    public static SocialMedia createObject1 (String className){
        return switch (className) {
            case "Vk" -> new Vk("Vk 1", 44394, 450);
            case "Facebook" -> new Facebook("Facebook 1", 8900, 550, 350);
            case "YouTube" -> new YouTube("YouTube 1", 58990, 700);
            default -> null;
        };
    }

    public static void main(String[] args){
        System.out.println(createObject("YouTube"));
        createObject("Vk").print();
        System.out.println("-------------------------");
        createObject("Facebook").print();
        System.out.println("-------------------------");
        createObject("iPhone").print();
        System.out.println("-------------------------");
        System.out.println(createObject1("Facebook").calculateTheCostOfAdditionalServices());
    }
}
