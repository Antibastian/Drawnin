import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class Drawnin extends PApplet {

// Drawing Program by Antibastian
// Rights Reserved
float stroke = 2;
float currentStroke = 2;
float lineFill = 0;

public void setup()
{
  
  background(200);
}

public void draw()
{

  if(mousePressed)
  {
    mousePressed();
  }
}

public void mousePressed()
{
  stroke(0);
  strokeWeight(stroke);
  line(pmouseX, pmouseY, mouseX, mouseY);
  fill(lineFill);
}

public void keyPressed()
{  
    int keyIndex;
        
    if(keyCode == TAB)
    {
      saveFrame("##.png");
    }
    
    if(keyCode == BACKSPACE)
    {
      clearBackground();
    }
    
    if(keyCode == SHIFT)
    {
      stroke = currentStroke;
    }

    if(key >= '+')
    {
      keyIndex = key-'+';
      stroke++;
    }
    
    if(key >= '_') 
    {
      keyIndex = key-'_';
      stroke = currentStroke;
    }
}

public void clearBackground() 
{
  background(200);
}
  public void settings() {  size(840, 600); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Drawnin" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
