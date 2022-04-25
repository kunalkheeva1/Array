public class Array {
    public static int[] m1(){
        return new int[]{1,3,234,324};
    }
    public static void main(String[] args){
    int []arr = m1();
    for(int i=0; i<arr.length; i++){
        System.out.print(arr[i]+ " ");
    }
    }
}