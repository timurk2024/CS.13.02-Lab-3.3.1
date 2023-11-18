import static org.junit.jupiter.api.Assertions.*;

class CISQueueTest {

    private CISQueue cisQueue;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {

        cisQueue = new CISQueue();

    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {

        cisQueue = null;

    }

    @org.junit.jupiter.api.Test
    void enqueue() {

        assertEquals(0, cisQueue.size());
        cisQueue.enqueue(4);
        assertEquals(1, cisQueue.size());
        cisQueue.enqueue(19);
        assertEquals(2, cisQueue.size());
        cisQueue.enqueue(5);
        assertEquals(3, cisQueue.size());

    }

    @org.junit.jupiter.api.Test
    void dequeue() {

        assertEquals(null, cisQueue.dequeue());
        assertEquals(0, cisQueue.size());
        cisQueue.enqueue(4);
        assertEquals(1, cisQueue.size());
        assertEquals(4, cisQueue.dequeue());
        cisQueue.enqueue(7);
        assertEquals(1, cisQueue.size());
        assertEquals(7, cisQueue.dequeue());

    }

    @org.junit.jupiter.api.Test
    void isEmpty() {

        assertTrue(cisQueue.isEmpty());
        cisQueue.enqueue(4);
        assertFalse(cisQueue.isEmpty());
        cisQueue.dequeue();
        assertTrue(cisQueue.isEmpty());
        cisQueue.enqueue(19);
        assertFalse(cisQueue.isEmpty());
        cisQueue.dequeue();
        assertTrue(cisQueue.isEmpty());

    }

    @org.junit.jupiter.api.Test
    void testToString() {

        assertEquals("CISQueue{queue=[], size=0}", cisQueue.toString());
        cisQueue.enqueue(7);
        assertEquals("CISQueue{queue=[7], size=1}", cisQueue.toString());
        cisQueue.enqueue(11);
        assertEquals("CISQueue{queue=[7, 11], size=2}", cisQueue.toString());
        cisQueue.enqueue(23);
        assertEquals("CISQueue{queue=[7, 11, 23], size=3}", cisQueue.toString());

    }

}