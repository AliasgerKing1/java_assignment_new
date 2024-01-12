package assignment18;

class MarksOutOfBoundException extends Exception {
    public MarksOutOfBoundException(String message) {
        super(message);
    }
}

public class assignment18 {
    private int marks;

    public void setMarks(int marks) throws MarksOutOfBoundException {
        if (marks < 0 || marks > 100) {
            throw new MarksOutOfBoundException("Marks should be between 0 and 100.");
        }
        this.marks = marks;
    }

    public int getMarks() {
        return marks;
    }

    public static void main(String[] args) {
        assignment18 student = new assignment18();

        try {
            // Set marks, and it may throw MarksOutOfBoundException
            student.setMarks(105);
            System.out.println("Marks set successfully: " + student.getMarks());
        } catch (MarksOutOfBoundException e) {
            System.err.println("Exception: " + e.getMessage());
        }
    }
}
