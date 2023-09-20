public class GameEntity {
    int health;
    int damage;
    String weapon;
    public GameEntity() {
    }

    public int getDamage() {
        return damage;
    }

    public int getHealth() {
        return health;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void setHealth(int health) {
        this.health = health;
    }
    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }
    public String info(){return " DAMAGE: " + this.damage + " HEALTH: " + this.health + " WEAPON: " + this.weapon;}




}
