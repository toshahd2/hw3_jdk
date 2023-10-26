package task4;

/**
 * 4.Напишите обобщенный класс Pair,
 * который представляет собой пару значений разного типа.
 * Класс должен иметь методы getFirst(), getSecond()
 * для получения значений пары,
 * а также переопределение метода toString(),
 * возвращающее строковое представление пары.
 */

public class Task4 {
    public static void main(String[] args) {
        Pair<Double, String> pair = new Pair<>(10.0, "String");
        System.out.println(pair.getFirst() + " " + pair.getSecond());
    }
}
