package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nrTeste = input.nextInt();
        int[][] intervals = new int[nrTeste][2];
        for(int i=0;i<nrTeste;i++){
            intervals[i][0]=input.nextInt();
            intervals[i][1]=input.nextInt();
        }

        for(int i=0;i<nrTeste;i++){
            int count=0;
            for(int j = intervals[i][0];j<=intervals[i][1];j++){
                int toBeTested=j;
                int digit=toBeTested%10;
                boolean flag=true;
                do{
                    if(toBeTested%10!=digit) {
                        flag=false;
                        break;
                    }
                    toBeTested/=10;
                }while(toBeTested!=0);
                if(flag) count++;
            }
            System.out.println(count);
        }
    }

    private static void afisareArray(int[][] intervals) {
        for (int[] arr:intervals) {
            for (int x : arr) {
                System.out.print(x+" ");
            }
            System.out.println();
        }
    }
}
