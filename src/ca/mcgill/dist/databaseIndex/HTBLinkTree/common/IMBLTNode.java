package ca.mcgill.dist.databaseIndex.HTBLinkTree.common;

// HTBLinkTree -> Hash Table B-Link tree
// IMBLTNode -> In-memory B-Link Tree Node
// IMBLTLeafNode -> In-memory B-Link Tree Leaf Node
// IMBLTInnerNode -> In-memory B-Link Tree Inner Node

public interface IMBLTNode {
	
	boolean isLeaf();
    Object[] keys();
    Object[] vals();
    Object highKey();
    long[] child();
    long next();

}
