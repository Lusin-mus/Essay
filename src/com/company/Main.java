package com.company;

public class Main {

    public static void main(String[] args) {
	int [] array={1, 2, 4, 5, 5, 7, 9};
	int sum=0;
	for(int i=0; i< array.length; i++){
	    sum+=array[i];
    }
	System.out.println(sum);
    }
}
