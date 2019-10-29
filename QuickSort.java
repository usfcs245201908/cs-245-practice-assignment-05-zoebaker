public class QuickSort implements SortingAlgorithm {


   public void sort(int[] a) {
        quicksort(a, 0, a.length-1);
        /*for(int n : a)
            System.out.println(n);*/
    }

    public void quicksort(int []a, int low, int high){


        if (low < high){
            int mid = Partition (a, low, high);
            quicksort (a,low, mid-1);
            quicksort (a, mid+1, high);
        }
    }

    public int Partition(int [] a,  int low, int high){
        int pivot = low;
        int i = low + 1;
        int j= high;

        while(i <= j ){
            while (a[i]< a [pivot] && i <= high){
                i++;
            }
            while ( j > low && a[j] >= a[pivot]){
                j--;
            }
            if (i<=j){
                swap(a, i, j);
                j--;
                i++;
            }
            else {
                break;
            }
        }
        swap (a, j, pivot);
        return j;
    }

    public void swap (int[] a, int index1, int index2){
        int temp = a[index1];
        a[index1]= a[index2];
        a[index2]= temp;
    }

    public String sortName(){
        return "Quicksort";
    }

    /*public static void main(String[] args) {
        QuickSort quick = new QuickSort();
        int[] nums = {1,1,2,5,2,5,4,3,4,4,1};
        quick.sort(nums);*/
    }


