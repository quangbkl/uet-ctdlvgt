package week5;

public class SLL {
    Node front, rear;

    // Chèn vào đầu danh sách
    public void unshift(int value) {
        if (front == null) {
            front = new Node(value);
            rear = front;
            return;
        }

        // Tạo node mới có giá trị = value và newNode.next = front
        Node newNode = new Node(value, front);
        front = newNode;
    }

    // Chèn vào cuối danh sách
    public void push(int value) {
        if (rear == null) {
            front = new Node(value);
            rear = front;
            return;
        }

        rear.next = new Node(value);
        rear = rear.next;
    }

    public int shift() throws SLLEmptyException {
        if (front == null) throw new SLLEmptyException("SLL is empty. Can not shift.");

        int result = front.data;
        front = front.next;
        return result;
    }

    public int pop() throws SLLEmptyException {
        if (rear == null) throw new SLLEmptyException("SLL is empty. Can not pop.");

        Node temp = front;
        while (temp.next != rear && temp.next != null) {
            temp = temp.next;
        }

        int result = rear.data;

        rear = temp;
        rear.next = null;

        return result;
    }

    public int front() {
        return front.data;
    }

    public int size() {
        int reslut = 0;

        Node temp = front;
        while (temp != null) {
            reslut++;
            temp = temp.next;
        }

        return reslut;
    }

    //Hàm in danh sách đó ra màn hình
    public void printLists() {
        Node temp = front;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}
