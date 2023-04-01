//public class Main {
//    public static void main(String[] args) {
//        Play play = new Play();
////        System.out.println(play);
//        play.playGame();
//        System.out.println(play);
//    }
//}

import java.lang.reflect.*;

public class Main {
    public static void main(String[] args) {
        java.io.Console cin = System.console();
        String nazwaKlasy =
                " "
        ;
        while( ! nazwaKlasy.equals(
                " . ") ) {
        try
        {
            nazwaKlasy = cin.readLine(
                    "Podaj nazwe klasy: ");
            Class c = Class.forName(nazwaKlasy);
            Class[] typy = new Class[] { int
                    .class };
            Object obj = c.getConstructor(typy).newInstance(7);
            String nazwaPola = cin.readLine(
                    "Podaj nazwe: ");
            typy = new Class[] { };
            Method m = c.getMethod("get " + nazwaPola, typy);
            int x = (int) m.invoke(obj, new Object[0]);
            System.out.println(
                    " x = " + x);
                    x = Integer.valueOf(cin.readLine(
                            " x:"));
            m = c.getMethod(
                    "set " + nazwaPola, int.class);
            m.invoke(obj, x);
            System.out.println(obj);
        } catch(Exception e) { e.printStackTrace(); }
    }
    }

}