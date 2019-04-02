import java.util.ArrayList;

public class CombatInstance {
    private ArrayList<Zombie> zombies;
    private Group group;


    public CombatInstance(ArrayList<Zombie> z, Group g) {
        setGroup(g);
        setZombies(z);

    }

    public void doBattle() {
        int NumberofZombiesAtStart = zombies.size();
        int Round = 0;
        Round(NumberofZombiesAtStart, Round);


    }

    private void Round(int numberofZombiesAtStart, int round) {


    }

    private void Buff(int damage_bonus) {
        //TODO this
    }


    private int SurvivorHit(int GroupDamage, int Zdamage){
        //TODO this just return 1 for now
    }




    public void setZombies(ArrayList<Zombie> zombies) {
        //TODO this
    }

    public void setGroup(Group group) {
        //TODO this
    }
}
