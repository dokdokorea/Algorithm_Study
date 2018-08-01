package ³»_¼÷Á¦´Ù;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Random;

class dataOutput {
	private static int THOUSANDNUM = 1000;
	private static int TENTHOUSANDNUM=10000;
	private static int ONEMILLIONNUM=100000;
	private int[] numberArr= {THOUSANDNUM,TENTHOUSANDNUM,ONEMILLIONNUM};
	
	Writer input;
	Random rd;

	public dataOutput() throws IOException {
		for(int i=0;i<numberArr.length;i++) {
		randomNumber(numberArr[i]);
		reverseNumber(numberArr[i]);
		}
		
	}

	private void randomNumber(int no) throws IOException {
		input = new FileWriter("./randomData_"+no+".txt");
		rd = new Random();
		for (int i = 0; i < no; i++) 
			input.write(rd.nextInt(no) + "\n");
		input.close();
	}
	
	private void reverseNumber(int no) throws IOException{
		input=new FileWriter("./reverseData_"+no+".txt");
		for(int i=no;i>0;i--)
			input.write(rd.nextInt(no)+"\n");
		input.close();
	}

}

public class Output_Random_Data {

	public static void main(String[] args) throws IOException {
		dataOutput dop = new dataOutput();

	}

}
