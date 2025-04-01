public class Student {

    private String name; // variable for the name
    private double grade; // variable for the grade

    // Getter - name
    public String getName() {
        return name;
    }

    // Getter - grade
    public double getGrade() {
        return grade;
    }

    // Setter - name
    public void setName(String newName) {
        this.name = newName;
    }

    //Setter - grade
    public void setGrade(double newGrade) {
        if (newGrade >= 0 && newGrade <= 100) {
            this.grade = newGrade;
        } else {
            this.grade = 0;
        }
    }

    public static void main(String[] args) {
        Student myObj = new Student(); // create object

        myObj.setName("Abdimalik Haroon"); // set student name
        myObj.setGrade(80.2); // set student grade

        // Print values
        System.out.println("Name: " + myObj.getName());
        System.out.println("Grade: " + myObj.getGrade());
    }
}