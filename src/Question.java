import org.jetbrains.annotations.Contract;

import java.util.Scanner;
public class Question {
    @Contract(pure = true)
    static int lastOccureance(int[]arr, int x){
        int lastIndex = -1;
        for(int i = 0 ; i <arr.length;i++){
            if(arr[i] == x){
                lastIndex = i;
            }
        }
        return lastIndex;
    }

    static int countofOccurance(@org.jetbrains.annotations.NotNull int[]arr , int x ){
        int count = 0;
        for(int i = 0 ;i<arr.length;i++){
            System.out.println("Enter a number",+n,"elements:");
        for(int i = 0 ;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter X");
        int x = sc.nextInt();
        System.out.println("count:",CountofOccurance(arr,x));

    }
    }
    }


