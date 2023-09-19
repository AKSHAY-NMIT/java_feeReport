public class FeeRecord {
    private String studentName;
    private double tuitionFee;
    private double examFee;

    public FeeRecord(String studentName, double tuitionFee, double examFee) {
        this.studentName = studentName;
        this.tuitionFee = tuitionFee;
        this.examFee = examFee;
    }

    public String getStudentName() {
        return studentName;
    }

    public double getTuitionFee() {
        return tuitionFee;
    }

    public double getExamFee() {
        return examFee;
    }

    public double getTotalFee() {
        return tuitionFee + examFee;
    }

    @Override
    public String toString() {
        return "Student Name: " + studentName +
               "\nTuition Fee: $" + tuitionFee +
               "\nExam Fee: $" + examFee +
               "\nTotal Fee: $" + getTotalFee();
    }
}
