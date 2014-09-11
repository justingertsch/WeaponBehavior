/**
 * Created by lucian on 9/10/14.
 */
public class Knight extends Character
{
    Knight()
    {
        System.out.println("I'm a knight");
    }


    @Override
    public void fight()
    {
        WeaponBehavior w = getWeapon();
        w.useWeapon();
    }


}
