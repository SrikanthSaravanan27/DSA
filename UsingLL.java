public class UsingLL {
    public static void main(String[] args) {
        LL list = new LL();
        list.insertAtBegining(45);
        list.insertAtBegining(65);
        list.insertAtBegining(23);
        list.insertAtEnd(1);
        list.insert(27,2);
        list.display();
        System.out.println(list.deleteFirst());
        System.out.println(list.deleteLast());
        System.out.println(list.deleteIndex(1));
        list.display();
    }
}
