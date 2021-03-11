package calcapp.main;
import calcapp.logics.CalcLogic;

// chap06
// list06-01-09

public class Calc {
	public static void main(String[] args) {
		int a = 10;
		int b = 2;
		int total = CalcLogic.tasu(a, b);
		int delta = calcapp.logics.CalcLogic.hiku(a, b);
		System.out.println("足すと" + total + "、引くと" + delta);
	}

}


// 雛形
//public class Calc {
//	public static void calc(String[] args) {
//
//		System.out.println("テスト");
//	}
//}
