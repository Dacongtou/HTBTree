package ca.mcgill.disk.databaseIndex.HTBLinkTree.test;

import org.mapdb.DeepCopyObject;

public class StringNode extends DeepCopyObject {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3759066436280452554L;
	String val;
	
	public StringNode (String val) {
		this.val = val;
	}
	
	@Override
	public DeepCopyObject deepCopy() {
		return new StringNode(val);
	}
	
	public String toString() {
		return ("my value is " + this.val);
	}
	
	@Override
	public int compareObject(DeepCopyObject object) {
		return this.val.compareTo(((StringNode) object).val);
	}
	
	public static void main(String [] args) {
		
		StringNode node1 = new StringNode("5");
		StringNode node2 = new StringNode("10");
		System.out.println("result for node1 compares to node2 is: " + node1.compareObject(node2));

	}

	

}
