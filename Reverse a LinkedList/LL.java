public class LL {
   private Node head;
    private class Node{
        Node next;
        int data;
        Node(int val){
            this.data=val;
        }
    }
    public void insertAtLastNode(int val){
        Node NewNode=new Node(val);
        if(head==null){
            head=NewNode;
            return;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=NewNode;
    }
    public void Reverse(){
        if(head==null || head.next==null) return;
        Node Prev=null;
        Node current=head;
        Node next=head.next;
        while(current!=null){
            current.next=Prev;
            Prev=current;
            current=next;
            if(next!=null){
                next=next.next;
            }
        }
        head=Prev;
    }
    public void Display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"-->");
            temp=temp.next;
        }
        System.out.println("Null");
    }
}
