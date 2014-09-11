/**
 * Created by lucian on 9/10/14.
 */
public class King extends Character
{
    King()
    {
        System.out.println("I'm a king");
    }


    @Override
    public void fight()
    {
        WeaponBehavior w = getWeapon();
        w.useWeapon();
    }
}
