public class Boss extends GameEntity {
    public Boss (int health , int damage , String weapon){
        super();
        this.setDamage(damage);
        this.setHealth(health);
        this.setWeapon(weapon);
    }

    @Override
    public String info() {
        return super.info();
    }
}
