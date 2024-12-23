

class Node {
    
    int data;
    Node next;
    
    public Node(int data){  // 
        this.data=data;
        this.next=null;
    }
}

class LinkedList{
    
    Node head;
    Node tail;
    
    public LinkedList(){     // constructor
        
        this.head =null;
        this.tail=null;
    }
    
    public void addNode(int data){
        Node newNode =new Node(data);
        if(head==null){
            head =tail=newNode;
        } else{
            tail.next =newNode;
            tail=newNode;
        }
    }
    
    public void display(){
        Node current=head;
        
        while(current!=null){
            System.out.print(current.data + "->");
            current =current.next;
        }
    }
}

public class Main
{
	public static void main(String[] args) {
	 LinkedList list = new LinkedList();

        // Adding nodes to the linked list
        list.addNode(10);
        list.addNode(20);
        list.addNode(30);
        list.addNode(40);

        // Displaying the linked list
        System.out.println("Linked List:");
        list.display();
	}
}
