public class User{
    private String username;

    public User(String username){
        this.username = username;
    }
    public String getUsername(){
        return username;
    }

    public void recieveMessage(String message){
        System.out.println('[' + username + ']' + message);
    }
}