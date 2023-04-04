package Week05CodingAssignment;

public class AsteriskLogger implements Logger {
    private String asterisks = "***";
    @Override
    public void Log(String msg){
        System.out.println(this.asterisks + msg + this.asterisks);
    }
    @Override
    public void Error(String err){
        System.out.println(this.asterisks + "ERROR: " + err + this.asterisks);
    }
}
