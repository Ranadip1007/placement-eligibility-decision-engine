
public class Candidate {
    private String name;
    private double percentage;
    private int backlogs;
    private int graduateYear;
    private String[] skills;

    public Candidate(
            String name,
            double percentage,
            int backlogs,
            int graduateYear,
            String[] skills) {
        this.name = name;
        this.percentage = percentage;
        this.backlogs = backlogs;
        this.graduateYear = graduateYear;
        this.skills = skills;
    }

    public String getName() {
        return name;
    }

    public double getPercentage() {
        return percentage;
    }

    public int getBacklogs() {
        return backlogs;
    }

    public int getGraduationYear() {
        return graduateYear;
    }

    public boolean hasSkill(String requiredSkill) {
        for (int i = 0; i < skills.length; i++) {
            if (skills[i].equalsIgnoreCase(requiredSkill)) {
                return true;
            }
        }
        return false;

    }
}
