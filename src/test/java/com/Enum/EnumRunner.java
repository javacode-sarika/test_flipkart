package com.Enum;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;

public class EnumRunner {
	public static void main(String[] args) {
		System.out.println(Severity.CRITICAL);
		
		Severity[] a= Severity.values();
		
		for(Severity sev:a)
		{
			System.out.println(sev);
		}
	}

}
