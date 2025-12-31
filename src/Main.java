import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Member> members = new ArrayList<>();
        List<Trainer> trainers = new ArrayList<>();
        List<WorkoutSession> sessions = new ArrayList<>();

        // Initial test data
        members.add(new Member(67, "Dias", 22, "Basic"));
        members.add(new Member(52, "John Pork", 25, "Basic"));

        trainers.add(new Trainer(101, "Mik", "Power", 7));
        trainers.add(new Trainer(102, "Bob-shbob", "Cardio", 2));

        sessions.add(new WorkoutSession(42, "Dias", "Mik", 45));

        boolean running = true;

        while (running) {
            System.out.println("\n=== Gym Management Menu ===");
            System.out.println("1. Add Member");
            System.out.println("2. Add Trainer");
            System.out.println("3. View All Members");
            System.out.println("4. View All Trainers");
            System.out.println("5. Exit");
            System.out.print("Choose option: ");

            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    addMember(scanner, members);
                    break;
                case "2":
                    addTrainer(scanner, trainers);
                    break;
                case "3":
                    viewMembers(members);
                    break;
                case "4":
                    viewTrainers(trainers);
                    break;
                case "5":
                    running = false;
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid option");
            }
        }

        scanner.close();
    }

    private static void addMember(Scanner sc, List<Member> members) {
        try {
            System.out.print("ID: ");
            int id = Integer.parseInt(sc.nextLine());
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Age: ");
            int age = Integer.parseInt(sc.nextLine());
            System.out.print("Membership type: ");
            String type = sc.nextLine();

            members.add(new Member(id, name, age, type));
            System.out.println("Member added successfully");
        } catch (Exception e) {
            System.out.println("Invalid data");
        }
    }

    private static void addTrainer(Scanner sc, List<Trainer> trainers) {
        try {
            System.out.print("ID: ");
            int id = Integer.parseInt(sc.nextLine());
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Specialization: ");
            String spec = sc.nextLine();
            System.out.print("Experience: ");
            int exp = Integer.parseInt(sc.nextLine());

            trainers.add(new Trainer(id, name, spec, exp));
            System.out.println("Trainer added successfully");
        } catch (Exception e) {
            System.out.println("Invalid data");
        }
    }

    private static void viewMembers(List<Member> members) {
        System.out.println("\n--- Members ---");
        for (Member m : members) {
            System.out.println(m);
        }
    }

    private static void viewTrainers(List<Trainer> trainers) {
        System.out.println("\n--- Trainers ---");
        for (Trainer t : trainers) {
            System.out.println(t);
        }
    }
}
