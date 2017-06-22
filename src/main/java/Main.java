
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        String fileUrl = in.nextLine();
        String saveDir = in.nextLine();
        String pathOfFile = in.nextLine();

        DownloadWithHttp downloadWithHttp = new DownloadWithHttp();
        downloadWithHttp.downloadFile(fileUrl,saveDir);

        ParseFileInformation parseFileInformation = new ParseFileInformation();
        ArrayList<String> listURL = parseFileInformation.parseFile(pathOfFile);
        for (int i=0; i<listURL.size(); i++){
            downloadWithHttp.downloadFile(listURL.get(i), saveDir);
        }
    }
}
