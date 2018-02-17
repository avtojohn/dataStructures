import linked_list.LinkedList;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class LinkedListTest {

    LinkedList<Integer> linkedList = new LinkedList<>();

    @Test
    public void TestPush(){
        int size = linkedList.size();
        linkedList.push(1);
        assertEquals(size+1,linkedList.size());
    }

}
