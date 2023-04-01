public sealed abstract class RandomString
permits RandomWord, LoremIpsum {
    private int length;

    RandomString(int length) {
        this.length = length;
    }

    public abstract String rand();

    public int getLength() {
        return length;
    }

}
