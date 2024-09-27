import java.util.ArrayList;
import java.util.List;
public class ChatRoom {
    private String roomId;
    private List<User> users;
    private List<String> messageHistory;

    private static ChatRoom instance;

    private ChatRoom(String roomId){
        this.roomId = roomId;
        this.users = new ArrayList<>();
        this.messageHistory = new ArrayList<>();
    }

    public static ChatRoom getInstance(String roomId){
        if(instance == null){
            instance = new ChatRoom(roomId);
        }
        return instance;
    }

    public void join(User user){
        users.add(user);
        System.out.println(user.getUsername()+" has joined the chat room" + roomId);
    }
    public void leave(User user){
        users.remove(user);
        System.out.println(user.getUsername()+" has left the chat" + roomId);
    }
    public void sendMessage(User user, String message){
        String formattedMessage = user.getUsername()+": "+message;
        messageHistory.add(formattedMessage);
        notifyUsers(formattedMessage);
    }
    public void notifyUsers(String message){
        for(User user:users){
            user.recieveMessage(message);
        }
    }
    public void displayActiveUsers(){
        System.out.println("Active users in chat room: " + roomId);
        for(User user:users){
            System.out.println(user.getUsername());
        }
    }

    public void displayMessageHistor(){
        System.out.println("Message History in room "+ roomId + ":");
        for(String message : messageHistory){
            System.out.println(message);
        }
    }
}
