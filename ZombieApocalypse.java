public class ZombieApocalypse {

    public static void main(String[] args) {
        boolean game_guard = true;
        while(game_guard){
            Group g1 = new Group("Celebrities");
            Survivor s1 = new Survivor("Bob Marley");
            Survivor s2 = new Survivor("Elvis Presley");
            Zombie z1 = new Zombie(1);
//            Zombie z2 = new Zombie(2);
//            Zombie z3 = new Zombie(3);

            g1.addSurvivor(s1);
            g1.addSurvivor(s2);

            CombatInstance combat1 = new CombatInstance(Zombie.zombies,g1);
            combat1.doBattle();
            System.out.println(g1);


        }






    }


}
