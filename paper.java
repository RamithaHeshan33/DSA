public class paper {
    //method to sort using bubble sort
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for(int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if(arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }
            }

        }
    }

    //Method to search the element
    public static boolean searchElement(int[] arr, int value) {
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == value) {
                return true;
            }
        }
        return false;
    }

    //Method to print array
    public static void printArr(int[] arr){
        System.out.println("Array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {12,77, 54, 33, 402, 628, 88, 8};
        bubbleSort(arr);
        printArr(arr);

        int searchElement = 77;
        boolean found = searchElement(arr, searchElement);

        if(found) {
            System.out.println("Value " + searchElement + " found in the array!");
        }

        else {
            System.out.println("Value " + searchElement + " not found in the array!");
        }
    }


}
