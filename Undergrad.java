public class Undergrad extends Student {
    private String year;

    public Undergrad(int id, String name, double gpa, String year) {
        super(id, name, gpa);
        this.year = year;
    }

    @Override
    public String toString() {
        return "Undergrad [year=" + year + "] Student [id=" + id + ", name=" + name + ", gpa=" + gpa + "]";
    }

}
