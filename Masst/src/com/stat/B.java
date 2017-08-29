package com.stat;

public class B {
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		A a1 = new A();
		A a2 = new A();
		A.fun(8);
		a1.fun(0);
		System.out.println(A.fun(2));
		System.out.println(a2.fun(4));
	}
}
