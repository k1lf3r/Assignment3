public class Member {

    private int memberId;
    private String name;
    private int age;
    private String membershipType;

    public Member(int memberId, String name, int age, String membershipType) {
        if (memberId <= 0) throw new IllegalArgumentException();
        if (age < 0) throw new IllegalArgumentException();

        this.memberId = memberId;
        this.name = name;
        this.age = age;
        this.membershipType = membershipType;
    }

    public int getMemberId() { return memberId; }
    public String getName() { return name; }
    public int getAge() { return age; }
    public String getMembershipType() { return membershipType; }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        }
    }

    public boolean isActive() {
        return age > 0;
    }

    public void upgrade() {
        this.membershipType = "Premium";
    }

    @Override
    public String toString() {
        return "Member [ID=" + memberId +
                ", Name=" + name +
                ", Age=" + age +
                ", Type=" + membershipType + "]";
    }
}
