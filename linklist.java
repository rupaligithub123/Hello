package linkedlist;

public class linklist {
	node head;
	class node{
		node next;
		int data;
		node(int d){
			next=null;
			data=d;
		}
	}
	
	public static linklist insert(linklist list,int da)
	{
		System.out.println("in insert"+list.head);
		node newn=list.new node(da);
		
		if(list.head==null)
			list.head=newn;
		else{
			node cur=list.head;
			while(cur.next!=null){
				cur=cur.next;
			}
			cur.next=newn;
		}
		return list;
	}
	public static void disp(linklist list)
	{
		node cur=list.head;
		System.out.println("in disp");

		while(cur!=null){
			System.out.println(cur.data);
			cur=cur.next;
		}
		
	}
	
	public static boolean checkLoop(linklist list)
	{
		node currnode=list.head;
		node nextnode=currnode.next;
		boolean flag=true;
		while(nextnode!=null)
		{
			if(currnode.data>nextnode.data)
			{
				flag=false;
				break;
			}
			currnode=nextnode;
			nextnode=nextnode.next;
		}
		return flag;
	}
	
	public static void main(String args[])
	{
		linklist list=new linklist();
		list=insert(list,1);
		list=insert(list,8);
		list=insert(list,3);
		disp(list);
		System.out.println("list contains loop: "+checkLoop(list));
	}

}
