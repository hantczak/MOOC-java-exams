public class Receiver implements Router{
    private String name;

    public Receiver(String name) {
        this.name = name;
    }

    public void route(Message message){
        System.out.println(this.name + ": " + message.getContent());
    }
}
