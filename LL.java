public class LL {


    private Node head;
    private Node tail;
    private int size;

    LL(){
        this.size = 0;
    }

    class Node{
        private int val;
        private Node next;

        Node(int val){
            this.val = val;
        }
        Node(int val,Node next){
            this.val = val;
            this.next = next;
        }
    }
    public void insertAtBegining(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;
        if(tail == null){
            tail = node;
        }
        size += 1;
    }
    public void insertAtEnd(int val){
        Node node = new Node(val);
        Node temp = head;
        if(head == null){
            this.insertAtBegining(val);
        }
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = node;
        tail = node;

        size += 1;
    }

    public void insert(int val,int index){
        if(index == 0){
            insertAtBegining(val);
        }
        if(index == size){
            insertAtEnd(val);
        }
        Node node = new Node(val);
        Node temp = head;
        int i = 1;
        while(i < index){
            temp = temp.next;
            i++;
        }

        node.next = temp.next;
        temp.next = node;

        size += 1;
    }
    public int deleteFirst(){
        int val = head.val;
        head = head.next;
        size--;
        if(head == null){
            tail = null;
        }
        return val;
    }

    public int deleteLast(){
        if(size <= 1){
            this.deleteFirst();
        }
        Node secondLast = this.get(size - 2);
        int val = tail.val;
        tail = secondLast;
        secondLast.next = null;
        size--;
        return val;
    }
    public int deleteIndex(int index){
        if(index == 0){
            this.deleteFirst();
        }
        if(index == size){
            this.deleteLast();
        }

        Node prev = get(index-1);
        int val = prev.next.val;
        prev.next = prev.next.next;
        return val;
    }

    public Node find(int val){
        Node temp = head;
        while(temp != null){
            if(temp.val == val){
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }
    public Node get(int index){
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("End");
    }
}
