    /**
     * 选择排序是通过设置一个基准值，然后整体选择一个最小数，若这个数比基准值小就交换，
     * 这样，通过一次选择就把最小值放到了最前面，循环进行就能得到一个有序序列。
     * 
     * 选择排序的时间复杂度为 O(n^2)
     */
    public void select(int[] arr){
        if (arr == null || arr.length < 2) {
            return;
        }
        int minIndex = 0;
        int len = arr.length;
        for (int i = 0; i < len - 1; i++) { //只需比较n-1次
            minIndex = i;
            for (int j = i+1; j < len; j++) { //默认最小值是arr[i]，所以从下一个数开始比较
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) { //如果不一致，说明还有比默认值更小的，交换
                int temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = temp;
            }
        }
    }
