package 내_숙제다;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class MazeProblem {
	int T;
	int N;
	int K;
	int[][] maze; // 기존 경로
	int[][] checkArr; // 같은 경로로 이동하는 지 확인
	int moveCnt = 0;

	int PATHWAY_COLOUR = 0;
	int WALL_COLOUR = 1;
	int PATH_COLOR = 3;

	public MazeProblem() throws FileNotFoundException {
		readingDataCase();

	}

	private void readingDataCase() throws FileNotFoundException {

		Scanner input = new Scanner(new File("./input1.txt"));

		T = input.nextInt(); // T=데이터 넣을 갯수
		for (int i = 0; i < T; i++) {
			N = input.nextInt(); // N=줄 수
			maze = new int[N][N];
			for (int j = 0; j < N; j++) {
				for (int k = 0; k < N; k++) {
					maze[j][k] = input.nextInt(); // 0,1 대입
				}
			}
			K = input.nextInt();
			System.out.println(findMazePath(0, 0, moveCnt));
		}

	}

	int findMazePath(int x, int y, int count) {

		if (count > K || x < 0 || y < 0 || x >= N || y >= N || maze[x][y] != PATHWAY_COLOUR) // 범위 밖
			return 0;
		else if (x == N - 1 && y == N - 1) { // 출구 도착
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
