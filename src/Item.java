public class Item {
    protected String name;
    protected String description;
    protected int value;
    //constructor (always has same name as class)
    public Item(String name, String description, int value){
        // variable name = input arg name
        this.name = name;
        this.description = description;
        this.value = value;

    }

    public String toString(){
        return String.format("%s \n====\n %s \nValue %d \n" , this.name, this.description, this.value);
    }

}
