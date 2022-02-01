
class Main{
    public static void main(String[] args) {
        //Reverse a LinkedList
        //Input:- (1)-->(2)-->(3)-->(4)--->(5)-->(6)
        //Output:- (6)-->(5)-->(4)-->(3)--->(2)-->(1)
        LL Node=new LL();
        Node.insertAtLastNode(1);
        Node.insertAtLastNode(2);
        Node.insertAtLastNode(3);
        Node.insertAtLastNode(4);
        Node.insertAtLastNode(5);
        Node.insertAtLastNode(6);
        Node.Display();
        Node.Reverse();
        Node.Display();
    }
}