package UNIT_03;
/*
 * prerequisite
 * MultiProcessing-
 *  1. sequential multiprocessing
 *  2. parallel multiprocessing
 *  3. concurrent multiprocessing
 * MultiTasking-
 *  1. sequential multitasking
 *  2. parallel multitasking
 *  3. concurrent multitasking
 * */
import java.util.*;
public class P16_Multithreading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		c1 obj1 = new c1();
		c2 obj2 = new c2();
		obj1.show1();
		obj2.show2();
//		Thread t1 = new Thread(new t1(),"T1");
//		Thread t2= new Thread(new t2(),"T2");
//		t1.start();
//		t2.start();

		}
	}

class c1{
	void show1() {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println(+a);
		
	}
}
class c2{
	void show2() {
		for(int i=0;i<10;i++) {
			System.out.println("hey ");
		}
	}
}

//class t1 extends Thread{
//	public void run() {
//		Scanner sc = new Scanner(System.in);
//		int a = sc.nextInt();
//		System.out.println(+a);
//		
//	}
//}
//class t2 extends Thread{
//	public void run() {
//		for(int i=0;i<10;i++) {
//			System.out.println("hey ");
//		}
//	}
//}