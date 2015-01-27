package ca.mcgill.dist.databaseIndex.HTBLinkTree.common;

import java.util.Arrays;

public class JustForTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("testing....");
		int [] copyFrom= {1,2,3,4};
		System.out.println("copyFrom: " + Arrays.toString(copyFrom));
		int [] copyTo = new int[4];
		System.arraycopy(copyFrom, 0, copyTo, 0, copyFrom.length);
		System.out.println("copyTo: " + Arrays.toString(copyTo));
		copyTo[0] = 0;
		System.out.println("after copyFrom: " + Arrays.toString(copyFrom));
		System.out.println("after copyTo: " + Arrays.toString(copyTo));
		
		
		Object [] objectFrom = new Object[1];
		Object [] objectTo = new Object[1];
		objectFrom[0] = copyFrom;
		System.arraycopy(objectFrom, 0, objectTo, 0, objectFrom.length);
		System.out.println("ObjectFrom: " + Arrays.toString((int []) objectFrom[0]));
		System.out.println("ObjectTo: " + Arrays.toString((int []) objectTo[0]));
		copyFrom[0] = 0;
		System.out.println("after ObjectFrom: " + Arrays.toString((int []) objectFrom[0]));
		System.out.println("after ObjectTo: " + Arrays.toString((int []) objectTo[0]));
		
		// System.arrayCopy is the shallow copy, not the deep copy
		System.out.println("after copyFrom: " + Arrays.toString(copyFrom));
		System.out.println("after copyTo: " + Arrays.toString(copyTo));
		int [] test = copyFrom;
		copyFrom = copyTo;
		copyFrom[0] = 10;
		System.out.println("after copyFrom: " + Arrays.toString(copyFrom));
		System.out.println("after test: " + Arrays.toString(test));
		
		System.out.println("copyFrom==copyTo: " + (copyFrom==copyTo));
		

	}

}
