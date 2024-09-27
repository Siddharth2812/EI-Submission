public class ChatApp {
    public static void main(String[] args){
        User alice = new User("Alice");
        User bob = new User("Bob");
        User charles = new User("Charles");

        ChatRoom room123 = ChatRoom.getInstance("room123");
        room123.join(charles);
        room123.join(bob);
        room123.join(alice);

        room123.displayActiveUsers();

        room123.sendMessage(alice, "Hello, everyone!");
        room123.sendMessage(bob, "How's it going?");
        room123.sendMessage(charles, "Goodbye!");
        
        room123.displayMessageHistor();
        
        room123.leave(bob);

        room123.displayActiveUsers();
        }
}
