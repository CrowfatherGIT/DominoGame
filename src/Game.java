import java.lang.management.PlatformLoggingMXBean;

public class Game {
    private BonesArray aRemainingBones;
    private BonesArray aPlayedBones;
    private BonesArray aPlayer1;
    private BonesArray aPlayer2;

    private InputOutput aInputOutput;

    public Game() {
        aInputOutput = new InputOutput() {

        }
    }
    public void start() {
        aRemainingBones = BonesArray.all();
        aPlayedBones = new BonesArray();
        aPlayer1 = new BonesArray();
        aPlayer2 = new BonesArray();
        playerTakeBones(6, aPlayer1);
        playerTakeBones(6, aPlayer2);
    }

    public void playerTakeBones(int count, BonesArray player) {
        for (int i = 0, i<count, i++){
            int index = aInputOutput.getIntInRange( Please take Bone)
        }
    }
}
