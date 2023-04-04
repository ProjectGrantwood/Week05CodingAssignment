package Week05CodingAssignment;

import java.lang.StringBuilder;

public class SpacedLogger implements Logger {
    @Override
    public void Log(String msg){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < msg.length() - 1; i++){
            sb.append(msg.charAt(i));
            sb.append(" ");
        }
        sb.append(msg.charAt(msg.length() - 1));
        System.out.println(sb.toString());
    }
    @Override
    public void Error(String err){
        StringBuilder sb = new StringBuilder();
        sb.append("ERROR: ");
        for (int i = 0; i < err.length() - 1; i++){
            sb.append(err.charAt(i));
            sb.append(" ");
        }
        sb.append(err.charAt(err.length() - 1));
        System.out.println(sb.toString());
    }
}
