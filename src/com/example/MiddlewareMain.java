package com.example;

public class MiddlewareMain {
	public static void main(String[] args) {
		Object result;
		result = Middleware.invoke(
				"com.example.Arithmetic",
				"multiply",
				new Class[] { Integer.class, Integer.class },
				new Object[] { 12, 4 }
			);
		System.out.println("Result : " + result);
		
		result = Middleware.invoke("java.util.Date", "toString", null, null);
		System.out.println("Result : " + result);
	}
}
