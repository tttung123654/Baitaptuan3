import java.util.Scanner;

public class Bai10 {

    public static void main(String[] args) {
    
        int n;
        int[] A;
        Scanner sc = new Scanner(System.in);
      
        System.out.print("Nhap so phan tu cua mang: ");
        n = sc.nextInt();

   
        A = new int[n];

     
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap gia tri cho phan tu thu " + (i + 1) + ": ");
            A[i] = sc.nextInt();
        }

       
        System.out.println("Mang ban dau la: ");
        for (int i = 0; i < n; i++) {
            System.out.print(A[i] + " ");
        }
        
	
	for (int i = 1; i < n; i++) {
	    int key = A[i]; 
	    int j = i - 1;

	 
	    while (j >= 0 && A[j] > key) {
	        A[j + 1] = A[j];
	        j--;
	    }

	  
	    A[j + 1] = key;
	}


	System.out.println("\nMang sau khi sap xep la: ");
	for (int i = 0; i < n; i++) {
	    System.out.print(A[i] + " ");
	}
    }
}
