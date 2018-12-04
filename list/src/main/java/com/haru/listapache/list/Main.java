package com.haru.listapache.list;

import java.util.ArrayList;

import java.util.List;

import org.apache.commons.collections4.ListUtils;

public class Main 
{
    public static void main( String[] args )
    {
		List<Employee> akatsuki = new ArrayList<Employee>();
		akatsuki.add((new Employee("Itachi", "Uchiha", 500)));
		akatsuki.add((new Employee("Deidera", "Demolition Expert", 500)));
		akatsuki.add((new Employee("Sasori", "Ventriliquist", 500)));
		akatsuki.add((new Employee("Kisame", "Aquriam Manager", 500)));
		akatsuki.add((new Employee("Konan", "Paper Clerk", 500)));
		akatsuki.add((new Employee("Sasuke", "Snake Uchiha", 500)));
		akatsuki.add((new Employee("Sugestsu", "Snake Water", 500)));
		akatsuki.add((new Employee("Karin", "Snake Biter", 500)));

		List<Employee> hebi = new ArrayList<Employee>();
		hebi.add((new Employee("Sasuke", "Snake Uchiha", 500)));
		hebi.add((new Employee("Sugestsu", "Snake Water", 500)));
		hebi.add((new Employee("Karin", "Snake Biter", 500)));
		hebi.add((new Employee("Jugo", "Snake AngerChill", 500)));
		
		List<Integer> nums = new ArrayList<Integer>();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		nums.add(4);
		nums.add(5);
		List<Integer> oddNums = new ArrayList<Integer>();
		oddNums.add(1);
		oddNums.add(3);
		oddNums.add(5);

		System.out.println(nums);
		System.out.println(oddNums);
		System.out.println("----------------");
		List<Integer> sum  = new ArrayList<Integer>(ListUtils.sum(nums, oddNums));
		System.out.println(sum);
		List<Integer> union  = new ArrayList<Integer>(ListUtils.union(nums, oddNums));
		System.out.println(union);
		List<Integer> filter  = new ArrayList<Integer>(ListUtils.intersection(nums, oddNums));
		System.out.println(filter);
    }
}
