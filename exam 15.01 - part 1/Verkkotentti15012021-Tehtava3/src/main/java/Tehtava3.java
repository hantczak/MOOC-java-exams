public class Tehtava3 {
    public static void main(String[] args) {
        Kitchen kitchen = new Kitchen();
        kitchen.addOrder(new Dish("Mekuma",15));
        kitchen.addOrder(new Dish("Antipasto Andy'ego",5));
        System.out.println(kitchen.checkShortestPreparingTimeAndRemove());
        kitchen.addOrder(new Dish("Mekuma",20));
        System.out.println(kitchen.deleteAllContainingGivenNameAndGetSummedCookingTime("Mekuma"));
        System.out.println(kitchen.orders());
    }
}
