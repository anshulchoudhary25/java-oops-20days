import java.io.*;

public class File_Handling{
    public static void main(String[] args) {
        try{
            FileWriter fw = new FileWriter("test.txt");
            fw.write("My name is Anshul Choudhary \nI'm studying file Handling in java \nthis is my 4th day of this streak");
            fw.close();

            FileReader fr = new FileReader("test.txt");
            int ch;
            while ((ch = fr.read()) != -1) {
                System.out.print((char)ch);         
            }
            fr.close();
        }
        catch(Exception e){
            System.out.println("Error "+e);
        }
    }
}