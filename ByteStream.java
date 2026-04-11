import java.io.*;

class ByteStream {
    public static void main(String[] args) {
        try {
            File file = new File("input.txt");
            if (!file.exists()) {
                file.createNewFile();
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists");
            }

            FileOutputStream fos = new FileOutputStream(file);
            String data = "Hello Anshul!\nWelcome to Java File Handling.";

            fos.write(data.getBytes());
            fos.close();

            System.out.println("Data written successfully");

            FileInputStream fis = new FileInputStream(file);
            int ch;

            System.out.println("\nFile Content:");
            while ((ch = fis.read()) != -1) {
                System.out.print((char) ch);
            }

            fis.close();

        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}