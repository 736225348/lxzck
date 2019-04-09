package day;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadLocal<String> threadLocal = new ThreadLocal<String>();//
		threadLocal.set("ÂŞÏèÔó");
		System.out.println(threadLocal.get());
		for(int i=0;i<15;i++) {
			System.out.println(1);
			
		}
		new Thread() {
			public void run() {
				for (int i = 0; i < 15; i++) {
					System.out.println(2);
				}

			}

		}.start();

	}

}
