package org.mapdb;

import ca.mcgill.disk.databaseIndex.HTBLinkTree.test.IntegerNode;



public abstract class DeepCopyObject implements Comparable<DeepCopyObject>{
	
	public abstract DeepCopyObject deepCopy();
	
	public abstract int compareObject(DeepCopyObject object);
	
	@Override
	public int compareTo(DeepCopyObject object) {
		
		return this.compareObject(object);
		
	}
	
	public static void main(String [] args) {
		
		DeepCopyObject node1 = new IntegerNode(5);
		DeepCopyObject node2 = new IntegerNode(10);
		System.out.println("result for node1 compares to node2 is: " + node1.compareTo(node2));
		
	}


}
