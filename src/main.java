import java.util.List;

public class main {

    public static void main(String[] args)  {
        String path_read = "C:\\Users\\Tomasz Sokół\\Desktop\\Sopra-Steria_File_Handling\\ItemX.csv";
        String path2_read = "C:\\Users\\Tomasz Sokół\\Desktop\\Sopra-Steria_File_Handling\\ItemY.csv";


        List<Integer> result;
        fileread fr = new fileread();
        result = fr.fileread(path_read, path2_read);

        print pr = new print();
        pr.print(result);

    }
}