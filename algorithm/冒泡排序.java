    /**
     * 冒泡排序的思想是通过与相邻元素的比较和交换来把小的数交换到最前面。
     * 这个过程类似于水泡向上升一样，因此得名。
	 *
     * 冒泡排序的时间复杂度为O(n^2)
     */
    public static void buttle(int[] arr) {
        if (arr != null || arr.length < 2) {
            return;
        }
        int len = arr.length;
        for (int i = len - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
