// import statements
import java.util.Scanner;
import java.util.PriorityQueue;
import java.lang.Integer;
import java.io.File;
import java.io.FileNotFoundException;
public class PriorityQueueLab {
  public static void main(String[] args){
  try{
      File f = new File("/workspaces/priority-queue-lab-akislenkova/RandIntegers2.txt");
    Scanner scan = new Scanner(f);
    PriorityQueue<Integer> queue = new PriorityQueue<>();
    while(scan.hasNextLine()){
      String a = scan.nextLine();
      int b = Integer.parseInt(a);
      queue.add(b);
    }
    System.out.println(queue);
    scan.close();
    } catch (Exception FileNotFoundException) {
      System.out.println("The file was not found.");
    }
  }
}

