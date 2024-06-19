import processing.core.PApplet;

public class Sketch extends PApplet {
  public static void main(String[] args) {
    PApplet.main("Sketch");
  }

  public void settings() {
    size(600, 600);
  }

  public void setup() {
    background(128, 128 ,128);
    drawSketches();
  }

  /**
  * Draws circles vertically and horizontally.
  * @param size of the sketches that are displayed
  * @param spacing between each sketch on the screen
  */

  public void drawSketches() {
    
    int spacing = 75;
    int horizontal = width / (spacing + 40);
    int vertical = height / (spacing + 40);

      for (int i = 0; i < horizontal; i++) {
        for (int j = 0; j < vertical; j++) {
            drawSketches(i * (spacing + 167), j * (spacing + 167), 85);
      }
    }
  }

  /**
  * flower sketch 
  *
  * @param flowerX 
  * @param flowerY
  * @param petalSize
  */

  public void drawSketches(int flowerX, int flowerY, int petalSize) {
// upper-left petal
ellipse(flowerX - 50, flowerY - 50,
  petalSize, petalSize);

// upper-right petal
ellipse(flowerX + 50, flowerY - 50,
  petalSize, petalSize);

// lower-left petal
ellipse(flowerX - 50, flowerY + 50,
  petalSize, petalSize);

// lower-right petal
ellipse(flowerX + 50, flowerY + 50,
  petalSize, petalSize);

// center petal
fill(255, 0, 0);
ellipse(flowerX, flowerY,
petalSize, petalSize);

  }
}

