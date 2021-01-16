public class Repeater implements Router {
    private Router router;

    public Repeater(Router router){
        this.router = router;
    }

    public void route(Message message){
        router.route(message);
    }
}
