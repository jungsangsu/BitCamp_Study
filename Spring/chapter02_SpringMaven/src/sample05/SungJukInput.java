package sample05;

import java.util.ArrayList;
import java.util.Scanner;

import lombok.Setter;

@Setter
public class SungJukInput implements SungJuk {
    
	private SungJukDTO2 sungJukDTO2;
	private ArrayList<SungJukDTO2> arraylist;
	@Override
	public void execute() {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("이름 입력 : ");
		String name = input.next();
		System.out.print("국어 입력 : ");
		int kor = input.nextInt();
		System.out.print("영어 입력 : ");
		int eng = input.nextInt();
		System.out.print("수학 입력 : ");
		int math = input.nextInt();
		
		int total = kor+eng+math;
		double avg = total/3;
		
		sungJukDTO2.setName(name);
		sungJukDTO2.setKor(kor);
		sungJukDTO2.setEng(eng);
		sungJukDTO2.setMath(math);
		sungJukDTO2.setTot(total);
		sungJukDTO2.setAvg(avg);
		
		arraylist.add(sungJukDTO2);
		
		System.out.println("총 List 수 : "+arraylist.size());
		
	}

}
