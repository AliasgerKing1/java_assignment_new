import java.io.*;
import java.util.Scanner;

class Runner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		String new_path = "D:/java/";
        while (true) {
            System.out.print("Welcome to Aliasger Terminal: \n");
            System.out.print("Enter Command: \n");
            String user_input = sc.nextLine();
            String[] jv_command = user_input.split(" ");
            if (jv_command.length > 0 && jv_command[0].equalsIgnoreCase("jv")) {
                String create_keyword = jv_command[1];
                String file_name = jv_command[2];
                if(create_keyword.trim().equalsIgnoreCase("create")) {
                    File dir = new File(new_path + file_name);
                if (!dir.exists()){
                    dir.mkdir();
                }
                try {
    FileWriter myWriter = new FileWriter(new_path + file_name + "/" + file_name + ".java");
    String code = String.format("""
        package %s;

        import java.util.Scanner;

        public class %s {
            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.println("Process happening in child program '%s'");
                System.out.print("Enter Number: ");
            }
        }""", file_name, file_name, file_name);
    myWriter.write(code);
    myWriter.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
                }
                else if(create_keyword.trim().equalsIgnoreCase("chng")){
                    new_path = jv_command[2];
                    try {
                    // Specify the Python interpreter and the Python script file
                    String pythonScript = "D:\\java\\source_changer.py";

                    // Provide the value as a command-line argument to the Python script
                    String valueToPass = new_path;
                    
                    // Build the command to execute
                    ProcessBuilder pb = new ProcessBuilder("python", pythonScript, valueToPass);
                    pb.inheritIO();  // inherit the terminal for input and output

                    // Start the process
                    Process pr = pb.start();

                    // Wait for the process to finish
                    pr.waitFor();
                } catch (IOException | InterruptedException e) {
                    e.printStackTrace();
                }
                        System.out.println("New Path set Successfully");
                } else {
                    String ec_keyword = jv_command[1];
                    if(ec_keyword.trim().equalsIgnoreCase("ec")) {

                       try {
    ProcessBuilder pb = new ProcessBuilder("javac", file_name + "/" + file_name + ".java");
    Process pr = pb.start();
    pr.waitFor();  // wait for the compilation process to complete

    pb = new ProcessBuilder("java", file_name + "/" + file_name);
    pb.inheritIO();  // inherit the terminal for input and output
    Process pr2 = pb.start();
    pr2.waitFor();
} catch (IOException | InterruptedException e) {
    e.printStackTrace();
}
            }
                    else if(ec_keyword.trim().equalsIgnoreCase("ecr")) {
                        
                       try {
    ProcessBuilder pb = new ProcessBuilder("java", file_name + "/" + file_name);
    pb.inheritIO();  // inherit the terminal for input and output
    Process pr2 = pb.start();
    pr2.waitFor();
} catch (IOException | InterruptedException e) {
    e.printStackTrace();
}
                    }
        }
            }

        }
    }
}