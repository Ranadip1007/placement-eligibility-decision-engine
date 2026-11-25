
public class Candidate {
    private String name;
    private double percentage;
    private int backlogs;
    private int graduateYear;

    public Candidate(
            String name,
            double percentage,
            int backlogs,
            int graduateYear) {
        this.name = name;
        this.percentage = percentage;
        this.backlogs = backlogs;
        this.graduateYear = graduateYear;
    }

    public String getName() {
        return name;
    }

    public double getPercentage() {
        return percentage;
    }

    public int getBacklogs() {
        return  backlogs;
    }

    public  int getGraduationYear() {
        return graduateYear;
    }
}
