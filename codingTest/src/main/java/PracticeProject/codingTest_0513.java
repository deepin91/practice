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
	   
// ------------------0522-----------------	
// package PracticeProject;

// //import java.io.Console;
// import java.util.Arrays;
// import java.util.Scanner;

// //import lombok.extern.slf4j.Slf4j;

// //@Slf4j
// public class codingTest_0513 {
// 	public static void main(String[] args) {

// 		int[] lottoNumber = new int[6];
// 		int[] tryNumber = new int[6];
// 		int size = lottoNumber.length;
// 		int size2 = tryNumber.length;
// 		int matchCount = 0;
// //		int a = 3;
// 		for (int r = 0; r < 6; r++) {
// //			Console.log(">>>>>>>>>" + lottoNumber);
// 			lottoNumber[r] = (int) (Math.random() * 45) + 1;
// 			for (int l = 0; l < r; l++) {
// 				if (lottoNumber[r] == lottoNumber[l]) {
// 					r--;
// 				}
// 			}
// 		}
// 		System.out.println("이번주 로또 당첨번호는 " + Arrays.toString(lottoNumber) + " 입니다.");
		
		
// 		System.out.print("숫자를 입력하세요 : ");

// 		Scanner scan = new Scanner(System.in);

// 		for (int i = 0; i < tryNumber.length; i++) {
// 			tryNumber[i] = scan.nextInt();
// 		}
// 		System.out.print("입력하신 숫자는 " + Arrays.toString(tryNumber) + " 입니다.");
	
//		String A = new tryNumber[6];
		
//		for (int r = 0; r < 6; r++) {
////			Console.log(">>>>>>>>>" + lottoNumber);
//			lottoNumber[r] = (int) (Math.random() * 45) + 1;
//			for (int l = 0; l < r; l++) {
//				if (lottoNumber[r] == lottoNumber[l]) {
//					r--;
//				}
//		보너스 숫자
//
//		보너스 숫자 하나 랜덤으로 받고 새로운 int에 저장
//		정규 번호와 입력한 번호가 5개이면
//		정규 번호와 보너스 숫자 for문 이용해서 중복검사
//		> 정규5 + 보너스 숫자  = 6개면 2등
//		아니면 3등.


		
		
		
		
// 		int r = 0;
// 		while(r < 6) {
// 		for (int l = 0; l < 6; l++) {
// 			if (tryNumber[r] == lottoNumber[l]) {
// 				matchCount++;
// 			}
// 		}
// 		r++;
// 		}
// 		System.out.print("맞은 갯수는 " + matchCount + "개 입니다.");
// 	}	
// 	}

//		

//		int size = Array.length;
//		System.out.println("숫자를 입력하세요.");
//		
//		Scanner scan = new Scanner(System.in);
//		int number = scan.nextInt();

//		System.out.print("입력된 숫자는 : " + randomNumber + "입니다.");
	
