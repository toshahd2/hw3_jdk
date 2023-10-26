package task3;

/**
 * 3.Напишите обобщенный метод compareArrays(),
 * который принимает два массива и возвращает true,
 * если они одинаковые, и false в противном случае.
 * Массивы могут быть любого типа данных,
 * но должны иметь одинаковую длину
 * и содержать элементы одного типа.
 */
public class Task3 {
    public static void main(String[] args) {
        ArrayComp check = new ArrayComp();
        Integer[] arr1 = {2, 4, 6};
        Integer[] arr2 = {3, 5, 7};
        Integer[] arr3 = {3, 5, 7, 9};
        System.out.println(check.compareArrays(arr1, arr2));
        System.out.println(check.compareArrays(arr1, arr3));
    }
}
