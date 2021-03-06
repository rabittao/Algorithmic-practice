  public class BinarySearch {
      /*
       * 循环实现二分查找算法arr 已排好序的数组x 需要查找的数-1 无法查到数据
       */
      public static int binarySearch(int[] arr, int x) {
          int low = 0;
          int high = arr.length - 1;
          while (low <= high) {
              int middle = (low + high) / 2;
              if (x == arr[middle]) {
                  return middle;
              } else if (x < arr[middle]) {
                  high = middle - 1;
              } else {
                  low = middle + 1;
              }
          }
          return -1;
          public static void main (String[]args){
              int[] arr = {1, 2, 2, 4, 5, 5};
              System.out.println("循环查找：" + (binarySearch(arr, 2) + 1));
          }
      }
  }
