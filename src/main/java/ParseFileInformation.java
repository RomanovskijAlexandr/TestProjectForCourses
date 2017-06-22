import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ParseFileInformation {
    public ArrayList<String> parseFile(String filePath){
        ArrayList<String> listOfURL = new ArrayList<String>();
        try ( BufferedReader in = new BufferedReader(new FileReader(filePath))){
            String s;
            int i=0;
            while ((s = in.readLine()) != null) {
                listOfURL.add(s);
            }
        } catch(IOException e) {
            throw new RuntimeException(e);
        }
        return listOfURL;
    }
}
