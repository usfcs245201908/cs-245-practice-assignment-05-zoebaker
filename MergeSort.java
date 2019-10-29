import java.util.Arrays;

public class MergeSort implements SortingAlgorithm {
     public void merge(int [] left, int [] right, int [] target) {
         int i = 0;
         int j = 0;
         int k = 0;
         while (i < left.length && j < right.length) {
             if (left[i] <= right[j]) {
                 target[k] = left[i];
                 i++;
             } else {
                 target[k] = right[j];
                 j++;
             }
             k++;
         }
         // if there are remaining elements in left, copy them over
         while (i<left.length){
             target[k] = left[i];
             i++;
             k++;
         }
         // if there are remaining elements in right
         while (j < right.length){
             target[k] = right [j];
             j++;
             k++;
         }
     }



    public void sort(int [] a) {
        int n = a.length;
        while (a.length > 1) {
            int[] left = Arrays.copyOfRange(a, 0, a.length/2);
            int[] right = Arrays.copyOfRange(a,a.length/2, a.length);
            sort(left);
            sort(right);
            merge(left, right, a);
            /*int mid = n / 2;
            int[] left = Arrays.copyOfRange(a, 0, mid);
            int[] right = Arrays.copyOfRange(a, mid + 1, a.length-1);
            sort(left);
            sort(right);
            merge(left, right, a); */
        }

    }

    public String sortName(){
         return "mergesort";
    }



}
