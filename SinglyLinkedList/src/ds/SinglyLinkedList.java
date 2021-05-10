package ds;
    //Using Arrays is prohibited as well.
public class SinglyLinkedList {

    public class Node{
        int data;
        Node next;
    }
        Node head;

    public void add(int number){
        Node node = new Node();
        node.data = number;
        node.next = null;
        if(head == null){
            head = node;
            return;
        }else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = node;
        }
    }
    public void add(int index,int number){
        Node node = new Node();
        node.data = number;
        node.next = null;
        if (index == 0){
            node.next = head;
            head = node;
        }else{
            Node temp = head;
            int i = 0;
            while(i<index-1){
                temp = temp.next;
                i++;
            }
            System.out.println(i);
            Node nextTemp = temp.next;
            temp.next = node;
            node.next = nextTemp;

        }
    }
    public void remove(int index){

    }
    public int get(int index){
        return 0;
    }
    public void print(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
    public void clear(){

    }
    public int size(){
        return 0;
    }
    public boolean contains(int number){
        return false;
    }
    public boolean empty(){
        return true;
    }
}
