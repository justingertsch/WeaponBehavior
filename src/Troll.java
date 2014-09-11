/**
 * Created by lucian on 9/10/14.
 */
public class Troll extends Character
{
    Troll()
    {
        System.out.println("I'm a troll");
    }


    @Override
    public void fight()
    {
        WeaponBehavior w = getWeapon();
        w.useWeapon();
    }
}
