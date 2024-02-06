import org.junit.Assert;
import org.junit.Test;

public class IntListTwoTests {

    @Test
    public void e3_1() {
        IntListTwo lst = new IntListTwo();
        lst.addToEnd(1);
        lst.addToEnd(2);
        lst.addToEnd(3);

        // As far as I understand, head is on the right side, tail is on the left
        // tail is the "end"
        // next is going right
        // prev is going left
        Assert.assertEquals(1, lst._head.getNum());
        Assert.assertEquals(2, lst._head.getNext().getNum());
        Assert.assertEquals(2, lst._tail.getPrev().getNum());
        Assert.assertEquals(3, lst._tail.getNum());
        Assert.assertNull(lst._head.getPrev());
        Assert.assertNull(lst._tail.getNext());

        lst.addToEnd(4);
        Assert.assertEquals(4, lst._tail.getNum());
    }

    @Test
    public void e3_15() {
        IntListTwo lst = new IntListTwo();

        Assert.assertEquals(null, lst._head);
        Assert.assertEquals(null, lst._tail);

        lst.addToEnd(2);

        Assert.assertEquals(2, lst._head.getNum());
        Assert.assertEquals(2, lst._tail.getNum());
    }

    @Test
    public void e3_2() {
        IntListTwo lst = new IntListTwo();
        lst.addToEnd(5);
        lst.addToEnd(4);
        lst.addToEnd(6);
        lst.addToEnd(2);
        lst.addToEnd(9);
        lst.addToEnd(7);
        lst.addToEnd(8);

        String expected = "{5, 4, 6, 2, 9, 7, 8}";
        Assert.assertEquals(expected, lst.toString());
    }

    @Test
    public void e3_3() {
        IntListTwo lst = new IntListTwo();

        String expected = "{}";
        Assert.assertEquals(expected, lst.toString());
    }

    @Test
    public void e3_4() {
        IntListTwo lst = new IntListTwo();
        lst.addToEnd(3);

        String expected = "{3}";
        Assert.assertEquals(expected, lst.toString());
    }

    @Test
    public void e3_5() {
        IntListTwo lst = new IntListTwo();
        lst.addToEnd(5);
        lst.addToEnd(4);
        lst.addToEnd(6);
        lst.addToEnd(2);
        lst.addToEnd(9);
        lst.addToEnd(7);
        lst.addToEnd(8);

        String expected = "{8, 7, 9, 2, 6, 4, 5}";
        Assert.assertEquals(expected, lst.toStringReverse());
    }

    @Test
    public void e3_6() {
        IntListTwo lst = new IntListTwo();

        String expected = "{}";
        Assert.assertEquals(expected, lst.toStringReverse());
    }

    @Test
    public void e3_7() {
        IntListTwo lst = new IntListTwo();
        lst.addToEnd(3);

        String expected = "{3}";
        Assert.assertEquals(expected, lst.toStringReverse());
    }

    @Test
    public void e4_1() {
        IntListTwo lst = new IntListTwo();
        lst.addToEnd(1);
        lst.addToEnd(1);
        lst.addToEnd(1);

        System.out.println(lst);
        Assert.assertTrue(lst.isWay());
    }


    @Test
    public void e4_2() {
        IntListTwo lst = new IntListTwo();
        lst.addToEnd(1);
        lst.addToEnd(2);
        lst.addToEnd(1);

        System.out.println(lst);
        Assert.assertFalse(lst.isWay());
    }

    @Test
    public void e4_3() {
        IntListTwo lst = new IntListTwo();
        lst.addToEnd(2);
        lst.addToEnd(4);
        lst.addToEnd(1);
        lst.addToEnd(6);
        lst.addToEnd(4);
        lst.addToEnd(2);
        lst.addToEnd(4);
        lst.addToEnd(3);
        lst.addToEnd(5);

        System.out.println(lst);
        Assert.assertTrue(lst.isWay());
    }

    @Test
    public void e4_4() {
        IntListTwo lst = new IntListTwo();
        lst.addToEnd(1);
        lst.addToEnd(4);
        lst.addToEnd(3);
        lst.addToEnd(1);
        lst.addToEnd(2);
        lst.addToEnd(4);
        lst.addToEnd(3);

        System.out.println(lst);
        Assert.assertFalse(lst.isWay());
    }

    @Test
    public void e4_5() {
        IntListTwo lst = new IntListTwo();

        System.out.println(lst);
        Assert.assertFalse(lst.isWay());
    }

    @Test
    public void e4_6() {
        IntListTwo lst = new IntListTwo();
        lst.addToEnd(3);

        System.out.println(lst);
        Assert.assertTrue(lst.isWay());
    }

    @Test
    public void e4_7() {
        IntListTwo lst = new IntListTwo();
        lst.addToEnd(1);

        System.out.println(lst);
        Assert.assertTrue(lst.isWay());
    }

    @Test
    public void e4_8() {
        IntListTwo lst = new IntListTwo();
        lst.addToEnd(2);
        lst.addToEnd(1);
        lst.addToEnd(2);
        lst.addToEnd(1);

        System.out.println(lst);
        Assert.assertFalse(lst.isWay());
    }

    @Test
    public void e4_9() {
        IntListTwo lst = new IntListTwo();
        lst.addToEnd(2);
        lst.addToEnd(1);
        lst.addToEnd(1);
        lst.addToEnd(1);

        System.out.println(lst);
        Assert.assertTrue(lst.isWay());
    }

    @Test
    public void e4_10() {
        IntListTwo lst = new IntListTwo();
        lst.addToEnd(2);
        lst.addToEnd(2);
        lst.addToEnd(2);
        lst.addToEnd(2);

        System.out.println(lst);
        Assert.assertFalse(lst.isWay());
    }

    @Test
    public void e4_11() {
        IntListTwo lst = new IntListTwo();
        lst.addToEnd(3);
        lst.addToEnd(2);
        lst.addToEnd(2);
        lst.addToEnd(2);

        System.out.println(lst);
        Assert.assertTrue(lst.isWay());
    }

    @Test
    public void e4_12() {
        IntListTwo lst = new IntListTwo();
        lst.addToEnd(3);
        lst.addToEnd(3);
        lst.addToEnd(3);
        lst.addToEnd(3);
        lst.addToEnd(3);

        System.out.println(lst);
        Assert.assertFalse(lst.isWay());
    }

    @Test
    public void e4_13() {
        IntListTwo lst = new IntListTwo();
        lst.addToEnd(1);
        lst.addToEnd(2);
        lst.addToEnd(2);
        lst.addToEnd(3);
        lst.addToEnd(3);

        System.out.println(lst);
        Assert.assertFalse(lst.isWay());
    }
}