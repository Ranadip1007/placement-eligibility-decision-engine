class GraduationYearRule extends EligibilityRule {

    @Override
    public String getRuleName() {
        return "Graduation Year Rule";
    }

    @Override
    public boolean check(Candidate candidate, Job job) {
        return candidate.getGraduationYear() >= job.getRequiredGraduationYear();
    }
}