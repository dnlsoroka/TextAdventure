public class SpecialEnemy {
    protected String name;
    protected int hp;
    protected int damage;
    protected int speed;
    //constructor (always has same name as class)
    public SpecialEnemy(String name, int hp, int damage, int speed){
        // variable name = input arg name
        this.name = name;
        this.hp = hp;
        this.damage = damage;
        this.speed = speed;
    }

    public boolean isAlive(){
        return(this.hp > 0);
    }

    public String toString(){
        return String.format("%s \n====\nHealth Points: %d \nDamage %d \nSpeed %d", this.name, this.hp, this.damage, this.speed);
    }


}

