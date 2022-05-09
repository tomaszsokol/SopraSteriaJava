import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class filereadTest {

    @Test
    public void reader() {

        //This is a unit test of the program

        String path_read =  "Data\\ItemTest.csv";
        String path2_read = "Data\\ItemTest2.csv";

        List<Integer> list;
        fileread fr = new fileread();
        list = fr.reader(path_read, path2_read);

        List<Integer> results = new ArrayList<>();
        results.add(17);
        results.add(17);
        results.add(0);


        for(int i = 0; i < list.size(); i++){
            int test = list.get(i);
            int result = results.get(i);

            assertEquals(result, test);

        }



    }
}