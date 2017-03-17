import java.io.*;
import java.util.Scanner;


public class Actions {
    
    public static String fileName = "";
    
    // create constructor method
    public Actions(String arg) {
        
        fileName = arg;
        
    }
    
    public static void list() {
        
        try {
        File dir = new File(fileName);
        
        if (dir.exists()) {
            String[] files = dir.list();
            System.out.println(files.length + " file(s) were found.");
            for (int i = 0 ; i < files.length ; i++ ) {
            System.out.println(files[i]);
            }
            
        } else {
            System.out.println("Directory not found!");
        }
        
        } catch (Exception e) {
            
            System.out.println(e);
        
        }  
    }
    
    public static void read() {
        
        try {
        FileReader rf = new FileReader(fileName);
        BufferedReader buffer = new BufferedReader(rf);
        
        String txt = "";
        
        while ((txt = buffer.readLine()) != null) {
            System.out.println(txt);
        }
        buffer.close();
        
    } catch (Exception e) {
        
        System.out.println(e);
        
    }
    }
    
    public static void write() {
        
       try {
       String data = "";
       
       System.out.print("Enter text to be written to file: ");
       Scanner input = new Scanner(System.in);
       data = input.nextLine();
       
       FileWriter wf = new FileWriter(fileName);
       BufferedWriter buffer = new BufferedWriter(wf);
       buffer.write(data);
       
       buffer.close();
        
    } catch (Exception e) {
        
    System.out.println(e);
    
        }
    
    }
}
