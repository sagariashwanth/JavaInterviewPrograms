package com.projecteuler.sagari;

public class Deadlock{
	 public static void main(String[] args){
	   final String r1 = "edureka";
	   final String r2 = "java";
	 
	   Thread t1 = new Thread() {
		   public void run() {
			   
			   synchronized(r1) {
				   System.out.println("t1 locked r1");
			   }
		   
			   try {
				   Thread.sleep(1000);
			   }
			   catch(InterruptedException e) {
				   
			   }
			  
		   }
	   };
	 
	 Thread t2 = new Thread() {
		   public void run() {
			   
			   synchronized(r2) {
				   System.out.println("t2 locked r2");
			   }
		   
			   try {
				   Thread.sleep(1000);
			   }
			   catch(InterruptedException e) {
				   
			   }
		   }
	   };
	
	 
	 t1.start();
	 t2.start();
	 }
	 }
	 
