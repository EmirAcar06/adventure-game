/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package maceraoyunu2;


public abstract class NormalLoc extends Location{

	NormalLoc(Player player,String name) {
		super(player);
		this.name = name;
	}
	

	public boolean getLocation() {
		return true;
	}
	
	
}
