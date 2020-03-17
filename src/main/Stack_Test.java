package main;

public class Stack_Test {
	Stack_Test(){
		Stack s = new Stack();
		System.out.println(s.pop()); // 데이터를 꺼내 오겠다
		s.push("A");
		System.out.println(s.pop());
		s.push("A");
		s.push("B");
		s.push("C");
		s.push("D");
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
	}
}
