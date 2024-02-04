import org.junit.Assert;
import org.junit.Test;

public class Ex13Tests {
    @Test
    public void anotherCase() {
        int[] arr1 = new int[]{1, 1, 1, 4, 5};
        int[] arr2 = new int[]{1, 1, 1, 4, 5};

        ;
        Assert.assertEquals(1, Ex13.findMedian(arr1, arr2));
    }

    @Test
    public void edgeCase() {
        int[] arr1 = new int[]{3, 4, 5, 6};
        int[] arr2 = new int[]{1, 2, 7, 8};

        ;
        Assert.assertEquals(4, Ex13.findMedian(arr1, arr2));
    }

    @Test
    public void edge2Case() {
        int[] arr1 = new int[]{4, 3};
        int[] arr2 = new int[]{2, 1};

        ;
        Assert.assertEquals(2, Ex13.findMedian(arr1, arr2));
    }


    @Test
    public void normalCase() {
        int[] arr1 = new int[]{1, 3, 5, 7};
        int[] arr2 = new int[]{2, 4, 6, 8};

        ;
        Assert.assertEquals(4, Ex13.findMedian(arr1, arr2));
    }

    @Test
    public void coolCase() {
        int[] arr1 = new int[]{1, 4};
        int[] arr2 = new int[]{2, 3};

        ;
        Assert.assertEquals(2, Ex13.findMedian(arr1, arr2));
    }

    @Test
    public void coolCase2() {
        int[] arr1 = new int[]{1, 1, 2, 2, 3, 3, 4, 4};
        int[] arr2 = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        ;
        Assert.assertEquals(3, Ex13.findMedian(arr1, arr2));
    }

    @Test
    public void e3_1() {
        Assert.assertEquals("ABB", Ex13.minimalSt("A", "BB"));
    }

    @Test
    public void e3_12() {
        Assert.assertEquals("BACB", Ex13.minimalSt("AC", "BAB"));
    }


    @Test
    public void e3_2() {
        Assert.assertEquals("AA", Ex13.minimalSt("AA", "A"));
    }

    @Test
    public void e3_3() {
        Assert.assertEquals("AGGXTXAYB", Ex13.minimalSt("AGGTAB", "GXTXAYB"));
    }
    @Test
    public void e3_31() {
        Assert.assertEquals("", Ex13.minimalSt("", ""));
    }


    @Test
    public void e3_311() {
        Assert.assertEquals("", Ex13.minimalSt("", ""));
    }

    @Test
    public void e3_312() {
        Assert.assertEquals("A", Ex13.minimalSt("A", ""));
    }

    @Test
    public void e3_32() {
        Assert.assertEquals("AA", Ex13.minimalSt("AA", ""));
    }

    @Test
    public void e3_33() {
        Assert.assertEquals("BB", Ex13.minimalSt("", "BB"));
    }

    @Test
    public void e3_34() {
        Assert.assertEquals("QWERTY", Ex13.minimalSt("QWE", "RTY"));
    }

//    @Test
//    public void e3_35() {
//        Assert.assertTrue(Ex13.includes("QWET", "QWETY"));
//        Assert.assertTrue(Ex13.includes("QWTY", "QWETY"));
//        Assert.assertEquals("QWETY", Ex13.minimalSt("QWET", "QWTY"));
//    }

    @Test
    public void e3_36() {
        Assert.assertEquals("ABC", Ex13.minimalSt("AB", "AC"));
    }


//    @Test
//    public void e3_3_include1() {
//        Assert.assertTrue(Ex13.includes("GXTXAYB", "AGXGTXAYB"));
//    }
//
//
//    @Test
//    public void e3_3_include2() {
//        Assert.assertTrue(Ex13.includes("AGGTAB", "AGXGTXAYB"));
//    }
//
//    @Test
//    public void e3_4_include() {
//        Assert.assertTrue(Ex13.includes("A", "AA"));
//    }
//
//    @Test
//    public void e3_45_include() {
//        Assert.assertFalse(Ex13.includes("AA", "A"));
//    }
//
//    @Test
//    public void e3_6_include() {
//        Assert.assertFalse(Ex13.includes("AB", "AA"));
//    }
//
//    @Test
//    public void e3_7_include() {
//        Assert.assertTrue(Ex13.includes("AABS", "ABABASC"));
//    }
//
//    @Test
//    public void e3_9() {
//        Assert.assertFalse(Ex13.includes("A", "B"));
//    }
//
//    {
//    }

    @Test
    public void e4_1() {
        int[][] tst = new int[][]{
                {2, 3, 4},
                {6, 5, 7}
        };

        Assert.assertEquals(Integer.MIN_VALUE, Ex13.maxSnake(tst));
    }


    @Test
    public void e4_2() {
        int[][] tst = new int[][]{
                {2}
        };

        Assert.assertEquals(1, Ex13.maxSnake(tst));
    }


    @Test
    public void e4_3() {
        int[][] tst = new int[][]{
                {2, 3, 4},
                {6, 5, 5},
                {7, 8, 9}
        };

        Assert.assertEquals(9, Ex13.maxSnake(tst));
    }

    @Test
    public void e4_4() {
        int[][] tst = new int[][]{
                {4, 5, 2, 3, 1},
                {3, 4, 1, 4, 4},
                {1, 5, 6, 7, 8},
                {3, 4, 5, 8, 9},
                {3, 2, 2, 7, 6}
        };

        Assert.assertEquals(13, Ex13.maxSnake(tst));
    }

    @Test
    public void e4_5() {
        int[][] tst = new int[][]{
                {4, 5, 2, 3, 1},
                {3, 4, 1, 4, 4},
                {1, 5, 6, 7, 8},
                {3, 4, 5, 7, 9},
                {3, 2, 2, 7, 8}
        };

        Assert.assertEquals(11, Ex13.maxSnake(tst));
    }

    @Test
    public void e4_6() {
        int[][] tst = new int[][]{
                {1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1}
        };

        Assert.assertEquals(25, Ex13.maxSnake(tst));
    }

    @Test
    public void e4_62() {
        int[][] tst = new int[][]{
                {1, 1},
                {1, 1},
        };

        Assert.assertEquals(3, Ex13.maxSnake(tst));
    }


    @Test
    public void e4_7() {
        int[][] tst = new int[][]{};

        Assert.assertEquals(0, Ex13.maxSnake(tst));
    }


    @Test
    public void e4_8() {
        int[][] tst = new int[][]{
                {1},
                {1},
                {1},
                {1},
                {1},
                {1},
        };

        Assert.assertEquals(6, Ex13.maxSnake(tst));
    }


    @Test
    public void e4_9() {
        int[][] tst = new int[][]{
                {1, 2, 3, 4, 5, 6},
        };

        Assert.assertEquals(6, Ex13.maxSnake(tst));
    }

    @Test
    public void e4_10() {
        int[][] tst = new int[][]{
                {1, 2, 3, 5, 5, 6},
        };

        Assert.assertEquals(Integer.MIN_VALUE, Ex13.maxSnake(tst));
    }

    static void print(int[][] mat) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                System.out.print(mat[i][j] + ",");
            }
            System.out.println();
        }
    }

    static void print2(String[] mat) {
        for (int i = 0; i < mat.length; i++) {
            System.out.print(mat[i] + ",");
        }
        System.out.println();
    }
}