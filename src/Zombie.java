public class Zombie extends Monster {
    int infect_risk;

    public Zombie(int infect_risk) {
        this.infect_risk=infect_risk;
        super("zombie", 20, 20, 5);
    }

    @Override
     public int attack() {
        IO.println(this.getname() + " bites and you take " + this.getdmg_points() + " damage.");
        if (randomInt.nextInt(101) > this.infect_risk) {
            IO.println("You're infected.");
        }
        return this.getdmg_points();
    }
}
