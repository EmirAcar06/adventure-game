/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package maceraoyunu2;

public class SafeHouse extends NormalLoc {

	SafeHouse(Player player) {
		super(player, "Güvenli Ev");
	}
	
	public boolean getLocation() {
		player.setHealthy(player.getrHealthy());
		System.out.println("Ýyileþtiniz...");
		System.out.println("Þuan Güvenli Ev adlý yerdesiniz.");
		return true;
	}

}
