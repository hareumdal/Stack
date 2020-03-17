package main_operate;

import java.util.ArrayList;
import java.util.StringTokenizer;

import main.Stack;

public class Stack_Test {

	private String calEX = "3*(12+15)-6/2";
	ArrayList<String> postArr = new ArrayList<>();

	private Stack s = new Stack();
	Stack_Test() {
//		StringTokenizer st = new StringTokenizer(calEX, "+-*/()", true); // true 나누는 기준도 담기
//		
//		while(st.hasMoreTokens()) {
//			System.out.println(st.nextToken());
//		}
//		
		StringTokenizer st = new StringTokenizer(calEX, "+-*/()", true); // true 나누는 기준도 담기
		int size = -1;
		String token = "";
		while (st.hasMoreTokens()) {
			token = st.nextToken();
			switch (token) {
			case "*":
			case "/":
				size = 3;
				
				s.push(token);
				break;
			case "+":
			case "-":
				size = 2;
				break;
			case "(":
				size = 1;
				break;
			case ")":
				size = 0;
				break;
			default:
				postArr.add(token);
				System.out.println(postArr);
				
				
				
			}
		}
		
	
		
		
		
		
		
		
		
		

	}
}
