package jivatma.blocks;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemBlock;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockAnvil extends BlockContainer{

	public static final BlockAnvil instanceBlock = new BlockAnvil();
	public static final ItemBlock instanceItemBlock = (ItemBlock) new ItemBlock(instanceBlock).setRegistryName(instanceBlock.getRegistryName());
	public static final String name = "ritual_anvil";
	
	protected BlockAnvil() {
		super(Material.anvil);
		this.setRegistryName(name);
	}

	@Override
	public TileEntity createNewTileEntity(World worldIn, int meta) {
		return new TEAnvil();
	}

}
