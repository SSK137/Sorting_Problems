public class Insertion_Sort {
    public static void insertionSort(int array[]) {
        int n = array.length;
        for (int j = 1; j < n; j++) {
            int key = array[j];
            int i = j-1;
            while ( (i > -1) && ( array [i] > key ) ) {
                array [i+1] = array [i];
                i--;
            }
            array[i+1] = key;
        }
    }

    public static void main(String[] args) {
        int arr[] ={12,3,6,33,78,99,2,1};

        System.out.println("Array Before Sorting");
        for(int i=0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        insertionSort(arr);
        System.out.println("Array After Sorting");
        for(int i=0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }

    }
}