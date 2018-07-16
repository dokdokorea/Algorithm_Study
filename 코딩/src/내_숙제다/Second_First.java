package ��_������;

import java.util.ArrayList;
import java.util.Scanner;

class AutomaticSumming {
	ArrayList<Integer> data = new ArrayList<>();
	int N; // �Է� ������ ����
	int K; // ���ϴ� ��
	/* N���� ������� K���� �Է¹޴´�. �������� ���ĵ� ���·� �Էµȴ�. */
	int start = 0, end = N - 1;
	int count = 0; // ���� ���� ���� ī��Ʈ
	int sum;

	public AutomaticSumming() {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("�� ������ �Է��ϼ���.: ");
		N = input.nextInt();

		System.out.println("���� �ϳ��� �Է��ϼ���.: ");
		for (int i = 0; i < N; i++)
			data.add(input.nextInt());
		System.out.println("���ϴ� ���� �Է��ϼ���.: ");
		K = input.nextInt();

		if (start < end) {
			recursiveFunc(start, end);
		}
		System.out.println("�� ���� �̷������ ���� ���� " + count + "�� �Դϴ�.");
	}

	private void recursiveFunc(int start, int end) {
		sum = data.get(start)+data.get(end);

		if (sum > K) {
			recursiveFunc(start, end - 1);
			System.out.println("�� �ٺ���.");
		} else if (sum < K)
			recursiveFunc(start + 1, end);
		else {
			count++;
			recursiveFunc(start + 1, end - 1);
		}
	}
}

public class Second_First {

	public static void main(String[] args) {
		AutomaticSumming autosum = new AutomaticSumming();
	}

}
