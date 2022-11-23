package org.mytest;

public class Client {

	 private void client1(){
	  
	  System.out.println("CLIENT 1");

	}

	 private void client2(){

	   System.out.println("CLIENT 2");
	}

	 private static void main(String []args){

	   Client c=new Client();
	   c.client1();
	   c.client2();
	
	}
}