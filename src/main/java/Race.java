public class Race {
    private Automobile leader;

    //Не используется, но сохранение пути является требованием к ПР
    private int leaderPath;

    public void addAutomobile(Automobile automobile) {
        if (leader == null || automobile.getSpeed() > leader.getSpeed()) {
            setLeader(automobile);
        }
    }

    public Automobile getLeader() {
        return leader;
    }

    private void setLeader(Automobile automobile) {
        leader = automobile;
        leaderPath = 24 * automobile.getSpeed();
    }
}