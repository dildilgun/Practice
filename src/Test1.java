import java.util.Scanner;
public class Test1
							{
	public static void main(String[] args) {
		
		int a, b, c;
		int result;
		
		Scanner s = new Scanner(System.in);
		System.out.println("ù��° ����� ���� �Է��ϼ���");
		a = s.nextInt();
		System.out.println("�ι�° ����� ���� �Է��ϼ���");
		b = s.nextInt();
		System.out.println("����° ����� ���� �Է��ϼ���");
		c = s.nextInt();
		
		result = a + b + c;
		System.out.println(a + "+" + b + "+" + c + "=" + result);
		result = a * b * c;
		System.out.println(a + "*" + b + "*" + c + "=" + result);
		
	}
}
