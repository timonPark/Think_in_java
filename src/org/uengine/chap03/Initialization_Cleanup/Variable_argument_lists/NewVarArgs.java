package org.uengine.chap03.Initialization_Cleanup.Variable_argument_lists;

public class NewVarArgs {
	// Object... args <- 새로 알게된 메소드 인수 형태  <- Object[] args와 동일
	static void printArray(Object... args){
		for(Object obj : args){
			System.out.print(obj + " ");
		}
		System.out.println();
		
	}

	public static void main(String[] args) {
		printArray(new Integer(47), new Float(3.14), new Double(11.11));
		printArray(47, 3.14F, 11.11);
		printArray("one", "two", "three");
		printArray(new A(), new A(), new A());
		printArray((Object[])new Integer[]{1, 2, 3, 4});

	}

}
