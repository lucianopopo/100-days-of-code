package thirty.days.of.code;

import java.util.Scanner;

public class Day04ClassVsInstance {
	private int age;	
	  
	public Day04ClassVsInstance(int initialAge) {
  		// Add some more code to run some checks on initialAge
          this.age = initialAge;
	}

	public void amIOld() {
  		// Write code determining if this person's age is old and print the correct statement:
        String msg = "";
        if(age < 0){
            msg = "Age is not valid, setting age to 0.";
            age = 0;
        }else if(age < 13) {
            msg = "You are young.";
        }else if(age >= 13 && age < 18) {
            msg = "You are a teenager.";
        } else {
            msg = "You are old.";
        }
        System.out.println(msg);
        if(age <= 0){
           System.out.println("You are young.");
        }
	}

	public void yearPasses() {
  		age += 1;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			int age = sc.nextInt();
			Day04ClassVsInstance p = new Day04ClassVsInstance(age);
			p.amIOld();
			for (int j = 0; j < 3; j++) {
				p.yearPasses();
			}
			p.amIOld();
			System.out.println();
        }
		sc.close();
    }
}
