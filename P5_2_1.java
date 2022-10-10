import java.io.*;
public class P5_2_1 {

        public static void main(String[] args) throws IOException
        {
            FileReader sourceStream = null;
            try
            {
                sourceStream = new FileReader("/Users/PrinceUpadhyay/Documents/java/Practical_5/character.txt");
                // reading from the file character by character
                int temp;
                while ((temp = sourceStream.read()) != -1)
                {
                    System.out.println((char)temp);
                }

            }
            finally
            {
                // closing stream
                if (sourceStream != null)
                {
                    sourceStream.close();
                }

            }
            System.out.println("This program is created by 21ce148_Prince");

        }
    }


