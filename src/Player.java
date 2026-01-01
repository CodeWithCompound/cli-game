public class Player extends Entity {
    private boolean meditationBuff;
    private boolean shieldingBuff;

    public Player(String name, int health, int atk, int defense) {
        super(name, health, atk, defense);
        this.meditationBuff = false;
        this.shieldingBuff = false;
    }
    public void meditate() {
        meditationBuff = true;
    }
}
