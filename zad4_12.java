package Algorithm_Efficiency;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class zad4_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the numbers");
		String str = sc.nextLine();
		int[] numbers = Arrays.stream(str.split(" ")).mapToInt(Integer::parseInt).toArray();
		System.out.println("All numbers: ");
		for(int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
		System.out.println();
		System.out.println("Please enter the wanted sum");
		int sum = sc.nextInt();
		
		if(hasSum(numbers, sum))System.out.println("Yes");
		else System.out.println("No");
	}
	
	public static boolean hasSum(int[] numbers, int sum) {
//		��������, ������� �� ���������� �� �������� �����, ��������� HashSet T(n) = O(n)
//		�� �� ��������� ���� ���������� ������� ������ ������� �����,
//		� ����� �� ������, �� �������� � ������� �� �������
//		� HashSet ��� �������� O(1). �� ������� ����� ��������� ��-����
		Set <Integer> set = new HashSet<>();
		for(int i = 0; i < numbers.length; i++) {
			if(set.contains(sum - numbers[i])) {
				System.out.println(numbers[i] + " + " + (sum - numbers[i]) + " = " + sum);
				return true;
			}
			set.add(numbers[i]);
		}
		return false;
	}

}
