package ca.mcgill.dist.databaseIndex.HTBLinkTree.common;

import java.util.Arrays;

public class IMBLTInnerNodeContentWrapper {

	DeepCopyObject[] keys;
    IMBLTNode[] child;
    
    public IMBLTInnerNodeContentWrapper(DeepCopyObject[] keys, IMBLTNode[] child) {
        this.keys = keys;
        this.child = child;
    }
    
    public boolean isLeaf() { return false;}
 
    public Object[] keys() { return keys;}
     
    public Object[] vals() { return null;}
 
    public Object highKey() {return keys[keys.length-1];}
 
    public IMBLTNode[] child() { return child;}

    public IMBLTNode next() {return child[child.length-1];}
 
    public String toString(){
        return "Dir(K"+Arrays.toString(keys)+", C"+Arrays.toString(child)+")";
    }

}
