package com.bridgelabz.program;
/***************************************************************************
 * @purpose : Node class for the queue
 * @author  : Madhuri Chaudhari
 * @version : 1.0
 * @date    : 15/03/2018
 ***************************************************************************/
public class Node 
{
	   protected Object data;
	    protected Node link;
	 
	    /*  Constructor  */
	    public Node()
	    {
	        link = null;
	        data = 0;
	    }    
	    /*  Constructor  */
	    public Node(Object data2,Node n)
	    {
	        data = data2;
	        link = n;
	    }    
	    /*  Function to set link to next Node  */
	    public void setLink(Node n)
	    {
	        link = n;
	    }    
	    /*  Function to set data to current Node  */
	    public void setData(int d)
	    {
	        data = d;
	    }    
	    /*  Function to get link to next node  */
	    public Node getLink()
	    {
	        return link;
	    }    
	    /*  Function to get data from current Node  */
	    public   Object getData() {
	    	return  data;
	    }
	    

}
