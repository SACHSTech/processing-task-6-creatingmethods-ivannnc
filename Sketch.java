import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(400, 400);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(210, 255, 173);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
  // declare variables
  float floatX;
  float floatY;
  float floatSize = 20;
  int intFaceColour = 0;

  // draw for loop to print out spider
  for(floatX = 40; floatX < 400; floatX += 40) {
    for(floatY = 40; floatY < 400; floatY +=400) {
      intFaceColour += 3;
      floatSize += 10;
      drawFace(floatX, floatY, floatSize, intFaceColour);
      fill(250, 20, 90);
    }
  }

  /**
   * @param floatFaceX
   * @param floatFaceY
   * @param floatFaceSize
   * @param intFaceColour
   */
  
  }

  private void drawFace(float floatFaceX, float floatFaceY, float floatFaceSize, int intFaceColour) {

    // head
    fill(51, 153, 255);
    ellipse(floatFaceX, floatFaceY, floatFaceSize, (float) (floatFaceSize / 1.5));

    // eyes
    fill(255, 255, 255);
    ellipse(floatFaceX - floatFaceSize / 5, floatFaceY - floatFaceY / 30, floatFaceSize / 10, floatFaceSize / 10);
    ellipse(floatFaceX + floatFaceSize / 10, floatFaceY - floatFaceY / 30, floatFaceSize / 10, floatFaceSize / 10);
  }
}
  

    
  

