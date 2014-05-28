package ca.mcgill.dist.databaseIndex.HTBLinkTree.common;

import java.util.Arrays;
import java.util.List;


public final class HBLTInnerNode implements HBLTNode{
    final Object[] keys;
    final long[] child;

    public HBLTInnerNode(Object[] keys, long[] child) {
        this.keys = keys;
        this.child = child;
    }

    public HBLTInnerNode(Object[] keys, List<Long> child) {
        this.keys = keys;
        this.child = new long[child.size()];
        for(int i=0;i<child.size();i++){
            this.child[i] = child.get(i);
        }
    }


    @Override 
    public boolean isLeaf() { return false;}

    @Override 
    public Object[] keys() { return keys;}
    
    @Override 
    public Object[] vals() { return null;}

    @Override 
    public Object highKey() {return keys[keys.length-1];}

    @Override 
    public long[] child() { return child;}

    @Override 
    public long next() {return child[child.length-1];}

    @Override 
    public String toString(){
        return "Dir(K"+Arrays.toString(keys)+", C"+Arrays.toString(child)+")";
    }

	@Override
	// Need to modify this
	public HBLTNode nextNode() {
		// TODO Auto-generated method stub
		return null;
	}

}
