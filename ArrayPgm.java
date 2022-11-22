
import java.util.Scanner;
public class ArrayPgm {
        static void sort(int[] arr) {
            System.out.print("Sorted Array are: \t");
            for (int i = 0; i < arr.length; i++) {
                for (int j = i + 1; j < arr.length; j++) {
                    int temp = 0;
                    if (arr[i] > arr[j]) {
                        temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
                System.out.print(arr[i]+" ");
            }
        }



        static boolean search(int arr[],int number){
            for(int k=0;k<arr.length;k++){
                if(arr[k] == number) {
                    return true;
                }
            }
            return false;
        }



        public static void main(String a[]) {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter array size ");
                int size = sc.nextInt();
                int arr[] = new int[size];
                System.out.println("Enter the elements");
                for(int i=0;i<size;i++) {
                    arr[i] = sc.nextInt();
                }
                System.out.print("Enter the number for searching");
                int n = sc.nextInt();
                boolean isFound = search(arr,n);
                if(isFound){
                    System.out.println("Number is Found");
                }
                else {
                    System.out.println("Number is not Found");
                }
                sort(arr);
            }catch (Exception e) {
                System.out.println("Exception Found");
            }
        }
    }

