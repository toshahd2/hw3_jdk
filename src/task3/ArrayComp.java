package task3;

public class Array {

    public <T> boolean compareArrays(T[] arr1, T[] arr2, boolean checkElType) {
        boolean check = typeCheck(arr1) && typeCheck(arr2);
        if (checkElType && !check) {
            return false;
        }
        return arr1.length == arr2.length;
    }

    public boolean typeCheck(Object[] arr) {
        if (arr == null || arr.length == 0) {
            return true;
        }

        Class<?> type = arr[0].getClass();

        for (Object element : arr) {
            if (element == null || !element.getClass().equals(type)) {
                return false;
            }
        }

        return true;
    }
}
