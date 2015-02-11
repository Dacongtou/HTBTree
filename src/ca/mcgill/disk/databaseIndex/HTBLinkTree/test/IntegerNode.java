package ca.mcgill.disk.databaseIndex.HTBLinkTree.test;

import org.mapdb.DeepCopyObject;

public class IntegerNode extends DeepCopyObject {

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
	
	@Override
	public int compareObject(DeepCopyObject object) {
		if(this.val == ((IntegerNode) object).val) {
			return 0;
		} else {
			return this.val > ((IntegerNode) object).val ? 1 : -1;
		}
	}
	
	public static void main(String [] args) {
		
		IntegerNode node1 = new IntegerNode(5);
		IntegerNode node2 = new IntegerNode(10);
		System.out.println("result for node1 compares to node2 is: " + node1.compareObject(node2));
		
	}

	

}
