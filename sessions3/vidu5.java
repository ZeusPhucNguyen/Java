package sessions3;

public class vidu5 {
    public static void main(String[] args) {
        String str1 = 123 + "";
        String str2 = 12.34 + "";
        String str3 = 'c' + "";
        String str4 = true + "";

        //Using String.valueOf(aPrimitive)
        String str5 = String.valueOf(12345);
        String str6 = String.valueOf(true);
        String str7 = String.valueOf(55.66);
        //Using toString() for each primitive type
        String str8 = Integer.toString(1234);
        String str9 = Double.toString(1.23);
        String str10 = Character.toString('z');
    }
}
