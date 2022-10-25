//Program to add eelements in an array
public class NewMain3 {

    public static void main(String[] args) {
    
        //Initialize array  
        int [] arr = new int [] {1, 2, 3, 4, 5};  
        //int [] arr = {1,2,3,4,5};
       System.out.println(arr.length); //length function is used to find the length of array.
        int sum = 0;  
        //Loop through the array to calculate sum of elements  
        for (int i = 0; i < arr.length; i++) {  
            System.out.println(arr[i]);
           sum = sum + arr[i];  
        }  
        System.out.println("Sum of all the elements of an array: " + sum);  
    }  
}  
 /*  Evaluation of for loop
when i=0 ,  sum = sum + arr[0] = 0+1=1;
when i=1, sum = sum + arr[1] = 1+2= 3;
when i=2 , sum =sum + arr[2] = 3+ 3 =6;
when i=3 , sum = sum + arr[3] = 6+ 4= 10;
 when i=4 , sum = sum + arr[4] = 10+ 5= 15; 




*/
