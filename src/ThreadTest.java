/****************
 * Eclipse上で実行すると
 * 標準入力取得時にゴミが入ってしまうことがあります（特に全角入力）
 * ターミナルで実行すれば問題有りません
****************/

import java.util.Scanner;



public class ThreadTest{

	
	public static void main(String[] args){

		System.out.println("何か文字を入力してください！");
		//スレッドを走らせる
		Thread showThread = new ShowThread();
		showThread.start();
		//標準入力
		try(Scanner scanner = new Scanner(System.in)){
			String str = scanner.next();
			System.out.print("入力文字は " + str + " です．");
		}
		return;
	}
}
