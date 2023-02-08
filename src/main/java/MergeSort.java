public class MergeSort {

    public static void main(String[] args) {
        int[] a = {5, 1, 6, 2, 3, 4, -6, -7, -3, 7, 6, 5};

        System.out.println("in.txt   " + "   out.txt");

         for (int i = 0; i < a.length; i++)
        System.out.println(a[i]);
        System.out.println();
        Sort.mergeSort(a, a.length);

        for (int i = 0; i < a.length; i++)
            System.out.println(a[i] + " out");
    }
}
