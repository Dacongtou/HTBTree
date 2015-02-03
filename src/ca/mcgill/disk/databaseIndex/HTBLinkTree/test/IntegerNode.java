package ca.mcgill.disk.databaseIndex.HTBLinkTree.test;

import org.mapdb.DeepCopyObject;

public class IntegerNode implements DeepCopyObject{

	int val;
	
	public IntegerNode (int val) {
		this.val = val;
	}
	
	@Override
	public DeepCopyObject deepCopy() {
		return new IntegerNode(val);
	}
	
	public String toString() {
		return ("" + val);
	}
	
	public static void main(String [] args) {
		
		System.out.println("this is the first program, say hello world :)");
		
	}

}
