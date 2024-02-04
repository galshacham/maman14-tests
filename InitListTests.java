import org.junit.Assert;
import org.junit.Test;


public class InitListTests {
    @Test
    public void one_1() {
        IntList lst = new IntList();
        lst.addToEnd(1);
        lst.addToEnd(2);
        lst.addToEnd(3);
        lst.addToEnd(4);
        lst.addToEnd(5);

        Assert.assertTrue(lst.subListSum(10));
        Assert.assertTrue(lst.subListSum(6));
        Assert.assertTrue(lst.subListSum(9));
        Assert.assertTrue(lst.subListSum(10));
        Assert.assertTrue(lst.subListSum(4));
    }

    @Test
    public void one_2() {
        IntList lst = new IntList();

        Assert.assertFalse(lst.subListSum(4));
    }


    @Test
    public void one_3() {
        IntList lst = new IntList();
        lst.addToEnd(1);
        lst.addToEnd(4);
        lst.addToEnd(2);

        Assert.assertFalse(lst.subListSum(3));
    }

    @Test
    public void one_4() {
        IntList lst = new IntList();
        lst.addToEnd(1);
        lst.addToEnd(1);
        lst.addToEnd(1);
        lst.addToEnd(1);
        lst.addToEnd(1);
        lst.addToEnd(1);
        lst.addToEnd(1);
        lst.addToEnd(1);
        lst.addToEnd(20);
        lst.addToEnd(1);
        lst.addToEnd(40);


        Assert.assertTrue(lst.subListSum(1));
        Assert.assertTrue(lst.subListSum(2));
        Assert.assertTrue(lst.subListSum(3));
        Assert.assertTrue(lst.subListSum(7));
        Assert.assertTrue(lst.subListSum(21));
        Assert.assertTrue(lst.subListSum(62));
        Assert.assertFalse(lst.subListSum(72));
    }

    @Test
    public void one_5() {
        IntList lst = new IntList();
        lst.addToEnd(20);
        lst.addToEnd(40);
        lst.addToEnd(40);
        lst.addToEnd(40);
        lst.addToEnd(40);
        lst.addToEnd(40);
        lst.addToEnd(40);
        lst.addToEnd(40);
        lst.addToEnd(40);


        Assert.assertFalse(lst.subListSum(19));
        Assert.assertFalse(lst.subListSum(39));
        Assert.assertFalse(lst.subListSum(49));
        Assert.assertFalse(lst.subListSum(50));
        Assert.assertFalse(lst.subListSum(70));
        Assert.assertFalse(lst.subListSum(90));
    }

    @Test
    public void one_7() {
        IntList lst = new IntList();
        lst.addToEnd(5);
        lst.addToEnd(4);
        lst.addToEnd(3);
        lst.addToEnd(2);
        lst.addToEnd(1);

        Assert.assertFalse(lst.subListSum(11));
        Assert.assertFalse(lst.subListSum(13));
        Assert.assertTrue(lst.subListSum(15));
        Assert.assertTrue(lst.subListSum(3));
        Assert.assertTrue(lst.subListSum(6));
        Assert.assertTrue(lst.subListSum(7));
    }

    @Test
    public void two_1() {
        IntList lst = new IntList();
        lst.addToEnd(5);
        lst.addToEnd(7);
        lst.addToEnd(-2);
        lst.addToEnd(10);

        Assert.assertEquals(-2, lst.averageNode().getValue());
    }

    @Test
    public void two_2() {
        IntList lst = new IntList();
        lst.addToEnd(1);
        lst.addToEnd(0);
        lst.addToEnd(0);
        lst.addToEnd(0);
        lst.addToEnd(1);


        Assert.assertEquals(lst.averageNode().getValue(), 0);
//        Assert.assertNotEquals(lst._head, lst.averageNode());
    }

    @Test
    public void two_3() {
        IntList lst = new IntList();
        lst.addToEnd(2);


        Assert.assertEquals(lst.averageNode(), null);
    }

    @Test
    public void two_4() {
        IntList lst = new IntList();
        lst.addToEnd(3);
        lst.addToEnd(7);

        Assert.assertEquals(lst.averageNode().getValue(), 3);
    }

    @Test
    public void two_5() {
        IntList lst = new IntList();
        lst.addToEnd(1);
        lst.addToEnd(2);
        lst.addToEnd(3);
        lst.addToEnd(4);
        lst.addToEnd(5);


        Assert.assertEquals(lst.averageNode().getValue(), 4);
    }

    @Test
    public void two_6() {
        IntList lst = new IntList();
        lst.addToEnd(5);
        lst.addToEnd(5);
        lst.addToEnd(5);
        lst.addToEnd(5);
        lst.addToEnd(5);
        lst.addToEnd(5);


        Assert.assertEquals(lst.averageNode().getValue(), 5);
//        Assert.assertEquals(lst.averageNode(), lst._head.getNext().getNext().getNext().getNext());
    }

    @Test
    public void two_7() {
        IntList lst = new IntList();
        lst.addToEnd(5);
        lst.addToEnd(-5);
        lst.addToEnd(1);
        lst.addToEnd(-1);


        Assert.assertEquals(5, lst.averageNode().getValue());
    }

    @Test
    public void two_8() {
        IntList lst = new IntList();
        lst.addToEnd(5);
        lst.addToEnd(20);
        lst.addToEnd(-20);


        Assert.assertEquals(20, lst.averageNode().getValue());
    }
}