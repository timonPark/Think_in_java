package org.uengine.Chap08.Inner_Classes.Closures_callbacks;

public class Callee2 extends MyIncrement {
	private int i =0;
	public void increment(){
		super.increment();
		i++;
		System.out.println(i);
	}
	private class Closure implements Incrementable{
		public void increment(){
			
			Callee2.this.increment();
		}
	}
	Incrementable getCallbackReference(){
		return new Closure();
	}

}
