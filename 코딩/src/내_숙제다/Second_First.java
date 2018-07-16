package 내_숙제다;

import java.util.ArrayList;
import java.util.Scanner;

class AutomaticSumming {
	ArrayList<Integer> data = new ArrayList<>();
	int N; // 입력 정수의 갯수
	int K; // 원하는 값
	/* N개의 정수들과 K값을 입력받는다. 정수들은 정렬된 상태로 입력된다. */
	int start = 0, end = N - 1;
	int count = 0; // 정수 쌍의 개수 카운트
	int sum;

	public AutomaticSumming() {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("총 갯수를 입력하세요.: ");
		N = input.nextInt();

		System.out.println("수를 하나씩 입력하세요.: ");
		for (int i = 0; i < N; i++)
			data.add(input.nextInt());
		System.out.println("원하는 합을 입력하세요.: ");
		K = input.nextInt();

		if (start < end) {
			recursiveFunc(start, end);
		}
		System.out.println("총 합이 이루어지는 수의 쌍은 " + count + "개 입니다.");
	}

	private void recursiveFunc(int start, int end) {
		sum = data.get(start)+data.get(end);

		if (sum > K) {
			recursiveFunc(start, end - 1);
			System.out.println("난 바보다.");
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
