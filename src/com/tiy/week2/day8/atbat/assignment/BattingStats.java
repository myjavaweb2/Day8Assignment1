package com.tiy.week2.day8.atbat.assignment;

import java.util.ArrayList;
import java.util.Scanner;

public class BattingStats 
{
	public static void main(String[] args) 
	{
//		ArrayList<String> myList = new ArrayList<>();
//		myList.add("Joe");
//		myList.add("Jeff");
		
//		System.out.println(myList.get(1));
		
		ArrayList <Integer> myList = new ArrayList<>();
		
//		myList.add(0);
//		myList.add(3);
//		myList.add(4);
		
//		int sum = 0;
		
//		for (int i = 0; i < myList.size(); i = i+1)
//		//     variable,   condition,     increment	
//		{
//			sum = sum + myList.get(i);
//		}
//		System.out.println(sum);
//		
//		Float avg = (float) sum /myList.size();
				
//		System.out.println(avg);
		
//		System.out.println("The average is " + avg);
		
		//Welcome
		System.out.println("Welcome to my program");
		
		//Get name of batter
		System.out.println("What is the name of the batter?");
		
		String name;
		
		Scanner sc = new Scanner(System.in);
		
		name = sc.nextLine();
		
		System.out.println("Player name is: " + name);
		
		//Ask how many times at bat?
		System.out.println("How many times player went to bat?");
		
		String myStr;
		myStr = sc.nextLine();
		
		int numAtBat = Integer.parseInt(myStr);
		
		for (int i = 0; i < numAtBat; i = i+1)
		{
			System.out.println("How many bases for bat number " + (i+1));
			
			String myStr2 = sc.nextLine();
			
			int numBases = Integer.parseInt(myStr2);
			
//			System.out.println(numBases);
			
			myList.add(numBases);
		}

		int sum = 0;

		 for (int i = 0; i < myList.size(); i = i+1)
		 // variable, condition, increment
		 {
		 sum = sum + myList.get(i);
		 }
		 
			Float avg = (float) sum /myList.size();
			
			System.out.println("The average at-bat for " + name + " is " + avg);
	}
}
