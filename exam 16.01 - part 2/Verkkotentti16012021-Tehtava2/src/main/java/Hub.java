import java.util.ArrayList;
import java.util.List;

public class Hub implements Router{
    List<Router> routerList;

    public Hub(){
        this.routerList = new ArrayList<>();
    }

    public void addRouter(Router router){
        this.routerList.add(router);
    }

    public void route(Message message){
        routerList.forEach(router->router.route(message));
    }
}
