package org.mapdb;

import java.util.Arrays;

import org.mapdb.BTreeMap.BNode;


public class IMBLTInnerNodeContentWrapper implements IMBLTNodeContentWrapper{

	DeepCopyObject[] keys;
    BNode[] child;
    
    public IMBLTInnerNodeContentWrapper(DeepCopyObject[] keys, BNode[] child) {
        this.keys = keys;
        this.child = child;
    }
    
    public boolean isLeaf() { return false;}
 
    public DeepCopyObject[] keys() { return keys;}
     
    public DeepCopyObject[] vals() { return null;}
 
    public DeepCopyObject highKey() {return keys[keys.length-1];}
 
    public BNode[] child() { return child;}

    // link pointer to the sibling
    public BNode next() {return child[child.length-1];}
 
    public String toString(){
        return "Dir(K"+Arrays.toString(keys)+", C"+Arrays.toString(child)+")";
    }

}
