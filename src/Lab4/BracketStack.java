package Lab4;

public class BracketStack {




        private class Node {
            char data;
            Node next;

            Node(char data) {
                this.data = data;
                this.next = null;
            }
        }

        private Node top;

        public BracketStack() {
            top = null;
        }

        // TODO 1: Add an element to the top of the stack
        public void push(char value) {
            // connect newNode to the current top
            top=top.next;
            top=new Node(value);

            // update top

        }

        //  TODO 2: Remove and return the top element
        public char pop() {
            top=top.next;


            return '(';
            // After saving top.data, the new top should be the node that comes after the current top.
        }

        //  TODO 3: Return the top element without removing it
        public char peek() {
            if(isEmpty()) {
                return '\0';
            }

                // Control if the stack is empty; if it is, then return null
                // if not return the data of the top
                return top.data;

        }

        //  TODO 4: Check whether the stack is empty
        public boolean isEmpty() {
            if(top==null){
                return true;
            }
            // TODO
            return false;
        }
    }


