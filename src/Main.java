// Yelgazy Dias , IT-#2505 , Gym Proejct

public class Main {

    public static void main(String[] args) {

        System.out.println("=== Gym Management===\n=== Boy Next Door ===\n");

        Member m1 = new Member(67, "Dias", 22, "Basic");
        Member m2 = new Member(52, "John Pork", 25, "Basic");

        Trainer t1 = new Trainer(101, "Mik", "Power", 7);
        Trainer t2 = new Trainer(102, "Bob-shbob", "Cardio", 2);

        WorkoutSession s1 = new WorkoutSession(42, "Dias", "Mik", 45); // Jestkiy jim leja 200kg

        // 1. Display initial state
        System.out.println("--- Initial State ---");
        System.out.println(m1);
        System.out.println(m2);
        System.out.println(t1);
        System.out.println(t2);
        System.out.println(s1);

        // 2. Test getters
        System.out.println("\n--- Getters ---");
        System.out.println("Member: " + m1.getMemberId() + ", " + m1.getName() + ", " + m1.getAge() + ", " + m1.getMembershipType());
        System.out.println("Trainer: " + t1.getTrainerId() + ", " + t1.getName() + ", " + t1.getSpecialization() + ", " + t1.getExperience());
        System.out.println("Session: " + s1.getSessionId() + ", " + s1.getMemberName() + ", " + s1.getTrainerName() + ", " + s1.getDuration());

        // 3. Test setters
        System.out.println("\n--- Setters ---");
        m2.setAge(26);
        m2.setMembershipType("Premium");
        t2.setExperience(3);
        s1.setDuration(55);

        System.out.println(m2);
        System.out.println(t2);
        System.out.println(s1);

        // 4. Test additional methods
        System.out.println("\n--- Methods ---");

        System.out.println("Is member active: " + m1.isActive());
        m1.upgrade();
        System.out.println(m1);

        System.out.println("Is trainer experienced: " + t1.isExperienced());
        System.out.println("Can teach Cardio: " + t2.canTeach("Cardio"));

        s1.extend(12);
        System.out.println("Session complete: " + s1.complete());
        System.out.println(s1);

    }
}
