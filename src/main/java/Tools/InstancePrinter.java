package Tools;


import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class InstancePrinter {

    public static void printInstanceDetails(Object obj) {
        try {
            Class<?> clazz = obj.getClass();
            List<Field> fields = new ArrayList<>();
            fields.addAll(List.of(clazz.getDeclaredFields()));
            if (clazz.getSuperclass() != null) {
                fields.addAll(List.of(clazz.getSuperclass().getDeclaredFields()));
            }
            String nameValue = "";
            for (Field field : fields) {
                if (field.getName().equals("name")) {
                    field.setAccessible(true);
                    nameValue = (String) field.get(obj);
                    break;
                }
            }

            System.out.println("\n---> " + clazz.getSimpleName() + ": " + nameValue + " details <---");

            for (Field field : fields) {
                if (field.getName().equals("name")) {
                    field.setAccessible(true);
                    Object value = field.get(obj);
                    System.out.println(field.getName() + ": " + value);
                    fields.remove(field); // Remove 'name' to avoid re-printing
                    break;
                }
            }
            for (Field field : fields) {
                field.setAccessible(true);
                Object value = field.get(obj);
                System.out.println(field.getName() + ": " + value);
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
            System.err.println("Failed to print instance details for: " + obj.getClass().getSimpleName());
        }
    }
}



