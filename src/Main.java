// Yelgazy Dias , IT-#2505 , Gym Proejct

public class Main {

    public static void main(String[] args) {

        System.out.println("=== Gym Management System ===\n");

        Member m1 = new Member(67, "Dias", 22, "Basic");
        Member m2 = new Member(52, "John Pork", 25, "Basic");

        Trainer t1 = new Trainer(101, "Mik", "Power", 7);
        Trainer t2 = new Trainer(102, "Bob-shbob", "Cardio", 2);

        WorkoutSession s1 = new WorkoutSession(500, "Dias", "Mik", 65); // Jestkiy jim leja 200kg

        System.out.println("--- Initial Objects ---");
        System.out.println(m1);
        System.out.println(m2);
        System.out.println(t1);
        System.out.println(t2);
        System.out.println(s1);

        System.out.println("\n--- Testing Getters ---");
        System.out.println(m1.getMemberId());
        System.out.println(m1.getName());
        System.out.println(m1.getAge());
        System.out.println(m1.getMembershipType());

        System.out.println(t1.getTrainerId());
        System.out.println(t1.getName());
        System.out.println(t1.getSpecialization());
        System.out.println(t1.getExperience());

        System.out.println(s1.getSessionId());
        System.out.println(s1.getMemberName());
        System.out.println(s1.getTrainerName());
        System.out.println(s1.getDuration());

        System.out.println("\n--- Testing Setters ---");
        m2.setAge(26);
        m2.setMembershipType("Premium");
        t2.setExperience(3);
        s1.setDuration(70);

        System.out.println(m2);
        System.out.println(t2);
        System.out.println(s1);

        System.out.println("\n--- Testing Methods ---");
        System.out.println(m1.isActive());
        m1.upgrade();

        System.out.println(t1.isExperienced());
        System.out.println(t2.canTeach("Cardio"));

        s1.extend(2);
        System.out.println(s1.complete());

        System.out.println("\n--- Final Objects ---");
        System.out.println(m1);
        System.out.println(s1);

        System.out.println("\n=== Program Complete ===");
    }
}