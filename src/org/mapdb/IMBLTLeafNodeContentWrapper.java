package org.mapdb;

import java.util.Arrays;

import org.mapdb.BTreeMap.BNode;

public class IMBLTLeafNodeContentWrapper implements IMBLTNodeContentWrapper{

	DeepCopyObject [] keys;
	DeepCopyObject [] vals;
	BNode next;
	// 
	boolean flag;

	public IMBLTLeafNodeContentWrapper(DeepCopyObject[] keys, DeepCopyObject[] vals,
			BNode next) {
		this.keys = keys;
		this.vals = vals;
		this.next = next;
	}
	
    public boolean isLeaf() { return true;}

    public DeepCopyObject [] keys() { return keys;}
    
    public DeepCopyObject [] vals() { return vals;}

    public DeepCopyObject highKey() {return keys[keys.length-1];}

    public BNode[] child() { return null;}
    
    public BNode next() {return next;}

    public String toString(){
        return "Leaf(K"+Arrays.toString(keys)+", V"+Arrays.toString(vals)+", L="+next+")";
    }

	@Override
	public IMBLTNodeContentWrapper getNodeContentDeepCopy() {
		DeepCopyObject[] deepCopyKeys = new DeepCopyObject[keys.length];
		for(int i = 0; i < keys.length; i++){
			deepCopyKeys[i] = keys[i].deepCopy();
		}
		DeepCopyObject[] deepCopyValues = new DeepCopyObject[vals.length];
		for(int i = 0; i < keys.length; i++){
			deepCopyValues[i] = vals[i].deepCopy();
		}
		
		BNode nextCopy = next;
		return new IMBLTLeafNodeContentWrapper(deepCopyKeys, deepCopyValues, nextCopy);
	}

}
