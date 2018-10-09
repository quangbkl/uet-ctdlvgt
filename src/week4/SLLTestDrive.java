package week4;

public class SLLTestDrive {
    public static void main(String[] args) {
        SLL newSLL = new SLL();
        newSLL.push(5).unshift(3).push(8).insertIncrease(6).delete(3);
        newSLL.printLists();
    }
}
