package calcapp.main;
import calcapp.logics.CalcLogic;
// calcapp.main と calcapp.logics に所属する全てのパッケージをインポートしたい場合は下記2行のように記述する
// import calcapp.main.*;
// import calcapp.logics.*;

// chap06
// list06-01-09

public class Calc {
	public static void main(String[] args) {
		int a = 10;
		int b = 2;
		int total = CalcLogic.tasu(a, b); // CalcLogicクラスのtasuメソッドをtotalに代入
		int delta = calcapp.logics.CalcLogic.hiku(a, b); // CalcLogicクラスのhikuメソッドをdeltaに代入
//		System.out.println("足すと" + total + "、引くと" + delta);
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
