package week4;

public class SLL {
    private Node head;

    // Chèn một số vào đầu danh sách
    public SLL unshift(int value) {
        Node newNode = new Node(value, head);
        this.head = newNode;
        return this;
    }

    // Chèn một số vào cuối danh sách
    public SLL push(int value) {
        Node newNode = new Node(value);

        if (head == null) {
            this.head = newNode;
            return this;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;

        return this;
    }

    public SLL insertAfter(Node node, int value) {
        if (node == null) {
            return this;
        }

        Node newNode = new Node(value, node.next);
        node.next = newNode;

        return this;
    }

    // Chèn một số vào vị trí sao cho nó phải lớn hơn tất cả những số trước nó
    public SLL insertIncrease(int value) {
        if (head == null) {
            return this.push(value);
        }

        Node temp = head;
        while (temp.next != null) {
            if (temp.data < value && value < temp.next.data) {
                return this.insertAfter(temp, value);
            }

            temp = temp.next;
        }

        return this.push(value);
    }

    public SLL delete(int value) {
        if (head == null) return this;

        if (head.data == value) {
            head = head.next;
            return this;
        }

        Node temp = head;
        while (temp.next != null) {
            if (temp.next.data == value) {
                temp.next = temp.next.next;
                return this;
            }

            temp = temp.next;
        }

        return this;
    }

    //Hàm in danh sách đó ra màn hình
    public void printLists() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}
