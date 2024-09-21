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
            String participantName = readParticipantName(scanner, i);
            int participantSpeed = readParticipantSpeed(scanner, i);
            Automobile participant = new Automobile(participantName, participantSpeed);
            race.addAutomobile(participant);
        }

        scanner.close();
        System.out.println("Самая быстрая машина: " + race.getLeader().getName());
    }

    private String readParticipantName(Scanner scanner, int participantNumber) {
        System.out.printf("— Введите название машины №%s:\n", participantNumber);
        return scanner.nextLine();
    }

    private int readParticipantSpeed(Scanner scanner, int participantNumber) {
        while (true) {
            System.out.printf("— Введите скорость машины №%s:\n", participantNumber);
            String speedInput = scanner.nextLine();
            try {
                int speed = Integer.parseInt(speedInput);
                if (isSpeedCorrect(speed)) {
                    return speed;
                } else {
                    printWrongInputSpeed();
                }
            } catch (NumberFormatException e) {
                printWrongInputSpeed();
            }
        }
    }

    private boolean isSpeedCorrect(int speed) {
        return speed >= 0 && speed <= 250;
    }

    private void printWrongInputSpeed() {
        System.out.println("— Неправильная скорость\n");
    }
}
