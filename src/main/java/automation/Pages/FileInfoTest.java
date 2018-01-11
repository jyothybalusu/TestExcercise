package automation.Pages;


import org.apache.tika.Tika;

import java.io.File;
import java.io.IOException;

public class FileInfoTest {

    public static void main(String[] args)
    {
        String dirPath = "/Users/Aram/Desktop/Newfolder";
        File dir = new File(dirPath);
        File[] files = dir.listFiles();
        if (files == null || files.length == 0) {
                System.out.println("The directory is empty");
            } else {
                for (File aFile : files) {
                      System.out.format("%45s%16s%32s%32s\n",aFile.getName(), getExtensionOfFile(aFile), getFileSize(aFile), getMimeType(aFile));
                }
            }
        }

    public static String getMimeType(File file) {
        Tika tika = new Tika();
        String mimeType = null;
        try {
            mimeType = tika.detect(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return mimeType;
    }

    public static String getFileSize(File file){
            String fileLength = (double) file.length() / 1024 + "  kb";
            return fileLength;
        }

    public static String getExtensionOfFile(File file){

            String fileName = file.getName();
                String fileExtension = fileName.substring(fileName.lastIndexOf(".") + 1);
                return fileExtension;
            }
}

