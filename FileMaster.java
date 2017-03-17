package filemaster;


public class FileMaster {


    public static void main(String[] args) {
        
        try {
            
            if (args.length==0) {
                
                System.out.println("You did not enter any arguments.");
                System.out.println("Please enter a file or directory name");
                System.out.println("and an option(-ls, -rf, or -wf).");
                
            } else if (args.length==1) {
                
                System.out.println("Please enter a second option:");
                System.out.println("-ls to list directory contents");
                System.out.println("-rf to read a file");
                System.out.println("-wf to create a new file");
                
            }
            
            if (args[1].equals("-ls")) {
                
                Actions lister = new Actions(args[0]);
                lister.list();
                
            } else if (args[1].equals("-rf")) {
                
                Actions reader = new Actions(args[0]);
                reader.read();
                
            } else if (args[1].equals("-wf")) {
                
               Actions writer = new Actions(args[0]);
               writer.write();
            
            }
        } catch (Exception e) {
            //Do nothing
        }
        
    }
    
}
