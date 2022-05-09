import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class fileread {

    static List reader(String path_read, String path2_read){

        String line;
        int supply = 0;
        int buy = 0;
        int result = 0;

        List<String> list = new ArrayList<>();
        list.add(path_read);
        list.add(path2_read);



        for (String i:list) {
            try {
                BufferedReader br = new BufferedReader(new FileReader(i));

                while((line = br.readLine()) != null) {
                    String[] values = line.split(",");
                    int val = Integer.parseInt(values[1]);
                    if(line.startsWith("supply")) {
                        supply = supply + val;
                    }
                    else {
                        buy = buy + val;
                    }
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
            result = supply - buy;
        }
        List<Integer> finallist = Arrays.asList(supply, buy, result);
        return finallist;
    }
}
