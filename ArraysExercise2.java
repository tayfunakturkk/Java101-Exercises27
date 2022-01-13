package Arrays.Exercise2;
import java.util.Scanner;
import java.util.Arrays;
public class ArraysExercise2 {
    public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    System.out.print("Please enter the value to check:");    
    int number=input.nextInt();
    int[] list={12,15,788,1,-1,-778,2,0};
    Arrays.sort(list);
    int max=number,min=number;
    for(int i=0; i<list.length; i++){
       if(list[i]>number){
            min=list[i-1];           
            max=list[i];
            break;
    }
    }
System.out.println("Array:"+Arrays.toString(list));
System.out.println("Value of enter:"+number);
System.out.println("The nearest number smaller than the entered number:"+min);
System.out.println("The nearest number greater than the entered number:"+max);
}
}