package blazecraft.mod.blocks;

import blazecraft.mod.init.BlockInit;
import blazecraft.mod.init.ItemInit;
import blazecraft.mod.util.handlers.CommonProxy;
import blazecraft.mod.util.handlers.IHasModel;
import blazecraft.mod.util.handlers.MainRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemBlock;
												/* ��� ���� ��������� ��� � ���������, �� � �������� ��� ����*/
public class BaseBlock extends Block implements IHasModel{

	public BaseBlock(String name,Material materialIn) {
		super(materialIn);
		setRegistryName(name);
		setUnlocalizedName(name);
		setCreativeTab(MainRegistry.blazetab);		//��� �� ���������� �������
		//BlockInit.registerBlocks();
		BlockInit.BLOCKS.add(this); //��������� � ������� ������ � ������ ������ 
		ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));

	}

	@Override
	public void registerModels() {
	//��� ������ ��� � �� �����������
	}

}
