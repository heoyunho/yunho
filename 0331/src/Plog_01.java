import java.util.Scanner;

public class Plog_01 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		Grade me = new Grade();
		
		System.out.println("����,����,���� ������ 3���� ���� �Է�:");
		me.math = scan.nextInt();
		me.science = scan.nextInt();
		me.english = scan.nextInt();
		System.out.println("�����"+me.average());
		
		
	}
	

}class Grade{
		
		int math;
		int science;
		int english;
		public int average(){
			return (math+science+english)/3;
			
			
			
		}
	}