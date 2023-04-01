import lombok.Getter;

import java.util.Random;

public final class RandomString {
    /**
     * Gererates pseudorandom String of length {@code length}.
     *
     * @param length length of the generated String.
     * @return pseudorandom String.
     */
    public static String nextString(int length) {
        if (length < 1) {
            throw new IllegalArgumentException("Length of a String must be positive!");
        }
        String str = "" + Character.toUpperCase(letters.charAt(random.nextInt(letters.length())));
        for (int i = 1; i < length; ++i) {
            str += letters.charAt(random.nextInt(letters.length()));
        }
        return str;
    }

    @Getter
    private final static Random random = new Random();
    private final static String letters = "abcdefghijklmnopqrstuvwxyz";
}
