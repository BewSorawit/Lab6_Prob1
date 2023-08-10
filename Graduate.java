public class Graduate extends Student {
    private String thesisTitle;

    public Graduate(int id, String name, double gpa, String thesisTitle) {
        super(id, name, gpa);
        this.thesisTitle = thesisTitle;
    }

    @Override
    public String toString() {
        return "Graduate [thesisTitle=" + thesisTitle + "] Student [id=" + id + ", name=" + name + ", gpa=" + gpa + "]";
    }

}
