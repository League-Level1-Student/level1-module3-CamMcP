
public class Code {
	int x = 100;
	int y = 450;
	int X = 500;
	int upperPipeHeight = (int) random(100, 400);
	int birdYVelocity = 150;
	int gravity = 3;
	void setup() {
	  size(500, 900);
	}

	void draw() { 
	  background(0, 0, 255);
	fill(255, 255, 0);
	stroke(0, 0, 0);
	ellipse(x, y, 50, 50);
	y = y + gravity;
	fill(30, 255, 0);
	rect(X, 0, 150, 500);
	X = X - 5;
	teleportPipes();
	}
	void mousePressed() {
	y = y - birdYVelocity;
	}

	void teleportPipes() {
	 if(X < -151){
	   X = 505; 
	 }
	}
}
