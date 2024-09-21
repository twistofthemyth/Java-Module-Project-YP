public class Race {
    private Automobile leader;

    public void addAutomobile(Automobile automobile) {
        if (leader == null) {
            leader = automobile;
        } else if (automobile.getSpeed() > leader.getSpeed()) {
            leader = automobile;
        }
    }

    public Automobile getLeader() {
        return leader;
    }
}