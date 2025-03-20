package manushi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BinarySearch {

    
    public static int binarySearch(ArrayList<Integer> list, int target, int left, int right) {
       
        if (left > right) {
            return -1;
        }

        int mid = left + (right - left) / 2;

       
        if (list.get(mid) == target) {
            return mid;
        }

       
        if (list.get(mid) > target) {
            return binarySearch(list, target, left, mid - 1);
        }

        
        return binarySearch(list, target, mid + 1, right);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Shkruaj gjatësin e listë: ");
        int n = scanner.nextInt();

        
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Shkruaj elementet e listës:");
        for (int i = 0; i < n; i++) {
            list.add(scanner.nextInt());
        }

        
        Collections.sort(list);
        System.out.println("Lista e sortuar: " + list);

        
        System.out.print("Shkruaj numrin qe kerkoni: ");
        int target = scanner.nextInt();

        
        int result = binarySearch(list, target, 0, list.size() - 1);

        
        if (result == -1) {
            System.out.println("Elementi nuk u gjetë në listë.");
        } else {
            System.out.println("Elementi u gjetë në indeksin: " + result);
        }

        scanner.close();
    }
}
