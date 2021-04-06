package sessions3;

public class vidu4 {
    public static void main(String[] args) {
        String inStr = "5566";
        int number = Integer.parseInt(inStr);
        //Input to Interper.parseInt() must be a valid integer literal

        String inStr1 ="55.66";
        float aFloat = Float.parseFloat(inStr);
        double aDouble = Double.parseDouble("1.2345");
        aDouble = Double.parseDouble("1.2e - 3");
        //Input to Interger.parseInt() must be a valid double literal
        //aDouble = Double.parseDouble("abc");

        String msg = "Hello,world";
        char msgChar;
        for (int idx = 0; idx < msg.length(); ++idx) {
            msgChar = msg.charAt(idx);
        }
        String boolStr = "true";
        boolean done = Boolean.parseBoolean(boolStr);
        boolean valid = Boolean.parseBoolean("false");
    }
}
