class BacklogRule extends EligibilityRule {

    @Override
    public String getRuleName() {
        return "Backlog Rule";
    }

    @Override
    public boolean check(Candidate candidate, Job job) {
        return candidate.getBacklogs() <= job.getMaximumBacklogs();
    }
}