package ca.mcgill.dist.databaseIndex.HTBLinkTree.common;

import java.util.Arrays;

public final class HBLTLeafNode implements HBLTNode{
    final Object[] keys;
    final Object[] vals;
    final long next;

    HBLTLeafNode(Object[] keys, Object[] vals, long next) {
        this.keys = keys;
        this.vals = vals;
        this.next = next;
        assert(vals==null||keys.length == vals.length+2);
    }

    @Override 
    public boolean isLeaf() { return true;}

    @Override 
    public Object[] keys() { return keys;}
    
    @Override 
    public Object[] vals() { return vals;}

    @Override 
    public Object highKey() {return keys[keys.length-1];}

    @Override 
    public long[] child() { return null;}
    
    @Override 
    public long next() {return next;}

    @Override 
    public String toString(){
        return "Leaf(K"+Arrays.toString(keys)+", V"+Arrays.toString(vals)+", L="+next+")";
    }

	@Override
	// Should be modified later
	public HBLTNode nextNode() {
		// TODO Auto-generated method stub
		return null;
	}
}