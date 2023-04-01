public class Test {
    String napis = "moj Test";

    public Test() {
    }

    public Test(String s) {
        napis = s;
    }

    String test1(String s) {
        return "test1(" + s + ")";
    }
    String test1() {
        return "test1(): " + napis;
    }
    String t() {
        return "t1(): " + napis;
    }
}