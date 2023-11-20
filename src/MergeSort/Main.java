package MergeSort;

public class Main {

    public static void main(String[] args) {
        int[] array = new int[]{123,122,132,51,12,5,612,32};
        print(array);
        mergeSort(array);
        System.out.println();
        print(array);
    }

    private static void print(final int[] arr) {
        for(int el : arr) {
            System.out.print(el + ",");
        }
    }

    private static void mergeSort(final int[] arr) {
        int[] temp = new int[arr.length];

        mergeSort(arr, temp, 0, arr.length - 1);
    }

    private static void mergeSort(final int[] arr, final int[] temp, final int left, final int right) {
        if(left < right) {
            int mid = (left + right) / 2;
            mergeSort(arr, temp, left, mid);
            mergeSort(arr, temp, mid + 1, right);

            merge(arr, temp, left, mid, right);
        }
    }

    private static void merge(final int[] arr, final int[] temp, final int left, final int mid, final int right) {
        int i = left;
        int j = mid + 1;
        int k = left;

        while (i <= mid && j <= right) {
            if(arr[i] <= arr[j]){
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        while (j <= right) {
            temp[k++] = arr[j++];
        }

        for (int p = 0; p <= right; p++) {
            arr[p] = temp[p];
        }
    }
}

