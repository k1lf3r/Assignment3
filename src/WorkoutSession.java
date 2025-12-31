public class WorkoutSession {

    private int sessionId;
    private String memberName;
    private String trainerName;
    private int duration;

    public WorkoutSession(int sessionId, String memberName, String trainerName, int duration) {
        if (sessionId <= 0) throw new IllegalArgumentException();
        if (duration < 0) throw new IllegalArgumentException();

        this.sessionId = sessionId;
        this.memberName = memberName;
        this.trainerName = trainerName;
        this.duration = duration;
    }

    public int getSessionId() { return sessionId; }
    public int getDuration() { return duration; }

    public void extend(int minutes) {
        if (minutes > 0) {
            duration += minutes;
        }
    }

    public boolean complete() {
        return duration > 0;
    }

    @Override
    public String toString() {
        return "Session [ID=" + sessionId +
                ", Member=" + memberName +
                ", Trainer=" + trainerName +
                ", Duration=" + duration + "]";
    }
}
