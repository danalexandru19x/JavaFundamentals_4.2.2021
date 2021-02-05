import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysStrings {

    public void maximumProduct() {
        int[] array = {1, 2, 4, -5, -8, 15};
        int product = 0;
        int maxProduct;
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length - 1; j++) {
                if (array[i] * array[j] > product) {
                    product = array[i] * array[j];
                }
            }
        }
        System.out.println("The maximum product of the array is : " + product);
    }

    public void specificValue(int a) {
        int[] array = {1, 6, 7, 8, 9, 15};
        for (int i = 0; i < array.length; i++) {
            if (array[i] == a) {
                System.out.println("The element is found in the array");
            } else {
                System.out.println("The element is not found in the array");
            }
        }
    }

    public void removeElement(int x) {
        int[] array = {1, 5, 3, 6, 7, 8, 15};
        List arrayList = Arrays.asList(array);
        for (int i = 0; i < array.length; i++) {
            if (array[i] == x) {
                arrayList.remove(array[i]);
            }
        }
        System.out.println("Array without number is : " + arrayList);
    }

    public void maxNumber() {
        int[] array = {1, 4, 5, 7, 8, 9, 11, 6, 2};
        int max = 0;
        int y = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        for (int i : array) {
            if (y < max) {
                if (i > y) {
                    y = i;
                }
            }
        }

        System.out.println("Biggest number is : " + max);
        System.out.println("Second biggest number is :" + y);
    }

    public void duplicateValues() {
        String[] array = {"Palma", "Mana", "Fata", "Nas", "Nas", "Frunte"};
        String duplicate = "";
        ArrayList<String> stringArrayList = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (array[i].equals(array[j])) {
                    duplicate = array[i];
                    stringArrayList.add(duplicate);
                    break;
                }
            }
        }
        String string = String.join(",",stringArrayList);
        System.out.println("Duplicate strings are : " + string);
    }

}
