import java.util.Scanner;

public class combineArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size1, size2;
        //array 1
        do {
            System.out.println("Enter size for first array :");
            size1 = scanner.nextInt();
            if (size1 > 20 ){
                System.out.println("size should NOT exceed 20");
            }
        }while (size1 >20);
        //Enter element for array
        int [] array1 = new int[size1];
        for (int i=0; i<size1; i++){
            System.out.println("Element "+ (i+1)+" is: ");
            array1[i] = scanner.nextInt();
        }
        //size array 2
        do {
            System.out.println("Enter size for second array :");
            size2 = scanner.nextInt();
            if (size2 > 20 ){
                System.out.println("size should NOT exceed 20");
            }
        }while (size2 >20);
        //Enter element for array
        int [] array2 = new int[size2];
        for (int i=0; i<size2; i++){
            System.out.println("Element "+ (i+1)+" is: ");
            array2[i] = scanner.nextInt();
        }
        //Show array1
        System.out.print("Array 1: ");
        for (int element:array1){
            System.out.print(element + "\t");
        }
        System.out.println(" ");
        //Show array2
        System.out.print("Array 2: ");
        for (int element:array2){
            System.out.print(element + "\t");
        }
        System.out.println(" ");
        //combine array
        int [] newArray = new  int[size1+size2];
        for (int i=0; i<newArray.length;i++){
            if (i < array1.length){
                newArray[i] = array1[i];
            }else {
                newArray[i] = array2[i-array1.length];
            }
        }
        //show newArray
        System.out.print("NewArray is: ");
        for (int element:newArray){
            System.out.print(element + "\t");
        }
    }
}
