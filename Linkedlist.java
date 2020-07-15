public class Linkedlist {
    private Node head;
    private Node tail;
    private int size = 0;
    private class Node{
        private Object data; //데이터가 저장될 필드
        private Node next; //다음 노드를 가리키는 필드
        public Node(Object input){
            this.data = input;
            this.next = null;
        }
        
        public String toString(){
            return String.valueOf(this.data); //노드의 내용을 출력해서 확인할수 있는 기능
        }
    }

    //시작에 데이터를 추가하는 메서드
    public void addFirst(Object input){
        Node newNode = new Node(input);
        newNode.next = head;
        head = newNode;
        size++;
        if(head.next == null){
            tail = head;
        }
    }

    //끝에 데이터를 추가하는 메서드
    public void addLast(Object input){
        Node newNode = new Node(input);
        if(size == 0){
            addFirst(input);
        }
        else{
            tail.next = newNode;
            tail = newNode;
            size++;
        }
    }

    //특정 위치의 노드를 찾아내는 메서드드
   Node node(int index){
        Node x = head;
        for(int i=0; i<index; i++){
            x = x.next;
        }
        return x;
    }

    //특정 위치(중간)에 노드를 추가하는 메서드
    public void add(int k, Object input){
        if(k == 0){
            addFirst(input);
        } else{
            Node temp1 = node(k-1);
            Node temp2 = temp1.next;
            Node newNode = new Node(input);
            temp1.next = newNode;
            newNode.next = temp2;
            size++;

            if(newNode.next == null){
                tail = newNode;
            }
        }
    }


    public String toString(){
        if(head == null){
            return "[]";
        }
        Node temp = head;
        String str = "[";

        while(temp.next != null){
            str += temp.data + ", ";
            temp = temp.next;
        }

        str += temp.data; //마지막 노드를 출력결과에 포함시킴
        return str+"]";
    }
}
