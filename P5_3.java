import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class P5_3 {


        public static void main(String[] args) throws IOException
        {
            // creating a file
            File f1 = new File("/Users/PrinceUpadhyay/Documents/java/Practical_5/Practical_5_3.txt");
            f1.createNewFile();

            // creating an object for reading and writing the file
            FileInputStream input = new FileInputStream("/Users/PrinceUpadhyay/Documents/java/Practical_5/Practical_5_3.txt");
            FileOutputStream output = new FileOutputStream("/Users/PrinceUpadhyay/Documents/java/Practical_5/copy.txt");

            int temp;

            // copying from first file and writing in another file
            while((temp = input.read()) != -1)
            {
                output.write((char) temp);
            }

            // closing both the files
            output.close();
            input.close();
            System.out.println("This program is created by 21ce148_Prince");

        }
    }



