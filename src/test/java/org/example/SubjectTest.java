package org.example;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertNotNull;

import org.junit.BeforeClass;
import org.junit.Test;

public class SubjectTest {

    private static Subject subject;

    @BeforeClass
    public static void setUp() {
        System.out.println("***Setting up class SubjectTest");
        subject = new Subject();
        subject.attach(new Observer1("Dr. Gumbo"));
        subject.setState(41, 7);
    }

    @Test
    public void testAttach() {
        System.out.println("***Testing attach");
        assertTrue(subject.attach(new Observer1("Mrs. Hurricane")));
    }

    @Test
    public void testDetach() {
        System.out.println("***Testing detach");
        Observer1 observer = new Observer1("Mr. Muffuletta");
        subject.attach(observer);
        assertNotNull(subject.detach(observer));
    }

    @Test
    public void testNotify() {
        System.out.println("***Testing Notify");
        subject.setState(41, 7);
    }

    @Test
    public void testSetState() {
        System.out.println("***Testing setState");
        subject.setState(0, 0);
    }
}
