package 내_숙제다;

import java.util.ArrayList;
import java.util.Scanner;

class FlooringAndCeiling {
	ArrayList<Integer> data = new ArrayList<>();
	int N, K;

	public FlooringAndCeiling() {
		Scanner input = new Scanner(System.in);
		System.out.println("입력할 수의 총 갯수를 입력해주세요.: ");
		N = input.nextInt();

		System.out.println("수를 하나씩 입력해주세요.: ");
		for (int i = 0; i < N; i++) {
			data.add(input.nextInt());
			data.sort(null);
		}

		System.out.println("비교할 수를 입력해주세요.: ");
		K = input.nextInt();

		System.out.println("답은 " + recursiveFlooring(0, N - 1) + " 입니다.");
		System.out.println("답은 " + recursiveCeiling(0, N - 1) + " 이다.");
	}

	private int flooring() {
		int found = 0;
		for (int i = 0; i < N; i++) {
			if (data.get(i) < K)
				found = data.get(i);
		}
		if (found == 0)
			found = -1;
		return found;
	}

	private int recursiveFlooring(int start, int end) {
		int found = 0;
		int indexMiddle = (start + end) / 2;
		int middle = data.get(indexMiddle);

		if (K < data.get(0))
			found = -1;
		else if (K == middle)
			found = middle;
		else if (K < middle)
			found = recursiveFlooring(start, indexMiddle - 1);
		else if (middle <= K && data.get(indexMiddle + 1) >= K)
			found = middle;
		else if (K > data.get(end))
			found = data.get(end);
		else
			found = recursiveFlooring(indexMiddle + 1, end);
		return found;

	}

	private int recursiveCeiling(int start, int end) {
		int found = 0;
		int indexMiddle = (start + end) / 2;
		int middle = data.get(indexMiddle);

		if (K > data.get(N - 1))
			found = -1;
		else if (K == middle)
			found = middle;
		else if (K >= middle && K <= data.get(indexMiddle + 1))
			found = data.get(indexMiddle + 1);
		else if (K < data.get(0))
			found = data.get(0);
		else if (K < middle)
			found = recursiveCeiling(start, indexMiddle - 1);
		else
			found = recursiveCeiling(indexMiddle + 1, end);
		return found;
	}

	private int ceiling() {
		int found = 0;
		for (int i = N - 1; i >= 0; i--) {
			if (data.get(i) > K)
				found = data.get(i);
		}
		if (found == 0)
			found = -1;
		return found;
	}

}

public class Second_Second {

	public static void main(String[] args) {
		FlooringAndCeiling fac = new FlooringAndCeiling();
	}

}
