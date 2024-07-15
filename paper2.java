public class paper2 {
    //Method to sort
    public static void sort(int[] arr) {
        int n = arr.length;
        for(int i = 0; i < n - 1; i++) {
            for(int j = 0; j < n - i - 1; j++) {
                if(arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static boolean search(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                return true;
            }
        }

        return false;
    }

    public static void print(int[] arr) {
        System.out.println("Array: ");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {93, 10, 87, 80, 34, 104, 100, 23, 66};

        sort(arr);
        print(arr);

        int searchValue = 34;
        boolean found = search(arr, searchValue);
        if(found) {
            System.out.println("Value " + searchValue + " found in array!");
        }

        else {
            System.out.println("Value " + searchValue + " not found in array!");
        }
    }
}
