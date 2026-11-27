public class EligibilityChecker {
    EligibilityRule rules[] = { new PercentageRule(), new BacklogRule(), new GraduationYearRule(), new SkillRule() };

    public boolean check(Candidate candidate, Job job) {
        boolean eligible = true;

        for (int i = 0; i < rules.length; i++) {
            boolean pass = rules[i].check(candidate, job);
            if (pass) {
                System.out.println(rules[i].getRuleName() + " : PASS");
            } else {
                System.out.println(rules[i].getRuleName() + " : FAIL");
                eligible = false;
            }
        }
        return eligible;
    }
}
