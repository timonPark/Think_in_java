package org.uengine.Chap08.Factory_Method_revisited;

public class Factories {
	public static void serviceConsumer(ServiceFactory fact){
		Service s = fact.getService();
		s.method1();
		s.method2();
	}

	public static void main(String[] args) {
		serviceConsumer(Implementation1.factory);
		serviceConsumer(Implementation2.factory);

	}

}
