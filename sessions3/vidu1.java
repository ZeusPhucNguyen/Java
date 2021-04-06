package sessions3;

public class vidu1 {
    public static void main(String[] args) {
        char c1 = '0';
        char c2 = 'A';
        char c3;

        // char <-> int (interchangeable)
        System.out.println((int)c1); //Print int 48
        System.out.println((int)c2); //Print int 65
        c3 = 97;
        System.out.println(c3);
        System.out.println((char)97);

        // char + char -> int + int -> int
        // c3 = c1 + c2;
        c3 = (char)(c1+c2);
        System.out.println(c3);
        System.out.println(c1 + c2);
        System.out.println((char)(c1 + c2));

        //char + int -> int + int -> int
        // c3 = c1 + 5;
        c3 = (char)(c1+5);
        System.out.println(c3);
        System.out.println(c1 + 5);

        //Print the code number for 'a' to 'z'
        for (int codeNum = 'a'; codeNum <= 'z'; ++codeNum){
            System.out.println((char)codeNum + ":" + codeNum);
        }
        char c4 = '0';
        c4 += 5;
        System.out.println(c4);

        //print char '0' to '9' via incremant
        for (char c = '0'; c <= '9'; c++){
            System.out.println(c);
        }
    }
}
