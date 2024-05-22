package com.Listeners;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.testng.IMethodInstance;
import org.testng.IMethodInterceptor;
import org.testng.ITestContext;

public class MethodInterceptor implements IMethodInterceptor {

	@Override
	public List<IMethodInstance> intercept(List<IMethodInstance> methods, ITestContext context) {
		
		//List will contain all the methods that testng going to execute
		List<IMethodInstance> result = new ArrayList<IMethodInstance>();
		
		Map<String,String> test1= new HashMap();
		test1.put("name", "test1");
		test1.put("count", "2");
		
	
		Map<String,String> test2= new HashMap();
		test2.put("name", "test2");
		test2.put("count", "1");
		
		List<Map<String,String>> list = new ArrayList<Map<String,String>>();
		list.add(test1);
		list.add(test2);
		
		System.out.println(list);
		
		for(int i=0;i<methods.size();i++)
		{
			for(int j=0;j<list.size();j++)
			{
				if(methods.get(i).getMethod().getMethodName().equalsIgnoreCase(list.get(j).get("name")))
				{
					methods.get(i).getMethod().setInvocationCount(Integer.parseInt(list.get(j).get("count")));
					result.add(methods.get(i));
				}
			}
		}
		return result;
	}
	
	

}
