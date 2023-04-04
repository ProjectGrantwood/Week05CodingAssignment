package Week05CodingAssignment;

public class App {
    public static void main(String[] args){
        String message1 = "Have you ever danced with the Devil in the Pale Moonlight?";
        String error1 = "Let me tell you this: The older you do get, the more rules they're gonna try to get you to follow.";
        String message2 = "So at last, we meet for the first time, for the last time.";
        String error2 = "I just want to say one word to you: Plastics.";
        AsteriskLogger asterisk = new AsteriskLogger();
        SpacedLogger space = new SpacedLogger();
        lineBreak();
        System.out.println("Testing instance of AsteriskLogger's Log() method: ");
        asterisk.Log(message1);
        lineBreak();
        System.out.println("Testing instance of AsteriskLogger's Error() method: ");
        asterisk.Error(error1);
        lineBreak();
        System.out.println("Testing instance of SpacedLogger's Log() method: ");
        space.Log(message2);
        lineBreak();
        System.out.println("Testing instance of SpacedLogger's Error() method: ");
        space.Error(error2);
    }
    public static void lineBreak() {
        System.out.println("");
    }
}
