//child class of item
public class Weapon extends Item{

    private int damage;
    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public Weapon(String name, String description, int value, int damage){
       // use variables from parent class
        super(name, description, value);
        this.damage = damage;
    }

    public String str(){
        return String.format("{0} %s\n====\n{1} %s\n{2} Value: %d\n{3} Damage: %d" ,
                this.name, this.description, this.value, this.damage);
    }

}
