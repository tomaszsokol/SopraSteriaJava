import java.util.List;

public class main {

    public static void main(String[] args)  {

        //This program reads the data from .csv files, and creates a report of supplied/sold items in the shop.

        //To make program work,define string path_read and path_read2 with the path of the ItemX and ItemY files.
        String path_read = "";
        String path2_read = "";

        //This code reads files and makes calculations.
        List<Integer> result;
        fileread fr = new fileread();
        result = fr.reader(path_read, path2_read);

        //This code creates a CSV report.
        print pr = new print();
        pr.fileprint(result);

    }
}