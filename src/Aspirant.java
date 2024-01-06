public class Aspirant extends Student {
    private String scientificWork;

    public Aspirant(String firstName, String lastName, String group, double averageMark, String scientificWork) {
        super(firstName, lastName, group, averageMark);
        this.scientificWork = scientificWork;
    }


    public double getScholarship() {
        if (averageMark == 5) {
            return 200;
        } else {
            return 180;
        }
    }
}
