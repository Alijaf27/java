
public class Main {
    public static void main(String[] args) throws Exception {
        float grade;
        char letter = 'A';
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input a grade between 0 and 100");
        grade = scanner.nextFloat();
        while (grade < 0 || grade > 100) {
            System.out.println("Grade must be between 0 and 100. Please input again");
            grade = scanner.nextFloat();
        }
        scanner.close();
        
        // Convert grade to letter
        if (grade >= 90 && grade <= 100) {
            letter = 'A';
        } else if (grade >= 80) { // Implicitly, this is grade < 90 due to the previous condition
            letter = 'B';
        } else if (grade >= 70) { // Implicitly, this is grade < 80
            letter = 'C';
        } else if (grade >= 60) { // Implicitly, this is grade < 70
            letter = 'D';
        } else { // This covers the case where grade < 60
            letter = 'F';
        }

        System.out.println("Grade = " + grade);
        System.out.println("Letter = " + letter);  
    }
}
