package strormtrooper.newmods.gui;


import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.GL11;

public class GuiTest extends GuiScreen{

	int guiWidth = 168;
	int guiHeight = 158;
	
	int tabWidth = 35;
	int tabHeight = 20;
	
	int tab1v = 181;
	int tab2v = 181;
	int tab3v = 181;
	
	int x1 = 48;
	int x2 = 71;
	int x3 = 94;
	int y1 = 73;
	int y2 = 96;
	int y3 = 120;
	
	int guiX = (width - guiWidth) / 2;
	int guiY = (height - guiHeight) / 2;
	
	boolean Clicked1 = true;
	boolean Clicked2 = false;
	boolean Clicked3 = false;
	boolean Inside1 = false;
	boolean Inside2 = false;
	boolean Inside3 = false;
	boolean Page1 = true;
	boolean Page2 = false;
	boolean Page3 = false;
	boolean Page4 = false;
	boolean clear = true;
	
	
	GuiButton testButton;
	
	@Override
	public void drawScreen(int x, int y, float ticks) {
		int guiX = (width - guiWidth) / 2;
		int guiY = (height - guiHeight) / 2;
		GL11.glColor4f(1, 1, 1, 1);
		drawDefaultBackground();
		//find texture
		mc.renderEngine.bindTexture(new ResourceLocation("frst", "textures/gui/testGui.png"));
		drawTexturedModalRect(guiX, guiY, 0, 0, guiWidth, guiHeight);
		if(Clicked1){
			tab1v = 201;
		}else{
			tab1v = 180;
		}
		drawTexturedModalRect(guiX - 33, guiY + 10, 0, tab1v, tabWidth, tabHeight);
		if(Clicked2){
			tab2v = 201;
		}else{
			tab2v = 180;
		}
		drawTexturedModalRect(guiX - 33, guiY + 11 + tabHeight, 37, tab2v, tabWidth, tabHeight);
		if(Clicked3){
			tab3v = 201;
			drawTexturedModalRect(guiX + 40, guiY + 65, 178, 178, 78, 78);
			drawTexturedModalRect(guiX + 63, guiY + 20, 221, 0, tabWidth, 9);
			drawTexturedModalRect(guiX + 117, guiY + 12, 221, 9, 35, 12);
			drawTexturedModalRect(guiX + 12, guiY + 13 , 221, 21, 35, 12);
			if(Page1){
				drawTexturedModalRect(guiX + 20, guiY + 46, 62, 221, 16, 16);
				drawTexturedModalRect(guiX + 78, guiY + 48, 16, 221, 14, 14);
				
				if(Inside1){
					drawTexturedModalRect(guiX + x2, guiY + y1, 46, 221, 16, 16);
					drawTexturedModalRect(guiX + x1, guiY + y2, 46, 221, 16, 16);
					drawTexturedModalRect(guiX + x2, guiY + y3, 46, 221, 16, 16);
					drawTexturedModalRect(guiX + x3, guiY + y2, 46, 221, 16, 16);
					drawTexturedModalRect(guiX + x2, guiY + y2, 30, 221, 16, 16);
				}else{
					
				}
				if(Inside2){
					drawTexturedModalRect(guiX + x2, guiY + y1, 0, 221, 16, 16);
					drawTexturedModalRect(guiX + x2, guiY + y2, 0, 221, 16, 16);
				}else{
					
				}
				if(Inside3){
					drawTexturedModalRect(guiX + x2, guiY + y1, 62, 221, 16, 16);
					drawTexturedModalRect(guiX + x2, guiY + y2, 62, 221, 16, 16);
					drawTexturedModalRect(guiX + x2 + 1, guiY + y3 + 1, 16, 221, 14, 14);
				}else{
					
				}
			}else{
				
			}
			if(Page2){
				if(Inside1){
					//paintcan
					drawTexturedModalRect(guiX + x2, guiY + y1, 0, 235, 16, 16);
					drawTexturedModalRect(guiX + x1, guiY + y2, 0, 235, 16, 16);
					drawTexturedModalRect(guiX + x3, guiY + y2, 0, 235, 16, 16);
					drawTexturedModalRect(guiX + x2, guiY + y3, 0, 235, 16, 16);
					//planks
					drawTexturedModalRect(guiX + x1, guiY + y1, 46, 237, 16, 16);
					drawTexturedModalRect(guiX + x3, guiY + y1, 46, 237, 16, 16);
					drawTexturedModalRect(guiX + x2, guiY + y2, 46, 237, 16, 16);
					drawTexturedModalRect(guiX + x1, guiY + y3, 46, 237, 16, 16);
					drawTexturedModalRect(guiX + x3, guiY + y3, 46, 237, 16, 16);
				}else{
					
				}
				if(Inside2){
					drawTexturedModalRect(guiX + x1, guiY + y1, 62, 237, 16, 16);
					drawTexturedModalRect(guiX + x2, guiY + y2, 62, 237, 16, 16);
				}else{
					
				}
				if(Inside3){
					drawTexturedModalRect(guiX + x2, guiY + y1, 30, 237, 16, 16);
					drawTexturedModalRect(guiX + x2, guiY + y2, 30, 237, 16, 16);
					drawTexturedModalRect(guiX + x2, guiY + y3, 16, 236, 16, 16);
				}else{
					
				}
			}else{
				
			}
			if(Page3){
				if(Inside1){
					drawTexturedModalRect(guiX + x2, guiY + y1, 16, 221, 14, 14);
					drawTexturedModalRect(guiX + x1, guiY + y2, 0, 221, 16, 16);
					drawTexturedModalRect(guiX + x3, guiY + y2, 0, 221, 16, 16);
					drawTexturedModalRect(guiX + x2, guiY + y3, 0, 221, 16, 16);
				}else{
					
				}
				if(Inside2){
					drawTexturedModalRect(guiX + x2, guiY + y1, 46, 237, 16, 16);
					drawTexturedModalRect(guiX + x2, guiY + y2, 46, 237, 16, 16);
					drawTexturedModalRect(guiX + x2, guiY + y3, 46, 237, 16, 16);
				}else{
					
				}
				if(Inside3){
					drawTexturedModalRect(guiX + x1, guiY + y1, 46, 237, 16, 16);
					drawTexturedModalRect(guiX + x2, guiY + y1, 46, 237, 16, 16);
					drawTexturedModalRect(guiX + x3, guiY + y1, 46, 237, 16, 16);
					drawTexturedModalRect(guiX + x2, guiY + y2, 0, 221, 16, 16);
					drawTexturedModalRect(guiX + x3, guiY + y2, 78, 221, 16, 16);
					drawTexturedModalRect(guiX + x3, guiY + y3, 78, 221, 16, 16);
					drawTexturedModalRect(guiX + x1, guiY + y2, 78, 221, 16, 16);
					drawTexturedModalRect(guiX + x1, guiY + y3, 78, 221, 16, 16);
				}else{
					
				}
			}else{
				
			}
			if(Page4){
				
			}else{
				
			}
		}else{
			tab3v = 180;
		}
		drawTexturedModalRect(guiX - 33, guiY + 12 + tabHeight + tabHeight, 74, tab3v, tabWidth, tabHeight);
		//put text onto GUI
		if(Clicked1){
			fontRendererObj.drawString("Mod created by Strormtrooper", guiX + 8, guiY + 10, 0x000000);
			fontRendererObj.drawString("To see all the new Items, go to", guiX + 8, guiY + 20, 0x000000);
			fontRendererObj.drawString("the Items tab.", guiX + 10, guiY + 28, 0x000000);
			fontRendererObj.drawString("To see the crafting recipes,", guiX + 8, guiY + 40, 0x000000);
			fontRendererObj.drawString("go to the recipes tab.", guiX + 8, guiY + 50, 0x000000);
		}else{
			
		}
		if(Clicked2){
			fontRendererObj.drawString("          All new Items", guiX + 8, guiY + 10, 0x000000);
			fontRendererObj.drawString("Enderium: Ingot, Sword, Armor", guiX + 8, guiY + 30, 0x000000);
			fontRendererObj.drawString("Emerald: Tools, Armor", guiX + 8, guiY + 40, 0x000000);
			fontRendererObj.drawString("Food: Sausage, HotDog", guiX + 8, guiY + 50, 0x000000);
			fontRendererObj.drawString("Decoration Blocks: Drywall", guiX + 8, guiY + 60, 0x000000);
		}else{
			
		}
		if(Clicked3){	
			fontRendererObj.drawString("            Recipes", guiX + 15, guiY + 10, 0x000000);
			fontRendererObj.drawString("Clear", guiX + 68, guiY + 21, 0xC10000);
			if(Page1){
				fontRendererObj.drawString("Enderium     Steel    Enderium", guiX + 10, guiY + 30, 0x000000);
				fontRendererObj.drawString("Ingot x2      Rod      Sword", guiX + 10, guiY + 40, 0x000000);
			
			}
			if(Page2){
				fontRendererObj.drawString("Drywall      Paint    Paint",guiX + 10, guiY + 30, 0x000000);
				fontRendererObj.drawString(" x16        Mix x6     Can ", guiX + 10, guiY + 40, 0x000000);
			}
			if(Page3){
				fontRendererObj.drawString("Empty      Table    Table",guiX + 10, guiY + 30, 0x000000);
				fontRendererObj.drawString("Paint       leg     Block", guiX + 10, guiY + 40, 0x000000);
				fontRendererObj.drawString("Can x4 ", guiX + 10, guiY + 50, 0x000000);
			}
		}else{
			
		}
		fontRendererObj.drawString("Welcome to My First Mod Created!",guiX , guiY - 15, 0x0094FF);
		super.drawScreen(x, y, ticks);
	}
	
	
	private void drawString(String string, int i, int j, int tab1v2,
			int tabWidth2, int tabHeight2) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void initGui() {
		int guiX = (width - guiWidth) / 2;
		int guiY = (height - guiHeight) / 2;
		buttonList.clear();
		//buttonList.add(testButton = new GuiButton(0, guiX + 70, guiY + 40, 33, 18,"Clear"));
		
		super.initGui();
	}
	@Override
	protected void actionPerformed(GuiButton button) {
		switch(button.id){
		case 0:
			clear = true;
		}
		super.actionPerformed(button);
	}
	@Override
	protected void keyTyped(char c, int key) {
		switch(key){
		case Keyboard.KEY_E:
			mc.displayGuiScreen(null);
		}
		super.keyTyped(c, key);
	}
	
	@Override
	protected void mouseClicked(int x, int y, int button) {
		super.mouseClicked(x,y, button);
		if(guiWidth - 35 <= x && x <= guiWidth - 35 + tabWidth && guiHeight - 84 <= y && y <= guiHeight - 84 +tabHeight){	
			System.out.println("Clicked 1");
			Clicked1 = true;
			Clicked2 = false;
			Clicked3 = false;
			clear = true;
		}
		if(guiWidth - 35 <= x && x <= guiWidth  - 35 + tabWidth && guiHeight - 85 + tabHeight <= y && y <= guiHeight - 85 +tabHeight + tabHeight){	
			System.out.println("Clicked 2");
			Clicked1 = false;
			Clicked2 = true;
			Clicked3 = false;
			clear = true;
		}
		if(guiWidth - 35 <= x && x <= guiWidth  - 35 + tabWidth && guiHeight - 86 + tabHeight + tabHeight <= y && y <= guiHeight - 86 +tabHeight + tabHeight + tabHeight){	
			System.out.println("Clicked 3");
			Clicked1 = false;
			Clicked2 = false;
			Clicked3 = true;
			clear = true;
		}
		if(Clicked3){
			
			if(guiWidth + 64 <= x && x <= guiWidth + 64 + 45 && guiHeight - 96 + tabHeight <= y && y <= guiHeight - 96 + tabHeight + 10){	
				System.out.println("Cleared");
					clear = true;
			}
			if(Page1){
				if(guiWidth + 8 <= x && x <= guiWidth + 8 + 60 && guiHeight - 81 + tabHeight <= y && y <= guiHeight - 81 + tabHeight + 10){	
					System.out.println("Inside 1");
					Inside1 = true;
					Inside2 = false;
					Inside3 = false;
					clear = false;
				}
				if(guiWidth + 60 <= x && x <= guiWidth + 60 + 60 && guiHeight - 81 + tabHeight <= y && y <= guiHeight - 81 + tabHeight + 10){	
					System.out.println("Inside 2");
					Inside1 = false;
					Inside2 = true;
					Inside3 = false;
					clear = false;
				}
				if(guiWidth + 112 <= x && x <= guiWidth + 112 + 60 && guiHeight - 81 + tabHeight <= y && y <= guiHeight - 81 + tabHeight + 10){	
					System.out.println("Inside 3");
					Inside1 = false;
					Inside2 = false;
					Inside3 = true;
					clear = false;
				}
			}
			
			if(Page2){
				if(guiWidth + 13 <= x && x <= guiWidth + 13 + 35 && guiHeight - 82  <= y && y <= guiHeight - 82 + 12){	
					System.out.println("Page 1");
					Page1 = true;
					Page2 = false;
					Page3 = false;
					Page4 = false;
					clear = true;
				}
				if(guiWidth + 8 <= x && x <= guiWidth + 8 + 60 && guiHeight - 81 + tabHeight <= y && y <= guiHeight - 81 + tabHeight + 10){	
					System.out.println("Inside 1");
					Inside1 = true;
					Inside2 = false;
					Inside3 = false;
					clear = false;
				}
				if(guiWidth + 60 <= x && x <= guiWidth + 60 + 60 && guiHeight - 81 + tabHeight <= y && y <= guiHeight - 81 + tabHeight + 10){	
					System.out.println("Inside 2");
					Inside1 = false;
					Inside2 = true;
					Inside3 = false;
					clear = false;
				}
				if(guiWidth + 112 <= x && x <= guiWidth + 112 + 60 && guiHeight - 81 + tabHeight <= y && y <= guiHeight - 81 + tabHeight + 10){	
					System.out.println("Inside 3");
					Inside1 = false;
					Inside2 = false;
					Inside3 = true;
					clear = false;
				}
			}
			if(Page3){
				if(guiWidth + 13 <= x && x <= guiWidth + 13 + 35 && guiHeight - 82  <= y && y <= guiHeight - 82 + 12){	
					System.out.println("Page 2");
					Page1 = false;
					Page2 = true;
					Page3 = false; 
					Page4 = false;
					clear = true;
				}
				if(guiWidth + 8 <= x && x <= guiWidth + 8 + 60 && guiHeight - 81 + tabHeight <= y && y <= guiHeight - 81 + tabHeight + 10){	
					System.out.println("Inside 1");
					Inside1 = true;
					Inside2 = false;
					Inside3 = false;
					clear = false;
				}
				if(guiWidth + 60 <= x && x <= guiWidth + 60 + 60 && guiHeight - 81 + tabHeight <= y && y <= guiHeight - 81 + tabHeight + 10){	
					System.out.println("Inside 2");
					Inside1 = false;
					Inside2 = true;
					Inside3 = false;
					clear = false;
				}
				if(guiWidth + 112 <= x && x <= guiWidth + 112 + 60 && guiHeight - 81 + tabHeight <= y && y <= guiHeight - 81 + tabHeight + 10){	
					System.out.println("Inside 3");
					Inside1 = false;
					Inside2 = false;
					Inside3 = true;
					clear = false;
				}

			}
			
			if(Page4){
				
			}
			if(Page3){
				if(guiWidth + 119 <= x && x <= guiWidth + 119 + 35 && guiHeight - 83  <= y && y <= guiHeight - 83 + 12){	
					System.out.println("Page 4");
					Page1 = false;
					Page2 = false;
					Page3 = true;
					Page4 = false;
					clear = true;
				}
			}
			if(Page2){
				if(guiWidth + 119 <= x && x <= guiWidth + 119 + 35 && guiHeight - 83  <= y && y <= guiHeight - 83 + 12){	
					System.out.println("Page 3");
					Page1 = false;
					Page2 = false;
					Page3 = true;
					Page4 = false;
					clear = true;
				}
			}
			if(Page1){
				if(guiWidth + 119 <= x && x <= guiWidth + 119 + 35 && guiHeight - 83  <= y && y <= guiHeight - 83 + 12){	
					System.out.println("Page 2");
					Page1 = false;
					Page2 = true;
					Page3 = false;
					Page4 = false;
					clear = true;
				}
			}
			if(clear) {
				Inside1 = false;
				Inside2 = false;
				Inside3 = false;
			}
		}
		
	}
}
