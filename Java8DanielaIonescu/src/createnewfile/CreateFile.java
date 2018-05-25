package createnewfile;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/*
 

/**
 *
 * @author danie
 */
public class CreateFile {
    
    public static void main(String[] args) {
        try{
            // Create new file 
            String content = "Here is the content of the file created";
            String path="http:\\caleafisier.txt";
            File file = new File(path);

            // If file doesn't exists, then create it
            if (!file.exists()) {
                file.createNewFile();
            }

            FileWriter fw = new FileWriter(file.getAbsoluteFile());
            // Write in file
            try (BufferedWriter bw = new BufferedWriter(fw)) {
                // Write in file
                bw.write(content);
                // Close connection
            }
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
}
    
