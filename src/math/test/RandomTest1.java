package math.test;

import java.util.Random;

public class RandomTest1 {
	public static void main(String[] args) {
		Random rd=new Random();
		for(int i=0;i<10 ;i++) {
			System.out.println(rd.nextInt(50));
		}
		
	}

}
