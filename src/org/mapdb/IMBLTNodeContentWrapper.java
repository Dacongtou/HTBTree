package org.mapdb;

import org.mapdb.BTreeMap.BNode;

public interface IMBLTNodeContentWrapper {
	
	public boolean isLeaf();
	 
    public DeepCopyObject[] keys();
     
    public DeepCopyObject[] vals();
 
    public DeepCopyObject highKey();
 
    public BNode[] child();

    public BNode next();
    
    public IMBLTNodeContentWrapper getNodeContentDeepCopy();

}
