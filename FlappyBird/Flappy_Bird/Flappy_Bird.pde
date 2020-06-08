int pipeGap = 200;
int x = 100;
  int y = 450;
  int X = 500;
  int upperPipeHeight = (int) random(100, 400);
  int birdYVelocity = 85;
  int gravity = 3;
  int lowerY = upperPipeHeight + pipeGap;
  int xPOsition = 10;
  int yPOsition = 20;
  int score = 0;

  boolean intersectsPipes() { 
         if (y < upperPipeHeight && x > X && x < (X+150)){
            return true; }
        else if (y>lowerY && x > X && x < (X+150)) {
            return true; }
        else { return false; }
        
  }
  void setup() {
    size(500, 900);
  }

  void draw() { 
    if(intersectsPipes() == true){
   background(0, 0, 255);
   textSize(20);
  text("Game Over! Your Score was " + score + "!" , 100, 500);
}
   else{
    background(0, 0, 255);
  fill(255, 255, 0);
  stroke(0, 0, 0);
  ellipse(x, y, 50, 50);
  y = y + gravity;
  fill(30, 255, 0);
  rect(X, 0, 150, upperPipeHeight);
    fill(30, 255, 0);
  rect(X, lowerY, 150, 900 - lowerY);
  X = X - 5;
  teleportPipes();
  if(X == 20 && intersectsPipes() == false){
  score = score + 1;
  }
  textSize(25);
  text(score, xPOsition, yPOsition); 
 }
  }
  void mousePressed() {
  y = y - birdYVelocity;
  }
  
  void teleportPipes() {
   if(X < -151){
     X = 505; 
       upperPipeHeight = (int) random(100, 500);
lowerY = upperPipeHeight + pipeGap;
   }
  }
