public class Player {
    private String name;
    private int health;
    private int atk;
    private int defense; // 1 defense reduces incoming atk by 1%
    private boolean meditationBuff;
    private boolean shieldingBuff;
    public Player(String name, int health, int atk, int defense, boolean meditationBuff, boolean shieldingBuff) {
        this.name = name;
        this.health = health;
        this.atk = atk;
        this.defense = defense;
        this.meditationBuff = meditationBuff;
        this.shieldingBuff = shieldingBuff;
    }
    public void printStatus() {
        System.out.println("Name: " + name);
        System.out.println("Health: " + health);
        System.out.println("Attack: " + atk);
        System.out.println("Defense: " + defense);
        System.out.println("Meditation Buff: " + meditationBuff);
        System.out.println("Shielding Buff: " + shieldingBuff);
    }

}
