
public class BinaryTree {

	public static void main(String[] args) {
		
		Node root = buildTree();
		if(root.hasChild() == false)
			System.out.println("Height = 0");
		
		int height = traverseNode(root);
		System.out.println("Height = " + --height);
	}
	
	private static Node buildTree(){
		Node root = new Node(1);
		root.leftChild = new Node(2);
		root.rightChild = new Node(3);
		
		root.leftChild.leftChild = new Node(4);
		root.leftChild.leftChild.leftChild = new Node(5);
		root.leftChild.leftChild.leftChild.leftChild = new Node(6);
		root.leftChild.leftChild.leftChild.leftChild.leftChild = new Node(7);
		root.leftChild.leftChild.leftChild.leftChild.leftChild.leftChild = new Node(8);
		root.leftChild.leftChild.leftChild.leftChild.leftChild.leftChild.leftChild = new Node(9);
		
		root.leftChild.leftChild.leftChild.leftChild.rightChild = new Node(10);
		root.leftChild.leftChild.leftChild.leftChild.rightChild.rightChild = new Node(11);
		root.leftChild.leftChild.leftChild.leftChild.rightChild.rightChild.rightChild = new Node(12);
		root.leftChild.leftChild.leftChild.leftChild.rightChild.rightChild.rightChild.rightChild = new Node(13);
		root.leftChild.leftChild.leftChild.leftChild.rightChild.rightChild.rightChild.rightChild.rightChild = new Node(14);
		root.leftChild.leftChild.leftChild.leftChild.rightChild.rightChild.rightChild.rightChild.rightChild.rightChild = new Node(15);
		root.leftChild.leftChild.leftChild.leftChild.rightChild.rightChild.rightChild.rightChild.rightChild.rightChild.rightChild = new Node(16);
		root.leftChild.leftChild.leftChild.leftChild.rightChild.rightChild.rightChild.rightChild.rightChild.rightChild.rightChild.rightChild = new Node(17);
	
		root.rightChild.rightChild = new Node(18);
		root.rightChild.rightChild.leftChild = new Node(19);
		root.rightChild.rightChild.leftChild.rightChild = new Node(20);
		root.rightChild.rightChild.leftChild.rightChild.rightChild = new Node(21);
		root.rightChild.rightChild.leftChild.rightChild.rightChild.rightChild = new Node(22);
		root.rightChild.rightChild.leftChild.rightChild.rightChild.rightChild.leftChild = new Node(23);
		root.rightChild.rightChild.leftChild.rightChild.rightChild.rightChild.leftChild.rightChild = new Node(24);
		
		return root;
	}

	private static int traverseNode(Node node){
		
		if(node == null)
			return 1;
		
		System.out.print(node.value + " ");
		
		int leftHeight = 1 + traverseNode(node.leftChild);
		int rightHeight = 1 + traverseNode(node.rightChild);
		
		return Math.max(leftHeight, rightHeight);
	}
}

class Node{
	int value = 0;
	Node leftChild = null;
	Node rightChild = null;
	
	Node(int value){
		this.value = value;
	}
	
	public boolean hasChild(){
		return this.leftChild != null && this.rightChild != null;
	}
	
	public String toString(){
		return String.valueOf(value);
	}
}
