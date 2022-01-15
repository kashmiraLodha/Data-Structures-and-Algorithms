package trees;

public class tree_traversal extends binary_tree{
	public void preorder()
	{
		preorder(this.root);
	}
	private void preorder(Node nn) {
		// TODO Auto-generated method stub
		if(nn==null)
			return;
		System.out.print(nn.data+" >> ");
		preorder(nn.left);
		preorder(nn.right);
		
		
	}
	
	public void inorder()
	{
		inorder(this.root);
	}
	private void inorder(Node nn) {
		// TODO Auto-generated method stub
		if(nn==null)
			return ;
		inorder(nn.left);
		System.out.print(nn.data+">>");
		inorder(nn.right);

	}

	public void postorder()
	{
		postorder(this.root);
	}
	private void postorder(Node nn) {
		// TODO Auto-generated method stub
		if(nn==null)
			return ;
		postorder(nn.left);
		postorder(nn.right);
		System.out.print(nn.data+">>");

	}


}
