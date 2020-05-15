
public class ShowThread extends Thread{
	
	private static final int CNT_MIN = 1, CNT_MAX = 100;

	
	public void run(){
		System.out.println("これはスレッドテストです．1 - 100の数字を同時に表示しています．");
		
		for(int i = CNT_MIN; i <= CNT_MAX; i++){
			System.out.print(i + " ");
			//文字入力に余裕が欲しいので出力を遅くする
			try{
				Thread.sleep(50);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
		System.out.println();
	}
}
