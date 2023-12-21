import java.util.*;

class Demo {
    Scanner sc = new Scanner(System.in);

    int arr[] = new int[5];

    void setdata() {
        System.out.print("Enter Elements Of Array: ");
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}

public class Array {
    public static void main(String args[]) {
        Demo d1 = new Demo();
        d1.setdata();
    }
}
