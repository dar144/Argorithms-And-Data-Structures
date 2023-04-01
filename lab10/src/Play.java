import java.util.InputMismatchException;
import java.util.Scanner;

public class Play {
    private String[][] board = new String[3][3];
    Play() {
        for(int i = 0; i < 3; i++)
            for(int j = 0; j < 3; j++)
                board[i][j] = ".";
    }

    public void excI(int i) {
        if(i < 0) throw new CellNotExistsException();
        else if(i > 3) throw new CellNotExistsException();
    }

    public void excJ(int j) {
        if(j < 0) throw new CellNotExistsException();
        else if(j > j) throw new CellNotExistsException();
    }
    public void playGame() {
        Scanner sc = new Scanner(System.in);
        int player = 1;
        int i = 0;
        int j = 0;
        int counter = 0;

        while(counter < 9) {
            if(player == 1)
                System.out.println("Player one");
            else if(player == -1)
                System.out.println("Player two");

            try {
                System.out.print("i: ");
                i = sc.nextInt();
                excI(i);
            } catch (InputMismatchException e) {
                System.err.println("Try again: enter integer value");
                sc.nextLine();
                continue;
            } catch (CellNotExistsException e) {
                System.err.println("Try again: number must be between 0 and 2");
                sc.nextLine();
                continue;
            }

            try {
                System.out.print("j: ");
                j = sc.nextInt();
                excJ(j);
            } catch (InputMismatchException e) {
                System.err.println("Try again: enter integer value");
                sc.nextLine();
                continue;
            } catch (CellNotExistsException e) {
                System.err.println("Try again: number must be between 0 and 2");
                sc.nextLine();
                continue;
            }

            addCell(i, j, player);
            player *= -1;

            counter++;
        }
    }

    public void addCell(int i, int j, int player) {
        if(player == 1)
            board[i][j] = "o";
        else if(player == -1)
            board[i][j] = "x";
    }

    @Override
    public String toString() {
        String result = "";
        for(int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                result += board[i][j] + " ";
            }
            result += "\n";
        }
        return result;
    }
}
