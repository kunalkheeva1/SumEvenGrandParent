// Tree Node class
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

    //universal sum so that I can use it to be calculated in one and returned in another method
    //I need clarity about why do i need to declare it again actual method of execution
    static int sum=0;
    static void rec(Node current, Node par, Node gpar){
        // if its empty then no calculation can take place
        if(current == null){
            return;
        }
        // if grandparent is not null and its even then add the value of current in sum
        // then do the same on left and right side, of the tree, by making current as parent
        // and parent as grandparent
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
