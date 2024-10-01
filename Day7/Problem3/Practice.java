import java.util.LinkedList;

public class Practice {
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    Node head=null;
    Node tail=null;
    void addTail(int data){
        Node newNode=new Node(data);
        if(head==null){
              head=newNode;
              tail=newNode;
        }else{
            tail.next=newNode;
            tail=newNode;
        }
    }
    /*void addHead(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            tail=newNode;
        }else{
            Node temp=head;
            head=newNode;
            head.next=temp;
        }
    }*/
    void addPosition(int ind,int data){
        Node newNode=new Node(data);
        if(ind==0){
            newNode.next=head;
            head=newNode;
        }
        else{
            Node curr=head;
            ind=ind-1;
            while(ind>0){
                curr=curr.next;
                ind=ind-1;
            }
            newNode.next=curr.next;
            curr.next=newNode;
        }
    }
    /*void reverse(){
        Node prev=null;
        Node curr=head;
        while(curr!=null){
            Node temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        while(prev!=null){
            System.out.println(prev.data);
            prev=prev.next;
        }

    }*/
    void display(){
        Node curr=head;
        while(curr!=null){
            System.out.println(curr.data);
            curr=curr.next;
        }

    }
    public static void main(String[] args) {
        Practice obj=new Practice();
        obj.addTail(16);
        obj.addTail(13);
        obj.addTail(7);
        obj.addPosition(2,1);
        obj.display();


    }
}
