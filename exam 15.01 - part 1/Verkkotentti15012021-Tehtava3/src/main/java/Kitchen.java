import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class Kitchen {
    private List<Dish> dishList;

    public Kitchen() {
        this.dishList = new ArrayList<>();
    }

    public void addOrder(Dish order) {
        this.dishList.add(order);
    }

    public List<Dish> orders() {
        return this.dishList;
    }

    public int checkShortestPreparingTimeAndRemove() {
        if (dishList.size() == 0) {
            return 0;
        }
        Dish quickestDish = dishList.stream()
                .sorted()
                .findFirst().get();
        dishList.remove(quickestDish);
        return quickestDish.getCookingTime();
    }

    public int deleteAllContainingGivenNameAndGetSummedCookingTime(String name) {
        AtomicBoolean ifContains = new AtomicBoolean();
        ifContains.set(false);
        AtomicInteger summedTime = new AtomicInteger();

        dishList.stream()
                .forEach(dish -> {
                    if (dish.getName().contains(name)) {
                        summedTime.addAndGet(dish.getCookingTime());
                        ifContains.set(true);
                    }
                });
        List<Dish> newList = dishList.stream()
                .filter(dish->!dish.getName().contains(name))
                .collect(Collectors.toCollection(ArrayList::new));
        this.dishList = newList;

        if(ifContains.get()==false){
            return 0;
        }
        return summedTime.get();
    }
}
