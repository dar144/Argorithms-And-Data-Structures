import java.util.Random;

public non-sealed class RandomWord extends RandomString {
    RandomWord(int length) {
        super(length);
    }

    @Override
    public String rand() {
        String characters = "qwertyuiopasdfghjklzxcvbnm";
        String result = "";
        int id;
        Random r = new Random();

        for(int i = 0; i < super.getLength(); i++) {
            id = (int) Math.floor(r.nextDouble()*characters.length());
            result += characters.charAt(id);
        }

        return result;
    }
}
