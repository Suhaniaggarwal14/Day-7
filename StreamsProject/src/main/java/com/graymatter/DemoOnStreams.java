package com.graymatter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DemoOnStreams {

	public static void main(String[] args) {
		
		Integer arr[]=new Integer[] {10,45,23,78,44,90,10,45,66,89,90,87};
		Arrays.stream(arr).forEach(i->System.out.println(i));
		List<Integer> list=Arrays.stream(arr)
		.limit(10)
		.filter(i->i%2==0)
		.map(i->i+10)
//		.forEach(i->System.out.println(i));
		.collect(Collectors.toList());
		
		
		ArrayList<Integer> alist=new ArrayList<Integer>();
		alist.add(90);
		alist.add(44);
		alist.add(77);
		alist.add(99);
		alist.add(88);
		alist.add(90);
		
	
		alist.stream() .distinct();
//		forEach(i->System.out.println(i));
		
//		alist.stream().filter(s->.endWith("e"))
//		.map(s->s.toUpperCase())
//		.forEach(s->System.out.println(s));
		
		System.out.println(Arrays.stream(arr).skip(10).reduce(0,(a,b)->a+b));
		
		Integer ar[]=new Integer[] {1,2,3,4,5};
		Arrays.stream(ar).map(i->{
			int f=1;
			for(int j=1;j<=i;j++)
				f*=j;
			return f;
		}).forEach(i->System.out.println(i));
		System.out.println(Arrays.stream(ar).mapToInt(i->i).sum());
		System.out.println(Arrays.stream(ar).mapToInt(i->i).max());
		System.out.println(Arrays.stream(ar).mapToInt(i->i).min());
		
		
//		HashMap<int,str> hm=new HashMap<int,str>();
//		hm.put(1,"name");
//		
		
		
		
		
		
//		write a lambda to find average of list of doubles...
//		to check no is prime....
//		concatenate 2 strings.....
//		count words in paragraphs.....
//		sort ist of strings in alphabet order
		
//		create a person class with properties name,age,city,aadhar no,.create a handset of n number of persons and check for whether person is eligibe to cast vote or else throw agenotsufficient exception using sreams. 
		
		
		
		
		
		
		
		
	}

			
	

	

}
