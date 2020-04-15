import java.util.Scanner;

public class Chats {
    public static void main(String[] args){

        String name;
        String day;
        String reason;
        Scanner input = new Scanner(System.in);
        System.out.println(" Welcome to ElizaChats! My name is Eliza," + "\n" + "What's your name?");
        name = input.nextLine();
        System.out.println("Nice to meet you, " + name + ", How has your day been? ");
        day = input.nextLine();
        System.out.println("Okay, Anything in particular that makes you feel that " + day + "?");
        reason  = input.nextLine();
        System.out.println("Okay, Well it has been my pleasure to speak with you. Have a nice day!");
        System.out.println("Here are your responses: " + name + "," + day + "," + reason );






    }
}
