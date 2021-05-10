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
            //System.out.println(i);
            Node nextTemp = temp.next;
            temp.next = node;
            node.next = nextTemp;

        }
    }
    public void remove(int index) {

        if (index == 0) {

            head = head.next;
        } else {
            Node temp = head;
            int i = 0;
            while (i < index - 1) {
                temp = temp.next;
                i++;
            }
            //System.out.println(i);
            Node nxtTemp = temp.next;
            temp.next = nxtTemp.next;


        }

    }
    public int get(int index){
        if(head == null){
            throw new RuntimeException("Null");
        }
        Node temp = head;
        int i = 0;
        while(i < index){
            temp = temp.next;
            i++;
        }
        //System.out.println(temp.data);
        return temp.data;
    }
    public void print(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println("");
    }
    public void clear(){
        Node temp = head;
        while(temp != null){
            temp.data = head.data;
            temp = temp.next;
            temp.next = head.next;
        }
        head = null;
    }
    public int size(){
        int size= 0;
        if(head == null){
            return size;
        }else{
            Node temp = head;
            while(temp!=null) {
                temp = temp.next;
                size++;
            }
        }
        return size;
    }
    public boolean contains(int number){
        if(head == null){
            return false;
        }
        Node temp = head;
        while(temp != null){
            if(number == temp.data){
                return true;
            }
            temp = temp.next;
        }
        return false;
    }
    public boolean empty(){
        return head == null;
    }
}
