package ca.mcgill.dist.databaseIndex.HTBLinkTree.common;

import java.util.Arrays;

public class IMBLTLeafNodeContentWrapper {

	DeepCopyObject [] keys;
	DeepCopyObject [] vals;
	IMBLTLeafNode next;

	public IMBLTLeafNodeContentWrapper(DeepCopyObject[] keys, DeepCopyObject[] vals,
			IMBLTLeafNode next) {
		this.keys = keys;
		this.vals = vals;
		this.next = next;
	}
	
    public boolean isLeaf() { return true;}

    public DeepCopyObject [] keys() { return keys;}
    
    public DeepCopyObject [] vals() { return vals;}

    public DeepCopyObject highKey() {return keys[keys.length-1];}

    public long[] child() { return null;}
    
    public IMBLTLeafNode next() {return next;}

    public String toString(){
        return "Leaf(K"+Arrays.toString(keys)+", V"+Arrays.toString(vals)+", L="+next+")";
    }

}
