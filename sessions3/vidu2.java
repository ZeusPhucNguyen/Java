package sessions3;

public class vidu2 {
    public static void main(String[] args) {
        //Converting a hex char ( 0-9 | A-F | a-f ) to its equivalent decimal ( 0-15)
        char hexChar = 'a';
        int dec;

        if ( hexChar >= '0' && hexChar <= '9'){
            dec = hexChar - '0';        // int 0-9
        }else if (hexChar >='A' && hexChar <='F'){
            dec = hexChar - 'A' + 10; //int 10-15;
        }else if (hexChar >='a' && hexChar <= 'f'){
            dec = hexChar - 'a' +10; //int 10 -15
        }else {
            dec = -1;
            System.out.println("Invalid hex char");
        }
        System.out.println(hexChar + ":" + dec);
    }

}
