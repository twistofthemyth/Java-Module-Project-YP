import java.util.Scanner;

public class RaceRunner {
    private final int participantsAmount;

    public RaceRunner(int participantsAmount) {
        this.participantsAmount = participantsAmount;
    }

    public void run() {
        Race race = new Race();
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= participantsAmount; i++) {
            System.out.printf("— Введите название машины №%s:\n", i);
            String participantName = scanner.next();
            int participantSpeed = -1;
            do {
                System.out.printf("— Введите скорость машины №%s:\n", i);
                participantSpeed = scanner.nextInt();
                if (!isSpeedCorrect(participantSpeed)) {
                    System.out.println("— Неправильная скорость\n");
                }
            } while (!isSpeedCorrect(participantSpeed));

            Automobile participant = new Automobile(participantName, participantSpeed);
            race.addAutomobile(participant);
        }

        System.out.println("Самая быстрая машина: " + race.getLeader().getName());
    }

    private boolean isSpeedCorrect(int speed) {
        return speed >= 0 && speed <= 250;
    }
}
