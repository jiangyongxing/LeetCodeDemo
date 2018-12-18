package com.fengrong.xing;

public class Demo5 {

    /**
     * 给定一个二进制矩阵 A，我们想先水平翻转图像，然后反转图像并返回结果。
     * <p>
     * 水平翻转图片就是将图片的每一行都进行翻转，即逆序。例如，水平翻转 [1, 1, 0] 的结果是 [0, 1, 1]。
     * <p>
     * 反转图片的意思是图片中的 0 全部被 1 替换， 1 全部被 0 替换。例如，反转 [0, 1, 1] 的结果是 [1, 0, 0]。
     * <p>
     * 示例 1:
     * <p>
     * 输入: [[1,1,0],[1,0,1],[0,0,0]]
     * 输出: [[1,0,0],[0,1,0],[1,1,1]]
     * 解释: 首先翻转每一行: [[0,1,1],[1,0,1],[0,0,0]]；
     * 然后反转图片: [[1,0,0],[0,1,0],[1,1,1]]
     * 示例 2:
     * <p>
     * 输入: [[1,1,0,0],[1,0,0,1],[0,1,1,1],[1,0,1,0]]
     * 输出: [[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]]
     * 解释: 首先翻转每一行: [[0,0,1,1],[1,0,0,1],[1,1,1,0],[0,1,0,1]]；
     * 然后反转图片: [[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]]
     * 说明:
     * <p>
     * 1 <= A.length = A[0].length <= 20
     * 0 <= A[i][j] <= 1
     *
     * @param a
     */
    public static void main(String[] a) {
        int[][] ints = {{1, 1, 0, 0}, {1, 0, 0, 1}, {0, 1, 1, 1}, {1, 0, 1, 0}};

        int[][] ints1 = flipAndInvertImage(ints);
        println(ints1);
    }

    private static void println(int[][] ints1) {
        System.out.println("----");
        for (int[] ints2 : ints1) {
            for (int i = 0; i < ints2.length; i++) {
                System.out.print(ints2[i]);

            }
        }
    }

    public static int[][] flipAndInvertImage(int[][] A) {
        if (A == null) return null;
        for (int[] rows : A) {
            for (int i = 0, j = rows.length - 1; i < j; i++, j--) {
                int temp = rows[i];
                rows[i] = rows[j];
                rows[j] = temp;
            }

            for (int i = 0; i < rows.length; i++) {
                rows[i] = rows[i] ^ 1;
            }
        }
        return A;
    }

    /**
     * 更优解，少一次循环
     * @param A
     * @return
     */
    public static int[][] flipAndInvertImage2(int[][] A) {
        for (int[] row : A) {
            for (int i = 0, j = row.length - 1; i <= j; ++i, --j) {
                int t = row[i] ^ 1;
                row[i] = row[j] ^ 1;
                row[j] = t;
            }
        }
        return A;
    }

}
