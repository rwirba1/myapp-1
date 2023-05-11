import java.util.ArrayList;
import java.util.Scanner;

public class DevOpsToolList {
  
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    // Display welcome message and student photo
    System.out.println("WELCOME TO M.I TECH LLS");
    System.out.println(" _____________________");
    System.out.println("|                     |");
    System.out.println("|      /\\___/\\       |");
    System.out.println("|     ( o   o )      |");
    System.out.println("|      (  =^=  )      |");
    System.out.println("|       (")")_("")")       |");
    System.out.println("|                     |");
    System.out.println("|_____________________|");
    
    // Create a list of DevOps tools
    ArrayList<String> devOpsTools = new ArrayList<String>();
    devOpsTools.add("Jenkins");
    devOpsTools.add("Git");
    devOpsTools.add("Docker");
    devOpsTools.add("Kubernetes");
    devOpsTools.add("Ansible");
    
    // Prompt the user to sign in
    System.out.println("\nPlease sign in to view the DevOps tool list:");
    System.out.print("Username: ");
    String username = scanner.nextLine();
    System.out.print("Password: ");
    String password = scanner.nextLine();
    
    // Check the credentials and display the DevOps tool list if successful
    if (username.equals("student") && password.equals("password")) {
      System.out.println("\nWelcome, " + username + "!");
      System.out.println("Here is the list of DevOps tools:");
      for (String tool : devOpsTools) {
        System.out.println("- " + tool);
      }
    } else {
      System.out.println("\nInvalid username or password. Please try again.");
    }
    
    scanner.close();
  }
}
