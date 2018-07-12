package 내_숙제다;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

class Reading_File {
	private int total_number = 100000;
	private int[] original_arr = new int[total_number];
	private int[] individualizedMinNumber = new int[total_number];
	private int cnt = 0;
	private int numSet = 0;
	private int minimum;
	private int min;
	private int first, second;
	private int N;

	public Reading_File() throws IOException {
		fileReading();
		System.out.println("범위가 될 두 정수 입력하세요: ");
		Scanner input = new Scanner(System.in);
		first = input.nextInt();
		second = input.nextInt();

		ArrSectioning(first, second);
		min = minimum;
		numSet = (int) Math.sqrt(cnt);
		constructSets();
		System.out.println("난 풀었다."+combinedCalculation(first, second));

	}

	private void fileReading() throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("./data.txt"));
		String line = br.readLine();
		N = Integer.parseInt(line);

		while (true) {
			line = br.readLine();
			if (line == null)
				break;
			original_arr[cnt] = Integer.parseInt(line);
			cnt++;
		}
		br.close();
	}

	private int ArrSectioning(int first, int second) {
		minimum = original_arr[first];
		for (int i = first; i <= second; i++) {
			if (original_arr[i] < minimum)
				minimum = original_arr[i];
		}
		return minimum;
	}

	private void constructSets() {
		
		for (int count = 0; count < cnt / numSet; count++) {
			ArrSectioning(count * numSet, (count + 1) * numSet - 1); // minimum 추출
			individualizedMinNumber[count] = minimum;
		}
	}
	
	private int combinedCalculation(int first,int second) {
		int startNumOfSet=(first/numSet+1)*numSet;
		int endNumOfSet=second/numSet*numSet-1;
		
		int jakda=ArrSectioning(first, startNumOfSet-1);	//집합 시작하기 전
		
		for(int a=startNumOfSet/numSet;a<=endNumOfSet/numSet;a++)
			if(jakda>individualizedMinNumber[a])
				jakda=individualizedMinNumber[a];
		
		int jakni=ArrSectioning(endNumOfSet+1, second);	//집합 끝난 후
		if(jakda>jakni) jakda=jakni;
		return jakda;
		
	}

}

public class First {

	public static void main(String[] args) throws IOException {
		Reading_File rf = new Reading_File();
	}
}
