import java.util.Random;

public final class LoremIpsum extends RandomString {
    LoremIpsum(int length) {
        super(length);
    }

    @Override
    public String rand() {
        String charactersB = "QWERTYUIOPASDFGHJKLZXCVBNM";
        String charactersL = "qwertyuiopasdfghjklzxcvbnm ";
        String result = "";
        int id;
        Random r = new Random();

        for(int i = 0; i < super.getLength(); i++) {
            if(i == 0) {
                id = (int) Math.floor(r.nextDouble()*charactersB.length());
                result += charactersB.charAt(id);
            } else if (i == super.getLength()-1){
                result += ".";
            } else {
                id = (int) Math.floor(r.nextDouble()*charactersL.length());
                result += charactersL.charAt(id);
            }
        }

        return result;
    }
}
