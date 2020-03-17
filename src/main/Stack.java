package main;

public class Stack { // define Stack
	private String[] myStack = new String[10]; // 10���� �����Ͱ� ���� ������ �������
	// stack ���� 2����=> push(input) & pop(output)

	
	
	
	
	
	
	
	private int pointer = -1; // pointer�� �����μ� �ʱ⿡ -1�̶�� �ε����� ����

	public void push(String p) {
		// pointer �ϳ� ���� �� String p�� �Է��Ѵ�.
		pointer++; // 0���� �����Ѵ�
		if (pointer == 10) {// myStack.length
			System.out.println("Stack full"); // �迭�� ��� ũ���� �ϳ� -�� ��ŭ ��ȿ�ϴϱ�
		} else {
			myStack[pointer] = p; // �ֻ��� �ε����� �ڸ��� ���� ���� ������ �ȴ�
		}

	}

	public String pop() { // �Ű����� �ʿ� ����
		String getData = null;
		if(pointer == -1) { // �ƹ� �͵� ��� ���� ���� �� // pointer�� �⺻ ��=�� ���� -1�̴ϱ�
			return "Stack empty";
		} else { // ���� ��� ���� ��
			getData = myStack[pointer]; // �ֻ����� �����͸� getData�� �ְ�
			myStack[pointer] = null; // �� �ֻ��� �����͸� ����ش�
			pointer--; // ���� �� ������ �Ʒ��� �ֻ����� �ε����� ����Ű���� --���ش�
		}
		return getData; // ���� �̾� ���� getData�� ��ȯ�� �ش�
	}

	
}
