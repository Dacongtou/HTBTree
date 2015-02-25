package ca.mcgill.disk.databaseIndex.IMBLTree;

import ca.mcgill.disk.databaseIndex.IMBLTree.IMBLTree.BNode;

public interface IMBLTNodeContentWrapper {
	
	public boolean isLeaf();
	 
    public DeepCopyObject[] keys();
     
    public DeepCopyObject[] vals();
 
    public DeepCopyObject highKey();
 
    public BNode[] child();

    public BNode next();
    
    public IMBLTNodeContentWrapper getNodeContentDeepCopy();

}
