import java.util.*;

public class Main {

    static void addToCollection(Collection<Item<String>> col, ArrayList<Item> students) {
        long startTime = System.nanoTime();
        for(Item<String> i: students) {
            col.add(i);
        }
        long Time = System.nanoTime() - startTime;
        System.out.println("" + col.getClass().getName() + ": " + Time/1e6 + " ms");
    }

    public static void main(String[] args) {
        Random r = new Random();

        ArrayList<Item> students1 = new ArrayList<Item>(100000);
        ArrayList<Item> students2 = new ArrayList<Item>(300);
        ArrayList<Item> students3 = new ArrayList<Item>(300);

        for(int i = 0; i < 100000; i++) {
            students1.add(new Item<String>(RandomString.nextString(4), RandomString.nextString(8), UUID.randomUUID()));
        }
        for(int i = 0; i < 300; i++) {
            students2.add(students1.get(r.nextInt(students1.size())));
        }
        for(int i = 0; i < 300; i++) {
            students3.add(new Item<String>(RandomString.nextString(4), RandomString.nextString(8), UUID.randomUUID()));
        }

        ArrayList<Item<String>> arrayList = new ArrayList<Item<String>>();
        LinkedList<Item<String>> linkedList = new LinkedList<Item<String>>();
        HashSet<Item<String>> hashSet = new HashSet<Item<String>>();

        System.out.println();
        System.out.println("Wstawianie elementow");
        long startTimeAL = System.nanoTime();
        for(Item<String> i: students1) {
            arrayList.add(i);
        }
        long TimeAL = System.nanoTime() - startTimeAL;
        System.out.println("ArrayList: " + TimeAL/1e6 + " ms");
//        arrayList.clear();
//        addToCollection(arrayList, students1);

        long startTimeLL = System.nanoTime();
        for(Item<String> i: students1) {
            linkedList.add(i);
        }
        long TimeLL = System.nanoTime() - startTimeLL;
        System.out.println("LinkedList: " + TimeLL/1e6 + " ms");

        long startTimeHS = System.nanoTime();
        for(Item<String> i: students1) {
            hashSet.add(i);
        }
        long TimeHS = System.nanoTime() - startTimeHS;
        System.out.println("HashSet: " + TimeHS/1e6 + " ms");



        arrayList.clear();
        linkedList.clear();

        System.out.println();
        System.out.println("Wstawianie elementow (dodawanie nowego elementu w miejsce o indeksie 0)");
        startTimeAL = System.nanoTime();
        for(Item<String> i: students1) {
            arrayList.add(0, i);
        }
        TimeAL = System.nanoTime() - startTimeAL;
        System.out.println("ArrayList: " + TimeAL/1e6 + " ms");

        startTimeLL = System.nanoTime();
        for(Item<String> i: students1) {
            linkedList.add(0, i);
        }
        TimeLL = System.nanoTime() - startTimeLL;
        System.out.println("LinkedList: " + TimeLL/1e6 + " ms");



        System.out.println();
        System.out.println("Wyszukanie (students2)");

        startTimeAL = System.nanoTime();
        for(Item<String> i: students2) {
            arrayList.contains(i);
        }
        TimeAL = System.nanoTime() - startTimeAL;
        System.out.println("ArrayList: " + TimeAL/1e6 + " ms");

        startTimeLL = System.nanoTime();
        for(Item<String> i: students2) {
            linkedList.contains(i);
        }
        TimeLL = System.nanoTime() - startTimeLL;
        System.out.println("LinkedList: " + TimeLL/1e6 + " ms");

        startTimeHS= System.nanoTime();
        for(Item<String> i: students2) {
            hashSet.contains(i);
        }
        TimeHS = System.nanoTime() - startTimeHS;
        System.out.println("HashSet: " + TimeHS/1e6 + " ms");


        System.out.println();
        System.out.println("Wyszukanie (students3)");

        startTimeAL = System.nanoTime();
        for(Item<String> i: students3) {
            arrayList.contains(i);
        }
        TimeAL = System.nanoTime() - startTimeAL;
        System.out.println("ArrayList: " + TimeAL/1e6 + " ms");

        startTimeLL = System.nanoTime();
        for(Item<String> i: students3) {
            linkedList.contains(i);
        }
        TimeLL = System.nanoTime() - startTimeLL;
        System.out.println("LinkedList: " + TimeLL/1e6 + " ms");

        startTimeHS= System.nanoTime();
        for(Item<String> i: students3) {
            hashSet.contains(i);
        }
        TimeHS = System.nanoTime() - startTimeHS;
        System.out.println("HashSet: " + TimeHS/1e6 + " ms");
    }
}