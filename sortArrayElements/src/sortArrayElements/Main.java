package sortArrayElements;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int arraySize;
		int[] numbers;
		Scanner scan=new Scanner(System.in);
		
		System.out.print("Dizinin boyutu n: ");
		arraySize=scan.nextInt();
		
		numbers=new int[arraySize];
		
		System.out.println("Dizinin elemanlarını giriniz: ");
		for(int i=0; i<arraySize; i++) {
			System.out.print((i+1)+". Elemanı: ");
			numbers[i]=scan.nextInt();
		}
		
		Arrays.sort(numbers);
		System.out.print("Sıralama: ");
		for(int number:numbers) {
			System.out.print(number+" ");
		}
	}

}
