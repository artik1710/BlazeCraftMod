package blazecraft.mod.blocks;

import net.minecraft.block.material.Material;

public class IlushasBlock extends BaseBlock{ //расширяешь блок кастомный до моей базы

	public IlushasBlock(String name, Material materialIn) {		
		super("ilushas_block",Material.CAKE);  //возвращаешь базе имя и материал, если он не камстомный
		//тут пишешь всякой код блока
	}

}
