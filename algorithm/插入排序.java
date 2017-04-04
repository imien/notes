    /**
     * 插入排序是通过比较找到合适的位置插入元素来达到排序的目的，
     * 插入排序待插数前面的数已经有序。
     * 
     * 简单插入排序的时间复杂度是 O(n^2)
     */
    public static void insert(int[] arr){
        if (arr == null || arr.length < 2) {
            return;
        }
        int index = 0;
        int target = 0;
        for (int i = 1; i < arr.length; i++) { //第一个数为基准值
            target = arr[i]; //待插入值
            index = i;
            while (index > 0 && target < arr[index - 1]) { //指针前移               
                arr[index] = arr[index - 1];
                index --;
            }
            arr[index] = target; //插入
        }
    }
