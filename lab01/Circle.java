import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

class Circle {
    public static void main(String[] args) throws IOException {
        if(args.length == 2) {
            int n = Integer.parseInt(args[0]);
            double r_max = Double.parseDouble(args[1]);
            Random obj = new Random();
            FileWriter file = new FileWriter("circle.dat");

            for(int i = 0; i < n; i++){
                double r = obj.nextDouble() * r_max;
                double angle = obj.nextDouble() * 360;

                double x = r * Math.cos(angle);
                double y = r * Math.sin(angle);

                file.write(x+" "+y+"\n");
            }
            file.close();
        }
        else
            System.out.println("Error");
    }
}
