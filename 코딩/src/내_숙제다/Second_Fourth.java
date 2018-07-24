package ��_������;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class straightRoad {
	int T;
	int N;
	int[][] maze;
	boolean direction = false;

	int PATHWAY_COLOUR = 0;
	int WALL_COLOUR = 1;
	int BLOCKED_COLOUR = 2;
	int PATH_COLOR = 3;

	public straightRoad() throws FileNotFoundException {
		fileReading();

	}

	private void fileReading() throws FileNotFoundException {
		Scanner input = new Scanner(new File("./input2.txt"));

		T = input.nextInt(); // T=������ ���� ����
		for (int i = 0; i < T; i++) {
			N = input.nextInt(); // N=�� ��
			maze = new int[N][N];
			for (int j = 0; j < N; j++) {
				for (int k = 0; k < N; k++) {
					maze[j][k] = input.nextInt(); // 0,1 ����
				}
			}
			if (decideDirection(0, 0))
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}

	private boolean decideDirection(int x, int y) {

		if (x == N - 1 && y == N - 1)
			return true;
		else if (x < 0 || y < 0 || x >= N || y >= N || maze[x][y] != PATHWAY_COLOUR) // ���� ��
			return false;
		else { // ���� �ƴϰ�, Path_Way��
			maze[x][y] = PATH_COLOR;
			if (decideDirection(letsgoNorth(x, y), y) || decideDirection(x, letsgoEast(x, y))
					|| decideDirection(letsgoSouth(x, y), y) || decideDirection(x, letsgoWest(x, y)))
				return true;
		}
		maze[x][y] = BLOCKED_COLOUR;
		return false;
	}

	private int letsgoNorth(int x, int y) {
		while (true) {
			x--;
			if (x < 0 || maze[x][y] == WALL_COLOUR)
				break;
		}
		x++;
		return x;
	}

	private int letsgoEast(int x, int y) {
		while (true) {
			y++;
			if (y >= N || maze[x][y] == WALL_COLOUR)
				break;
		}
		y--;
		return y;
	}

	private int letsgoSouth(int x, int y) {
		while (true) {
			x++;
			if (x >= N || maze[x][y] == WALL_COLOUR)
				break;
		}
		x--;
		return x;
	}

	private int letsgoWest(int x, int y) {
		while (true) {
			y--;
			if (y < 0 || maze[x][y] == WALL_COLOUR)
				break;
		}
		y++;
		return y;
	}
}

public class Second_Fourth {

	public static void main(String[] args) throws FileNotFoundException {
		straightRoad sr = new straightRoad();
	}
}