/**
 * Created by Justin Gertsch on 9/10/14.
 */
abstract class Character
{

    private WeaponBehavior weapon;

    abstract public void fight();

    
    public void setWeapon(WeaponBehavior w)
    {
        System.out.println("Getting a weapon");
        this.weapon = w;
    }

    public WeaponBehavior getWeapon()
    {
        return weapon;
    }

    public static void main(String[] args)
    {
        WeaponBehavior a = new AxeBehavior();
        WeaponBehavior ba = new BowAndArrowBehavior();
        WeaponBehavior ki = new KnifeBehavior();
        WeaponBehavior s = new SwordBehavior();

        System.out.println("Making queen");
        Queen q = new Queen();
        q.setWeapon(ki);
        q.fight();
        System.out.println();

        System.out.println("Making king");
        King k = new King();
        k.setWeapon(s);
        k.fight();
        System.out.println();

        System.out.println("Making troll");
        Troll t = new Troll();
        t.setWeapon(a);
        t.fight();
        System.out.println();

        System.out.println("Making knight");
        Knight kn = new Knight();
        kn.setWeapon(ba);
        kn.fight();
        kn.setWeapon(s);
        kn.fight();
        System.out.println();
    }

}
