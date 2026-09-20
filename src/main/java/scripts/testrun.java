package scripts;

import godot.annotation.Script;
import godot.api.Node2D;
import godot.global.GD;

@Script
public class testrun extends Node2D{
	@Override 
	public void _ready(){
	GD.print("Hello from hjav");
	}
}
