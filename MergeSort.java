
//Exercicio 1

import java.io.*;
import java.util.*;
import java.lang.*;

class MergeSort {
    
    public static int Iteracao = 0;
    
    public static void DoMerge(int[] array, int low, int mid, int high) {
        // Creating temporary subarrays
        int leftArray[] = new int[mid - low + 1];
        int rightArray[] = new int[high - mid];
    
        // Copying our subarrays into temporaries
        for (int i = 0; i < leftArray.length; i++)
            leftArray[i] = array[low + i];
        for (int i = 0; i < rightArray.length; i++)
            rightArray[i] = array[mid + i + 1];
    
        // Iterators containing current index of temp subarrays
        int leftIndex = 0;
        int rightIndex = 0;
    
        // Copying from leftArray and rightArray back into array
        for (int i = low; i < high + 1; i++) {
            // If there are still uncopied elements in R and L, copy minimum of the two
            if (leftIndex < leftArray.length && rightIndex < rightArray.length) {
                if (leftArray[leftIndex] < rightArray[rightIndex]) {
                   array[i] = leftArray[leftIndex];
                   leftIndex++;
                } else {
                    array[i] = rightArray[rightIndex];
                    rightIndex++;
                }
            } else if (leftIndex < leftArray.length) {
                // If all elements have been copied from rightArray, copy rest of leftArray
                array[i] = leftArray[leftIndex];
                leftIndex++;
            } else if (rightIndex < rightArray.length) {
                // If all elements have been copied from leftArray, copy rest of rightArray
                array[i] = rightArray[rightIndex];
                rightIndex++;
            }
        }
    }

    static public void MergeSort_Recursive(int[] numbers, int left, int right)

    {
        int mid;
        if (right > left) {
            mid = (right + left) / 2;
            MergeSort_Recursive(numbers, left, mid);
            MergeSort_Recursive(numbers, (mid + 1), right);
            DoMerge(numbers, left, (mid + 1), right);
            addIteracao();
        }

    }

    public static void main(String[] args)

    {
        long inicio = System.nanoTime();
        
        // int[] numbers = { 3, 8,89, 90,150, 28, 7, 5, 2, 1, 9, 6, 4 };

        int[] numbers = new int[32];
        for (int i = 0; i < 32; i++) {
            numbers[i] = (int) (1 + (Math.random() * 100));

        }

        int len = 32;
        System.out.println("MergeSort By Recursive Method");
        MergeSort_Recursive(numbers, 0, len - 1);

        for (int i = 0; i < len; i++) {

            System.out.println(numbers[i]);
        }
        long fim = System.nanoTime();

        long tempoTotal = fim - inicio;
        System.err.println("Tempo total: " + tempoTotal);
        System.out.println("Numero de interações: " + Iteracao);
    }

    public static void addIteracao() {
		Iteracao++;
    }
}