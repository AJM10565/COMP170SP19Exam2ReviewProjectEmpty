import java.util.ArrayList;

public class Group {
    private String name;
    private ArrayList<Survivor> family;

    public Group(String name){
        // Todo initialize variables

    }

    public void addSurvivor(Survivor newbie){
        // Todo Check if already exists, and if stil alive and if not infected and not already in a group then add to both

    }
    public void removeSurvivor(Survivor member){
        // Todo remove someone if they are there
    }


    public String getName() {//TODO this}

    public void setName(String name) {
            //TODO this
    }

    public ArrayList<Survivor> getMembers(){
            //TODO this
    }

    public int getDamage(){
        //TODO get total damage of all members, return a large negative number if there is non

    }

    public int getMemberCount() {
        //TODO this
    }

    public void buffGroup(int amount){

            //TODO this add amount to Damage of each member and print this to out

    }
    public void takeDamage(int amount){
            //TODO this each member takes amount/number of members in damage and gets infected

    }
    @Override
    public String toString(){
            //TODO this print name of family and then all members with their stats
    }
}
