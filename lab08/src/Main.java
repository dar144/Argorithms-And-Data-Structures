import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        RandomString rs1 = new RandomWord(15);
        System.out.println(rs1.rand());
        RandomString rs2 = new LoremIpsum(50);
        System.out.println(rs2.rand());

        System.out.println();

        Scanner scanner = new Scanner(new RandomWordAdapter(25, 10));
        while (scanner.hasNext())
            System.out.println(scanner.next());
    }
}