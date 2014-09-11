/**
 * Created by lucian on 9/10/14.
 */
public class Queen extends Character
{

    Queen()
    {
        System.out.println("I'm a queen");
    }


    @Override
    public void fight()
    {
        WeaponBehavior w = getWeapon();
        w.useWeapon();
    }
}
