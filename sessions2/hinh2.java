package sessions2;

public class hinh2 {
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            System.out.println();
            for (int j = 0; j < 60; j++) {
                if (j % 4 == 0) {
                    System.out.print("|");
                } else {
                    System.out.print("-");
                }
            }
        }
        }
    }
