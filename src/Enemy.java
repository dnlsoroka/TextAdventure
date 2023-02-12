public class Enemy {
    protected String name;
    protected int hp;
    protected int damage;
    //constructor (always has same name as class)
    public Enemy(String name, int hp, int damage){
        // variable name = input arg name
        this.name = name;
        this.hp = hp;
        this.damage = damage;
    }

    public boolean isAlive(){
        return(this.hp > 0);
    }

    public String toString(){
        return String.format("%s \n====\nHealth Points: %d \nDamage %d \n", this.name, this.hp, this.damage);
    }


}
