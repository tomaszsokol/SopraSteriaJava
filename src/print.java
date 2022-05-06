import javax.swing.*;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class print {

    static void print(int supply, int buy, int result){
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
