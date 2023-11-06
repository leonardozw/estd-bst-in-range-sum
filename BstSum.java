
public class BstSum{
    public static void main(String[] args) {

        // Exemplo 1 Entrada: raiz = [10,5,15,3,7,nulo,18], inicial = 7, final = 15
        TreeNode test1 = new TreeNode(10);
        test1.left = new TreeNode(5);
        test1.right = new TreeNode(15);
        test1.left.left = new TreeNode(3);
        test1.left.right = new TreeNode(7);
        test1.right.right = new TreeNode(18);

        BstSum bstSum1 = new BstSum();
        int low_test1 = 7;
        int high_test1 = 15;

        int sumInRange = bstSum1.rangeSumBST(test1, low_test1, high_test1);
        System.out.println("Soma dos valores no intervalo [" + low_test1 + ", " + high_test1 + "]: " + sumInRange);

        // Exemplo 2 Entrada: raiz = [10,5,15,3,7,13,18,1,nulo,6], inicial = 6, final = 10
        TreeNode test2 = new TreeNode(10);
        test2.left = new TreeNode(5);
        test2.right = new TreeNode(15);
        test2.left.left = new TreeNode(3);
        test2.left.right = new TreeNode(7);
        test2.right.left = new TreeNode(13);
        test2.right.right = new TreeNode(18);
        test2.left.left.left = new TreeNode(1);
        test2.left.right.left = new TreeNode(6);

        BstSum bstSum2 = new BstSum();
        int low_test2 = 6;
        int high_test2 = 10;

        int sumInRange2 = bstSum2.rangeSumBST(test2, low_test2, high_test2);
        System.out.println("Soma dos valores no intervalo [" + low_test2 + ", " + high_test2 + "]: " + sumInRange2);

    }

    int sum=0;
    
    public int helperFunc(TreeNode temp, int low, int high){
        if(temp.val<=high && temp.val>=low){
            sum=sum+temp.val;
        }
        if(temp.left!=null){
            helperFunc(temp.left,low,high);
        }
        if(temp.right!=null){
            helperFunc(temp.right,low,high);
        }
        return sum;
    }

    public int rangeSumBST(TreeNode root, int low, int high) {
        if(root==null){
            return 0;
        }
        else{
        return helperFunc(root,low,high);
        }
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}