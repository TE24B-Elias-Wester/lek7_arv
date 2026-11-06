public class Skeleton extends Monster {
    int revive_chance;

    public Skeleton(int revive_chance) {
        this.revive_chance=revive_chance;
        super("skeleton", 15, 15, 5);
    }

    @Override
    public void takeDamage(int damage) {
        this.hp -= damage;
        if (this.hp <= 0) {
            this.hp = 0;
            IO.println(getname() + " is dead.");
        }
        if (randomInt.nextInt(101) > this.revive_chance) {
            IO.println("Skeleton revived");
            this.hp = max_hp;
        }
    }
}
