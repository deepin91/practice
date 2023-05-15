package PracticeProject;

//import java.io.Console;
import java.util.Arrays;
import java.util.Scanner;

//import lombok.extern.slf4j.Slf4j;

//@Slf4j
public class codingTest_0513 {
	public static void main(String[] args) {
		
				
		int[] lottoNumber = new int[6];
		int[] tryNumber = new int[6];
		int size = lottoNumber.length;
		int size2 = tryNumber.length;
//		int a = 3;
		for(int r = 0; r < size; r++) {
//			Console.log(">>>>>>>>>" + lottoNumber);
			lottoNumber[r] = (int)(Math.random()*(50 - 5) + 1);
			 for(int l = 0; l <= r; l++){
				 if(lottoNumber[l] == lottoNumber[r]) {
				 }
				 l++;
			}
		}
		 System.out.println("이번주 로또 당첨번호는 " + Arrays.toString(lottoNumber)+ " 입니다.");
		
		System.out.print("숫자를 입력하세요 : ");
		
		Scanner scan = new Scanner(System.in);
		
		for(int i = 0; i < tryNumber.length; i ++) {
		tryNumber[i] = scan.nextInt();
		}
		System.out.print("입력하신 숫자는 " + Arrays.toString(tryNumber)+ " 입니다.");
//		}
//		System.out.print("입력된 숫자는" + tryNumber + "입니다.");
//		
//		

	}
}
//		


		
//		int size = Array.length;
//		System.out.println("숫자를 입력하세요.");
//		
//		Scanner scan = new Scanner(System.in);
//		int number = scan.nextInt();

		
		
		
//		System.out.print("입력된 숫자는 : " + randomNumber + "입니다.");
	   
	
	
