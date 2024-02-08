import org.example.Threading.MultiThread.ThreadJoin;
import org.example.Threading.ThreadCommunication.ThreadCommunicationExample;
import org.example.Threading.ThreadExample;
import org.example.Threading.ThreadGroup.ThreadGroupExample;
import org.example.Threading.ThreadSync.ThreadSyncExample;
import org.junit.Before;
import org.junit.Test;

public class TestThreadExample {

    ThreadExample threadExample;

    @Before
    public void setup(){
        threadExample = new ThreadExample();
    }

    @Test
    public void testSingleThread(){
        threadExample.executeSingleThread();
    }

    @Test
    public void testMultiThread0(){
        threadExample.executeMultiThread0();
    }

    @Test
    public void testMultiThread1(){
        threadExample.executeMultiThread1();
    }

    @Test
    public void testThreadGroup(){
        ThreadGroupExample threadGroupExample = new ThreadGroupExample();
        threadGroupExample.executeWithThreadGroup();
    }

    @Test
    public void testMultiThreadJoin(){
        ThreadJoin threadJoin = new ThreadJoin();
        threadJoin.exampleJoin();
    }

    @Test
    public void testSyncNoSync(){
        ThreadSyncExample threadSyncExample = new ThreadSyncExample();
        threadSyncExample.executeNoSync();
    }

    @Test
    public void testSyncSync(){
        ThreadSyncExample threadSyncExample = new ThreadSyncExample();
        threadSyncExample.executeSync();
    }

    @Test
    public void testInternalCommunication(){
        ThreadCommunicationExample threadCommunicationExample = new ThreadCommunicationExample();
        threadCommunicationExample.execute();
    }
}
