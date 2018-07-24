package ��_������;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class MazeProblem {
	int T;
	int N;
	int K;
	int[][] maze; // ���� ���
	int[][] checkArr; // ���� ��η� �̵��ϴ� �� Ȯ��
	int moveCnt = 0;

	int PATHWAY_COLOUR = 0;
	int WALL_COLOUR = 1;
	int PATH_COLOR = 3;

	public MazeProblem() throws FileNotFoundException {
		readingDataCase();

	}

	private void readingDataCase() throws FileNotFoundException {

		Scanner input = new Scanner(new File("./input1.txt"));

		T = input.nextInt(); // T=������ ���� ����
		for (int i = 0; i < T; i++) {
			N = input.nextInt(); // N=�� ��
			maze = new int[N][N];
			for (int j = 0; j < N; j++) {
				for (int k = 0; k < N; k++) {
					maze[j][k] = input.nextInt(); // 0,1 ����
				}
			}
			K = input.nextInt();
			System.out.println(findMazePath(0, 0, moveCnt));
		}

	}

	int findMazePath(int x, int y, int count) {

		if (count > K || x < 0 || y < 0 || x >= N || y >= N || maze[x][y] != PATHWAY_COLOUR) // ���� ��
			return 0;
		else if (x == N - 1 && y == N - 1) { // �ⱸ ����
			return 1;
		} else {
			maze[x][y] = PATH_COLOR;
			int result = findMazePath(x - 1, y, count + 1) + findMazePath(x, y + 1, count + 1)
					+ findMazePath(x + 1, y, count + 1) + findMazePath(x, y - 1, count + 1);
			maze[x][y] = PATHWAY_COLOUR;
			return result;
		}

	}

}

public class Second_Third {
	public static void main(String[] args) throws FileNotFoundException {
		MazeProblem mp = new MazeProblem();
	}
}
