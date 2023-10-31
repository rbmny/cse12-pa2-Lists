public class LinkedGL<E> implements MyList<E> {

    class Node {
        E value;
        Node next;

        public Node(E value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    Node front;
    int size;

    public LinkedGL(E[] contents) {
        this.front = new Node(null, null);
        this.size = contents.length;

    }

    // Fill in all methods
    public boolean isEmpty(){
        if (this.size != 0){
            return false;
        } return true;
    }

    public void transformAll(MyTransformer mt){

    }
    public void chooseAll(MyChooser mc){

    }

    public E[] toArray(){
    return new E[];
    }



}