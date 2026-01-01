public abstract class Entity {
    protected String name;
    protected int health;
    protected int atk;
    protected int defense; // 1 defense reduces incoming atk by 1%
    public Entity(String name, int health, int atk, int defense) {
        this.name = name;
        this.health = health;
        this.atk = atk;
        this.defense = defense;

    }
    public void printStatus() {
        System.out.println("Name: " + name);
        System.out.println("Health: " + health);
        System.out.println("Attack: " + atk);
        System.out.println("Defense: " + defense);
    }

}
