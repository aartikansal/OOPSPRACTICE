package com.oops;

public class NamesOfBook {


	public static void main(String[] args) {

		Book artOfComputerPrograming = new Book(1000);
		Book effectiveJava = new Book(1000);
		Book cleanCode = new Book(1000);
		System.out.println(artOfComputerPrograming.getNoOfCopies());
		System.out.println(effectiveJava.getNoOfCopies());
		System.out.println(cleanCode.getNoOfCopies());
		artOfComputerPrograming.read();
		effectiveJava.read();
		cleanCode.read();

		//artOfComputerPrograming.setNoOfCopies(70);
		//effectiveJava.setNoOfCopies(67);
		//cleanCode.setNoOfCopies(89);

		artOfComputerPrograming.increaseNoOfCopies(25);
		effectiveJava.increaseNoOfCopies(76);
		cleanCode.increaseNoOfCopies(89);
		artOfComputerPrograming.decreaseNoOfCopies(10);
		effectiveJava.decreaseNoOfCopies(7);
		cleanCode.decreaseNoOfCopies(8);

		
	}

}



