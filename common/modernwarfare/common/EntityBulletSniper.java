package modernwarfare.common;

import net.minecraft.entity.Entity;
import net.minecraft.world.World;

public class EntityBulletSniper extends EntityBullet
{
    public EntityBulletSniper(World world)
    {
        super(world);
    }

    public EntityBulletSniper(World world, double d, double d1, double d2)
    {
        super(world, d, d1, d2);
    }

    public EntityBulletSniper(World world, Entity entity, ItemGun itemgun)
    {
        super(world, entity, itemgun);
    }

    @Override
    public void playServerSound(World world)
    {
        world.playSoundAtEntity(this, ((ItemGun)ModernWarfare.itemGunSniper).firingSound, ((ItemGun)ModernWarfare.itemGunSniper).soundRangeFactor, 1.0F / (rand.nextFloat() * 0.1F + 0.95F));
    }
}
