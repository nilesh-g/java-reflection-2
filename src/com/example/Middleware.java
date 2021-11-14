package com.example;

import java.lang.reflect.Method;

public class Middleware {
	public static Object invoke(String className, String methodName, Class[] argTypes, Object[] argValues) {
		try {
			// load the class
			Class c = Class.forName(className);
			// create object of class dynamically
			Object obj = c.newInstance();
			// find the method
			Method m = c.getDeclaredMethod(methodName, argTypes);
			m.setAccessible(true);
			// invoke the method & collect result
			Object result = m.invoke(obj, argValues);
			// return result
			return result;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
