package com.codewithme;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] newArr = new int[arr.length + 1];

        System.out.println("nhap so muon them: ");
        int number = scanner.nextInt();

        System.out.println("nhap vi tri muon them:");
        int index = scanner.nextInt();

        if (index < 0 || index > arr.length - 1) {
            System.out.println("khong chen duoc:");

        } else {
            for (int i = 0; i < index; i++) {
                newArr[i] = arr[i];
                System.out.println(Arrays.toString(newArr));
            }
            for (int j=index+1 ;j<newArr.length;j++){
                newArr[j]=arr[j-1];    //sau 2 vong lặp thì còn thừa vị trí của index newArr={1,2,0,3,4,5}thừa vị trí 2
            }
            newArr[index]=number;         //gán vị trí 2 bằng số muốn gán((:
        }
        System.out.println(Arrays.toString(newArr));
    }
}


