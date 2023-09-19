import java.util.Scanner;

public class FeeReportApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FeeReport feeReport = new FeeReport();

        while (true) {
            System.out.println("Fee Report System");
            System.out.println("1. Add Fee Record");
            System.out.println("2. View Fee Records");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Student Name: ");
                    sc.nextLine(); // Consume the newline character
                    String studentName = sc.nextLine();
                    System.out.print("Enter Tuition Fee: $");
                    double tuitionFee = sc.nextDouble();
                    System.out.print("Enter Exam Fee: $");
                    double examFee = sc.nextDouble();
                    FeeRecord feeRecord = new FeeRecord(studentName, tuitionFee, examFee);
                    feeReport.addFeeRecord(feeRecord);
                    System.out.println("Fee Record added successfully.");
                    break;
                case 2:
                    System.out.println("Fee Records:");
                    for (FeeRecord record : feeReport.getFeeRecords()) {
                        System.out.println(record);
                        System.out.println();
                    }
                    break;
                case 3:
                    System.out.println("Exiting Fee Report System.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }
}

