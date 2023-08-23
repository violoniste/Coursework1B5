public class Main {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 20 - i;
            System.out.print(arr[i] + ", ");
        }
        System.out.println();

        int[] newArr = modify(arr);

        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + ", ");
        }
    }

    public static int[] modify(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                arr[i] = arr[i] + 1;
            }
        }

        int[] newArr = new int[5];
        for (int i = 3; i <= 7; i++) {
            newArr[i - 3] = arr[i];
        }
//        System.arraycopy(arr, 3, newArr, 0, 5);       - вариант который предложила IDE
        return newArr;
    }
}