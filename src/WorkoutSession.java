
class WorkoutSession {

    private int sessionId;
    private String memberName;
    private String trainerName;
    private int duration;


    public WorkoutSession(int sessionId, String memberName, String trainerName, int duration) {
        this.sessionId = sessionId;
        this.memberName = memberName;
        this.trainerName = trainerName;
        this.duration = duration;
    }


    public int getSessionId() { return sessionId; }
    public String getMemberName() { return memberName; }
    public String getTrainerName() { return trainerName; }
    public int getDuration() { return duration; }


    public void setSessionId(int sessionId) { this.sessionId = sessionId; }
    public void setMemberName(String memberName) { this.memberName = memberName; }
    public void setTrainerName(String trainerName) { this.trainerName = trainerName; }
    public void setDuration(int duration) { this.duration = duration; }


    public void extend(int extraMinutes) {
        this.duration += extraMinutes;
    }

    public boolean complete() {
        return duration > 0;
    }


    @Override
    public String toString() {
        return "Session [id=" + sessionId + ", member=" + memberName + ", trainer=" + trainerName + ", time=" + duration + "]";
    }
}