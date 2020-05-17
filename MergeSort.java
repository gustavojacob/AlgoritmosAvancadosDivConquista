
//Exercicio 1

import java.io.*;
import java.util.*;
import java.lang.*;

class MergeSort {
    
    public static int Iteracao = 0;
    
    static public void DoMerge(int[] numbers, int left, int mid, int right)

    {

        int[] temp = new int[25];
        int i, left_end, num_elements, tmp_pos;

        left_end = (mid - 1);
        tmp_pos = left;
        num_elements = (right - left + 1);

        while ((left <= left_end) && (mid <= right))

        {

            if (numbers[left] <= numbers[mid]){
                temp[tmp_pos++] = numbers[left++];
                addIteracao();
            }else{
                temp[tmp_pos++] = numbers[mid++];
                addIteracao(); 
            }
        }

        while (left <= left_end)
            temp[tmp_pos++] = numbers[left++];
            addIteracao();

        while (mid <= right)
            temp[tmp_pos++] = numbers[mid++];
            addIteracao();

        for (i = 0; i < num_elements; i++) {
            numbers[right] = temp[right];
            right--;
            addIteracao();

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

        int len = 4;
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