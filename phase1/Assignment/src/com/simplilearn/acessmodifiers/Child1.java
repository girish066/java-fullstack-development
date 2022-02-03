package com.simplilearn.acessmodifiers;
import com.simplilearn.acessmodifiers.AccessModifiers;
public class Child1 extends AccessModifiers {
	public static void main(String[] args) {
		Child1 obj=new Child1();
	
		obj.methodPublic();
		obj.methodProtected();

		obj.methodDefault();
		
	}
}

