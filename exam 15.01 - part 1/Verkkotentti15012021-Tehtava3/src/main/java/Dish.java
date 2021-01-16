public class Dish implements Comparable<Dish>{
    private String name;
    private int cookingTime;

    public Dish(String name, int cookingTime) {
        this.name = name;
        this.cookingTime = cookingTime;
    }

    public int compareTo(Dish dish){
        return this.cookingTime-dish.cookingTime;
    }

    public int getCookingTime(){
        return this.cookingTime;
    }

    public String getName(){
        return this.name;
    }

    public String toString(){
        return this.getName();
    }
}