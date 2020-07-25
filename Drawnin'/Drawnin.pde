// Drawing Program by Antibastian
// Rights Reserved
float stroke = 2;
float currentStroke = 2;
float lineFill = 0;

void setup()
{
  size(840, 600);
  background(200);
}

void draw()
{

  if(mousePressed)
  {
    mousePressed();
  }
}

void mousePressed()
{
  stroke(0);
  strokeWeight(stroke);
  line(pmouseX, pmouseY, mouseX, mouseY);
  fill(lineFill);
}

void keyPressed()
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

void clearBackground() 
{
  background(200);
}
