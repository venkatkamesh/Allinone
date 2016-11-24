package com.venkatkamesh.allinone;

public class SortArray {

    //program for bubble sort
    public static int[] bubbleSort(int[] array) {

        for(int i=0; i<array.length; i++){
            for(int j=0; j<array.length-1; j++){
                if(array[j]>array[j+1]){
                    int t=array[j];
                    array[j]=array[j+1];
                    array[j+1]= t;
                }
            }
        }

        return array;
    }

    //program for selection sort
    public static int[] selectionSort(int[] array) {
        for(int i=0; i<array.length; i++){
            for(int j=i+1;j<array.length-1; j++){
                if(array[i]>array[j]){
                    int t=array[i];
                    array[i]=array[j];
                    array[j]=t;
                }
            }
        }
        return array;
    }

    //program for merge sort
    public static int[] mergeSort(int[] array) {
        if (array.length > 1){
            int[] left = leftHalf(array);
            int[] right = rightHalf(array);
            mergeSort(left);
            mergeSort(right);
            merge(array, left, right);
        }
        return array;
    }
    public static int[] leftHalf(int[] array){
        int size1 = array.length / 2;
        int[] left = new int[size1];
        for (int i = 0; i < size1; i++){
            left[i] = array[i];
        }
        return left;
    }
    public static int[] rightHalf(int[] array){
        int size1 = array.length / 2;
        int size2 = array.length - size1;
        int[] right = new int[size2];
        for (int i = 0; i < size2; i++){
            right[i] = array[i + size1];
        }
        return right;
    }
    public static void merge(int[] result,int[] left, int[] right){
        int i1 = 0;
        int i2 = 0;
        for (int i = 0; i < result.length; i++){
            if (i2 >= right.length || (i1 < left.length && left[i1] <= right[i2])){
                result[i] = left[i1];
                i1++;
            }else{
                result[i] = right[i2];
                i2++;
            }
        }
    }

    //program for insertion sort
    public static int[] insertionSort(int[] array) {
        for(int i=0;i<array.length;i++){
            for(int j=i;j>0;j--){
                if(array[j]<array[j-1]){
                    int t=array[j];
                    array[j]=array[j-1];
                    array[j-1]=t;
                }
            }
        }
        return array;
    }

    //program for quick sort
    public static int[] quickSort(int[] array){
        recursiveQuickSort(array, 0, array.length - 1);
        return array;
    }
    public static void recursiveQuickSort(int[] array, int startIdx, int endIdx) {
        int idx = partition(array, startIdx, endIdx);
        if (startIdx < idx - 1) {
            recursiveQuickSort(array, startIdx, idx - 1);
        }
        if (endIdx > idx){
            recursiveQuickSort(array, idx, endIdx);
        }
    }
    public static int partition(int[] array, int left, int right){
        int pivot = array[left];
        while (left <= right) {
            while (array[left] < pivot) {
                left++;
            }
            while (array[right] > pivot) {
                right--;
            }
            if (left <= right) {
                int tmp = array[left];
                array[left] = array[right];
                array[right] = tmp;
                left++;
                right--;
            }
        }
        return left;
    }

    //program for heap sort
    private static int N;
    public static int[] heapSort(int array[]){
        heapify(array);
        for (int i = N; i > 0; i--)
        {
            swap(array,0, i);
            N = N-1;
            maxheap(array, 0);
        }
        return array;
    }
    /* Function to build a heap */
    public static void heapify(int arr[]){
        N = arr.length-1;
        for (int i = N/2; i >= 0; i--)
            maxheap(arr, i);
    }
    /* Function to swap largest element in heap */
    public static void maxheap(int arr[], int i){
        int left = 2*i ;
        int right = 2*i + 1;
        int max = i;
        if (left <= N && arr[left] > arr[i])
            max = left;
        if (right <= N && arr[right] > arr[max])
            max = right;

        if (max != i)
        {
            swap(arr, i, max);
            maxheap(arr, max);
        }
    }
    /* Function to swap two numbers in an array */
    public static void swap(int arr[], int i, int j){
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

}
