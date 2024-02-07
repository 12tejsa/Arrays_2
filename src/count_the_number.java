import java.util.Scanner;

public class Questions{

    static int CountofOccurance(int[]arr,int x){
        int count = 0 ;
        for(int i = 0 ; i< arr.length;i++){
            if (arr[i] == x){
             count++;
            }
        }
        return count;
    }
}
    public static void main(String[] args) {
        Scanner.sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter a number",+n,"elements:");
        for(int i = 0 ;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter X");
        int x = sc.nextInt();
        System.out.println("count:",CountofOccurance(arr,x));

    }
}
