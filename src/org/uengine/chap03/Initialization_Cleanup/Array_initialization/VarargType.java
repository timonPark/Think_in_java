package org.uengine.chap03.Initialization_Cleanup.Array_initialization;

public class VarargType {
	static void f(Character... args){
		System.out.println(args.getClass());
		System.out.println(" length " + args.length);
	}
	static void g(int... args){
		System.out.println(args.getClass());
		System.out.println(" length " + args.length);
	}

	public static void main(String[] args) {
		f('a');
		f();
		g(1);
		g();
		System.out.println("int[]: " +new int[0].getClass());

	}

}
