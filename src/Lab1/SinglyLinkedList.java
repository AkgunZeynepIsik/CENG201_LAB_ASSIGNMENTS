package Lab1;
   public class SinglyLinkedList {

        private Node head;

        public SinglyLinkedList() {
            head = null;
        }

        //inserting a node to last
        public void add(int data) {
            Node newNode = new Node(data);

            if (head == null) {
                head = newNode;
                return;
            }

            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }

        //printing
        public void display() {
            Node current = head;
            while (current != null) {
                System.out.print(current.data + " --> ");
                current = current.next;
            }
            System.out.println("NULL");
        }

        //finding the middle node
        public Node findMiddle() {
            int count = 0;
            Node current = head;
            while (current != null) {
                count++;
                current = current.next;
            }

            int middleIndex = count / 2;

            current = head;
            for (int i = 0; i < middleIndex; i++) {
                current = current.next;
            }
            return current; //if list is empty it returns null
        }

        //removing the middle node
        public void deleteMiddle() {
            //step 1:count the nodes
            int count = 0;
            Node current = head;
            while (current != null) {
                count++;
                current = current.next;
            }

            //if list is empty return
            if (count == 0) {
                return;
            }

            //if list has 1 node
            if (count == 1) {
                head = null;
                return;
            }


            int middleIndex = count / 2;
            Node prev = head;
            for (int i = 0; i < middleIndex - 1; i++) {
                prev = prev.next;
            }


            prev.next = prev.next.next;
        }

        public Node getHead() {
            return head;
        }
    }

