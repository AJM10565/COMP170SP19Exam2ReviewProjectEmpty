public class Survivor {
    private String name;
    private int MaxHP;
    private int HP ;//TODO this set to default
    private int Damage ;//TODO this set to default
    private boolean infected; //TODO set to appropriate
    private Group group;

    @Override
    public String toString() {
        //TODO this name, HP/MaxHP, Damage, then either Infected or Healthy as appropriate

    }

    public Survivor(String name){
        //TODO this initialize values



    }


    public void setDamage(int damage) {
        //TODO this
    }

    public void setHP(int HP) {

        //TODO this set value of HP and then check if 0, if so and infected make a zombie and remove from group if there


    }

    public void setName(String name) {
        //TODO this
    }

    public String getName() {
        //TODO this
    }

    public int getDamage() {
        //TODO this
    }

    public int getHP() {
        //TODO this
    }

    public boolean isInfected() {
        //TODO this
    }

    public void setInfected(boolean infected) {
        //TODO this
    }

    public boolean inGroup(){
        //TODO this

    }
    public Group getGroup() {
        //TODO this
    }

    public void setGroup(Group group) {
        //TODO this
    }

    public void leaveGroup(){
        //TODO this
    }

    public void takeDamage(int damagetaken){
        //TODO this
    }
}
