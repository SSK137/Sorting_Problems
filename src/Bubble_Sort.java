public class Bubble_Sort {
    static void bubbleSort(int[] arr) {
        int temp = 0;
        for(int i=0; i < arr.length; i++){
            for(int j=1; j < (arr.length-i); j++){
                if(arr[j-1] > arr[j]){
                    //swap elements
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int arr[] ={12,3,6,33,78,99,2,1};

        System.out.println("Array Before Sorting");
        for(int i=0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        bubbleSort(arr);//sorting array elements using bubble sort

        System.out.println("Array After Sorting");
        for(int i=0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }

    }
}