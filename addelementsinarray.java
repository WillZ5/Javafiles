import java.util.Scanner;

public class AlgorithmClass {
    public static void main(String[] args) {


        int num;
        int ii = 0;

        Scanner SetLength = new Scanner(System.in);
        System.out.print("Enter the array length: ");
        num = SetLength.nextInt();

        int[] arr = new int[num];

        while ( ii < num){

            System.out.println("Enter value "+ ii + ":" );
            arr[ii] = SetLength.nextInt();
            ii++;
        }

        System.out.println("Array length:" + arr.length);
        int sum = 0;
        int MaxNum = arr[0];
        int MinNum = arr[0];


        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.println(arr[i] + " is an even number.");
            } else {
                System.out.println(arr[i] + " is an odd number.");
            }

            if (arr[i] > MaxNum) {
                MaxNum = arr[i];

            }
        }
            System.out.println("The greatest number is: " + MaxNum);

        for (int iii = 0; iii < arr.length; iii++) {


            if (arr[iii] < MinNum) {
                MaxNum = arr[iii];

            }
        }

    }
}


