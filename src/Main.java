
public class Main {

    public static void main(String[] args) {
        // Test 1
        // 16y 25y 29y=3 4k 3k 2k=3 =>6
        int y = 0;
        int k = 5;
        while (k > 2) {
            k = k - 1;
            y = y + k * k;
            System.out.println("y" + y);
            System.out.println("k" + k);
            // k=5-1=4k/ y=0+4*4=16y
            // k=4-1=3k/ y=16+3*3=16+9=25y
            // k=3-1=2k/ y=25+2*2=25+4=29y
        }

        System.out.println("\n");

        // Test 2
        // 48y=1 0k=1 =>2
        int y1 = 2;
        int k1;
        for (k1 = 4; k1 >= 1; k1--)
            y1 = y1 * k1;
        System.out.println("k" + k1);
        System.out.println("y" + y1);
        // y=2*4=8y/ k=4
        // y=8*3=24y/ k=3
        // y=24*2=48y/ k=2 => k--=1=0

        System.out.println("\n");

        // Test 3
        // 5y=1 5k=1 =>2
        int y2 = 0;
        int k2;
        for (k2 = 4; k2 <= 4; k2++)
            y2 = y2 * 10;
        y2 = y2 + k2;
        System.out.println("k" + k2);
        System.out.println("y" + y2);
        // k=4++=5 / y=5+0=5

        // Test 4
        // int number = 10.0; +
        int number2 = 1_2_3;
        float number3 = 0xA;
        int number4 = 0xA;

        System.out.println("\n");

        // Test 5
        // 3
        boolean a = true;
        boolean b = false;
        boolean c = true;
        if (a == true) {
            if (b == true) {
                if (c == true) {
                    System.out.println("1");
                } else
                    System.out.println("2");

            } else if (a && (b = c)) {
                System.out.println("3");
            }

        } else {
            System.out.println("4");
        }

        System.out.println("\n");

        // Test 6
        // CE
        // for (short i = 32766; i <= 32767; i = i + 1) {
        // System.out.println(i);
        // }

        // Test 7
        // loop
        // int n = 1;
        // do {
        //     for (int i = 0; i < n++; i++) {
        //         System.out.println("*");
        //     }
        //     System.out.println();
        // } while (n < 5);
    }
}