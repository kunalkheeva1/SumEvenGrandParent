class Node{
    int val;
    Node left;
    Node right;
    Node(int val, Node left, Node right){
        this.val = val;
        this.left = left;
        this.right = right;
    }

}



public class SumEvenGrandParent {


    static int sum=0;
    static void rec(Node current, Node par, Node gpar){
        if(current == null){
            return;
        }
        if(gpar != null && gpar.val%2 ==0){
            sum += current.val;
        }
        rec(current.left, current, par);
        rec(current.right, current, par);

    }

    static int sumEvenGrandParents(Node root){
    sum =0;
    rec(root, null, null);
    return sum;
    }



    public static void main(String[] args) {

    }
}
