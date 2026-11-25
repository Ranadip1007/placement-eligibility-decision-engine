import java.util.*;

// public class Main {
//     public static void main(String[] args) {
    
//         Scanner scanner = new Scanner(System.in);

//         String name = scanner.next();
//         double percentage = scanner.nextDouble();
//         int backlogs = scanner.nextInt();
//         int graduateYear = scanner.nextInt();

//         System.out.println("Candidate: " + name);
//         System.out.println("Percentage: " + percentage);
//         System.out.println("Backlogs: " + backlogs);
//         System.out.println("Graduation Year: " + graduateYear);

//     }
// }

public class Main {
    public static void main(String[] args) {
    
        String name;
        double percentage;
        int backlogs;
        int graduateYear;

        try (Scanner scanner = new Scanner(System.in)) {
            name = scanner.next();
            percentage = scanner.nextDouble();
            backlogs = scanner.nextInt();
            graduateYear = scanner.nextInt();
        }

        Candidate candidate = new Candidate(name, percentage, backlogs, graduateYear);

        Job job = new Job("Infosys", "Java Developer", 65.0, 0, 2026);

        EligibilityChecker checker = new EligibilityChecker();

        System.out.println("===================================");
        System.out.println("PLACEMENT ELIGIBILITY RESULT");
        System.out.println("===================================");

        System.out.println();
        System.out.println("Candidate: " + candidate.getName());
        System.out.println("Company: " + job.getCompany());
        System.out.println("Role: " + job.getRole());

        
        // PercentageRule percentageRule = new PercentageRule();
        // BacklogRule backlogRule = new BacklogRule();
        // GraduationYearRule graduationYearRule = new GraduationYearRule();

        // boolean percentagePass = percentageRule.check(candidate, job);
        
        // boolean backlogPass = backlogRule.check(candidate, job);
        

        // boolean yearPass = graduationYearRule.check(candidate, job);
        
        // boolean eligible = percentagePass && backlogPass && yearPass;

       

        // if(percentagePass) {
        //     System.out.println("Percentage: PASS");
        // } else {
        //     System.out.println("Percentage: FAIL");
        // }

        // if(backlogPass) {
        //     System.out.println("Backlogs: PASS");
        // } else {
        //     System.out.println("Backlogs: FAIL");
        // }

        // if(yearPass) {
        //     System.out.println("Graduation Year: PASS");
        // } else {
        //     System.out.println("Graduation Year: FAIL");
        // }

        boolean eligible = checker.check(candidate, job);

        System.out.println();

        if(eligible) {
            System.out.println("Final Result: ELIGIBLE");
        } else {
            System.out.println("Final Result: NOT ELIGIBLE");
        }

        System.out.println("===================================");

    }
}