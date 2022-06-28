package session2;
public class Student {

    private String name;
    private String javaLevel;

    public String getName() {
        return name;
    }

    public void setName (String studentName) {
        this.name = studentName;
    }

    public String getJavaLevel() {
        return javaLevel;
    }

    public void setJavaLevel(String JavaLevel) {
        this.javaLevel = JavaLevel;
    }

    public void printDetails() {
        System.out.println(name + " Java skills level is " + javaLevel);
    }
}
