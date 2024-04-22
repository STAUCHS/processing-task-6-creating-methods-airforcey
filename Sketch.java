import processing.core.PApplet;

public class Sketch extends PApplet {
  public static void main(String[] args) {
    PApplet.main("Sketch");
  }

  public void settings() {
    size(600, 600);
  }

  public void setup() {
    background(0, 255 ,0);
    drawSketches();
  }

  /**
  * Draws circles vertically and horizontally.
  *
  * @param size of the sketches that are displayed
  * @param spacing between each sketch on the screen
  */
  public void drawSketches() {
    int spacing = 85;
    int numHorizontal = width / (spacing + 85);
    int numVertical = height / (spacing + 85);

      for (int i = 0; i < numHorizontal; i++) {
        for (int j = 0; j < numVertical; j++) {
            drawSketches(i * (spacing + 127), j * (spacing + 127), 85);
      }
    }
  }

  /**
  * The sketch
  *
  * @param x coordinate
  * @param y coordinate
  * @param size
  */
  public void drawSketches(int x, int y, int size) {
    // Draw face
    ellipseMode(CENTER);
    fill(255, 0, 0);
    ellipse(x + size / 2, y + size / 2, size, size);

      // Draw eyes
      fill(255, 255, 0);
      ellipse(x + size / 3, y + size / 3, size / 7, size / 7);
      ellipse(x + 2 * size / 3, y + size / 3, size / 7, size / 7);

      // Draw mouth
      noFill();
      strokeWeight(1);
      ellipse(x + 2 * size / 4, y + size / 2, size / 4, size / 4);
    }
}

