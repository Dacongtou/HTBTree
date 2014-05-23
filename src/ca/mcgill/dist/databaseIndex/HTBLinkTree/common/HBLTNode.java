package ca.mcgill.dist.databaseIndex.HTBLinkTree.common;

public interface HBLTNode {
	
	boolean isLeaf();
    Object[] keys();
    Object[] vals();
    Object highKey();
    long[] child();
    long next();
    HBLTNode nextNode();

}
