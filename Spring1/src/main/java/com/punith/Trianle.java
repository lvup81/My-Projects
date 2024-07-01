package com.punith;

public class Trianle {
    public static void main(String[] args) {
        int n=6;
        int i,j;
        for(i=1;i<=n;i++){
            for(j=1;j<i;j++){
                System.out.println(" ");
            }
            for(j=i;j<=n;j++){
                System.out.print(j+" ");
            }


        }
        System.out.println();


    }
}
