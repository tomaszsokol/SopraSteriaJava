import javax.swing.*;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class main {

    public static void main(String[] args)  {
        String path_read = "C:\\Users\\Tomasz Sokół\\Desktop\\Sopra-Steria_File_Handling\\ItemX.csv";
        String path2_read = "C:\\Users\\Tomasz Sokół\\Desktop\\Sopra-Steria_File_Handling\\ItemY.csv";
        String line;
        int supply = 0;
        int buy = 0;
        int result;

        List<String> list = new ArrayList<>();
        list.add(path_read);
        list.add(path2_read);

        //System.out.println(list.get(0));

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

        }
        result = supply - buy;

        PrintWriter pw;
        try {
            pw = new PrintWriter ("Report.csv");

            String csvData = "" + "Supply" + ',' + supply + '\n' +
                    "Buy" + ',' + buy + '\n' + "Result" + ',' + result;
            pw.write(csvData);
            pw.close();

            JOptionPane.showMessageDialog(null,"Report saved");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}