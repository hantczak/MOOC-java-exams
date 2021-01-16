public class Message{
    private String address;
    private String content;

    public Message(String address, String content){
        this.address = address;
        this.content = content;
    }

    public String getContent(){
        return this.content;
    }
}
