import java.lang.reflect.*;

public class Lab11 {
    public static void main(String[] args){
        try {
            Class c = Class.forName("Unknown");
            Constructor[] constructors = c.getDeclaredConstructors();
            Method[] methods = c.getDeclaredMethods();
            Class[] classes = c.getClasses();
            Field[] fieldsDirection = classes[0].getDeclaredFields();

            for (int i = 0; i < fieldsDirection.length; ++i) {
                System.out.println(fieldsDirection[i]);
            }

            Constructor constr = c.getDeclaredConstructor(int.class);
            constr.setAccessible(true);
//            Object obj = constr.newInstance(1);

            Method method = c.getDeclaredMethod("valueOf", int.class, int.class, java.lang.String.class, double[].class);
            method.setAccessible(true);
            double[] arr = {2.3, 3.4, 5.6};
            Object obj = method.invoke(null, 1, 2, "ala", arr);
            System.out.println(obj);
        } catch(Exception e) { e.printStackTrace(); }
    }
}
