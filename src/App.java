import java.util.Random;

void main() {
    Random random = new Random();
    switch (random.nextInt(2)) {
        case 1 -> {
            Zombie Zombie1 = new Zombie(50);
            game(Zombie1, random.nextInt(5));
        }
        case 0 -> {
            Skeleton Skeleton1 = new Skeleton(50);
            game(Skeleton1, random.nextInt(5));
        }
    }
}

void game(Monster monster, int randomInt) {
    int player_hp = 50;
    int player_dmg_points = randomInt;
    while (true) {
        
        IO.println("You attack!");
        monster.takeDamage(player_dmg_points);
        player_hp -= monster.attack();

        if (player_hp <= 0) {
            IO.println("You died!");
            break;
        }
        if (monster.max_hp  <= 0) {
            IO.println("You Win!");
            break;
        }
    }
}
