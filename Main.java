import java.io.FileReader;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.ArrayList;

class Main {
	public static void main(String[] args) throws FileNotFoundException {

		ArrayList<String> arrayList = new ArrayList<>();
		FileReader fr = new FileReader("names.txt");
		Scanner fileScanner = new Scanner(fr);
    Scanner scanner = new Scanner(System.in);
    int input;

    loop:while(true){
      System.out.println("Press 1 to learn about about salary.");
      System.out.println("Press 2 to learn about about the job.");
      System.out.println("Press 3 to learn about about demand.");
      System.out.println("Press 4 to view current students.");
      System.out.println("Press 5 to quit.");

      input = scanner.nextInt();

      switch(input){
        case 1: 
          System.out.println("$98,345 average salary in South Florida!");
          break;
        case 2:
          System.out.println("US News - 100 Best Jobs!");
          break;
        case 3:
          System.out.println("Top 10 Forbes In-Demand Jobs!");
          break;
        case 4:
          System.out.println("Current Students:");
          while(fileScanner.hasNextLine()){
            String name = fileScanner.nextLine();
            arrayList.add(name);
          }
          for(String i : arrayList){
            System.out.println(i);
          }
          break;
        default:
        break loop;
      }
    }
	}
}