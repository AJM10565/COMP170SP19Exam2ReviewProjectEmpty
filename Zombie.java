import java.util.ArrayList;

public class Zombie {
    private int HP = Constants.DefaultHP;
    private int Damage = Constants.DefaultDamage;
    private String name = "Unknown";
    public static ArrayList<Zombie> zombies = new ArrayList<>();








    public Zombie(){
        //TODO this

    }

    public Zombie(int level){
        //TODO this
    }

    public Zombie(int hp, int damage){
        //TODO this
    }

    private Zombie(int hp,int damage, String name){
        //TODO this

    }

    public static Zombie makeZombie(Survivor infectedDead){
        //TODO this


    }

    private Zombie makeZombiebylevel(int level){
        //TODO this attrs are default times level


    }

    public void setHP(int HP) {
        //TODO this
    }

    public void setDamage(int damage) {
        //TODO this
    }

    public void setName(String name) {
        //TODO this
    }

    public int getHP() {
        //TODO this
    }

    public int getDamage() {
        //TODO this
    }

    public String getName() {
        //TODO this
    }

    public int getLevel() {
        //TODO this , damage/10
    }

    public int takeDamage(int damagetaken){
        //TODO this use set HP, if dead then remove from list, and return the level of zombie, otherwise return 0


    }
    public static int getAllDamage(){
        //TODO this return damage of all zombies
    }

}
