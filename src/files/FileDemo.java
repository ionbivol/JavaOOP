package files;

import java.io.*;

public class FileDemo {
    public static void main(String[] args) throws IOException {

      File file = new File("C:\\Users\\Ion\\IdeaProjects\\test\\myFile2.txt");

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file))) {
            String fileLine = "Hello, my name is John, \nhere i'm trying to write some contend";
            bufferedWriter.write(fileLine);
        }

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            String fileLine;
            while ((fileLine = bufferedReader.readLine()) != null) {
                System.out.println(fileLine);
            }
        }

        

    }

}
