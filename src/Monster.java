import java.util.Random;

public class Monster {
    Random randomInt = new Random();
    private String name;
    protected  int hp;
    protected  int max_hp;
    protected  int dmg_points;
    
    Monster(String name, int hp, int max_hp, int dmg_points) {
        this.name=name;
        this.hp=hp;
        this.max_hp=max_hp;
        this.dmg_points=dmg_points;
    }

    public int attack() {
        IO.println(getname() + " attacks for " + getdmg_points() + " damage.");
        return getdmg_points();
    }

    public void takeDamage(int damage) {
        this.hp -= damage;
        if (this.hp <= 0) {
            this.hp = 0;
            IO.println(getname() + " is dead.");
        }
    }


    public String getname() {
        return name;
    }

    public int gethp() {
        return hp;
    }

    public int getdmg_points() {
        return dmg_points;
    }
}
