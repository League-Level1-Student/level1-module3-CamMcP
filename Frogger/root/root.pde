int x = 400;
int y = 580;
Car c1 = new Car(799, 200, 100, 2);
Car c2 = new Car(799, 400, 100, 2);
void setup(){
  size(800, 600);
}


void draw(){
  background(65,55,55);
  fill(0, 185, 0);
ellipse(x, y, 40, 40);
method();
c1.display();
c2.display();
c1.speed();
c2.speed();
}


void keyPressed(){
    if(key == CODED){
        if(keyCode == UP)
        {
            y = y - 10;
        }
        else if(keyCode == DOWN)
        {
            y = y + 10;        
          }
        else if(keyCode == RIGHT)
        {
            x = x + 10;
        }
        else if(keyCode == LEFT)
        {
            x = x - 10;
        }
    }
}


void method(){
  if(x > 780){
    x = 779;
  }
  else if(x < 20){
    x = 21;
  }
  else if(y > 580){
    y = 579;
  }
  else if(y < 20){
    y = 21;
  }
}


class Car{
int carX;
int carY;
int size;
int speed;
public Car(int carX, int carY, int size, int speed){
  this.carX = carX;
  this.carY = carY;
  this.size = size;
  this.speed = speed;
}
void display()
  {
    fill(150, 5, 5);
    rect(carX , carY,  size, 50);
  }
  void speed(){
    carX = carX - speed;
    if (carX < -100){
    carX = 799;
    }
  }
}
