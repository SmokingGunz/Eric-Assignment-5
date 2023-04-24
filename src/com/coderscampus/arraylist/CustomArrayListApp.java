package com.coderscampus.arraylist;

public class CustomArrayListApp {

	public static void main(String[] args) {

		CustomList<Integer> customList = new CustomArrayList<>();
		
		for (int i = 1; i <= 36; i++) {
			customList.add(i);
		}
		
		for (int i = 0; i < customList.getSize(); i++) {
			System.out.println(customList.get(i));
		}
		
		System.out.println("");
		System.out.println("Number of items in custom list: \n");
		System.out.println(customList.getSize());
		
	}

}
