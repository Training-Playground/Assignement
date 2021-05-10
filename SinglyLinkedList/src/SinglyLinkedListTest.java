import ds.SinglyLinkedList;

public class SinglyLinkedListTest {
    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.add(10);
        sll.add(20);
        sll.add(30);
        sll.print();
        sll.add(1,15);
        sll.print();
        System.out.println(sll.size());
        System.out.println(sll.contains(50));
        System.out.println(sll.contains(15));
    }
}
