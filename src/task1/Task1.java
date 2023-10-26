package task1;

/**
 * 1.Внедрить итератор из задания 2 в коллекцию,
 * написанную в задании 3 таким образом,
 * чтобы итератор был внутренним классом и,
 * соответственно, объектом в коллекции.
 */
public class Task1 {
    public static void main(String[] args) {
        Generic<String> list= new Generic<>();
        list.add("5");
        list.add("8");
        list.add("10");
        for (String str : list) {
            System.out.println(str);
        }


    }
}