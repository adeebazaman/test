import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JPanel;

import shapes.*;

/**
 * The entry point for the PolyWhirl program. This class inherits JFrame and acts as a window in the
 * graphical user interface.
 * 
 * You do not need to edit this class for the assignment.
 */
public class PolyWhirl extends JFrame {

  public static final int WINDOW_WIDTH = 720;
  public static final int WINDOW_HEIGHT = 640;

  private Surface surface;

  public PolyWhirl() {
    initUI();
  }

  /**
   * Initializes the graphics window (a JFrame) and adds the drawing surface (a JPanel).
   */
  private void initUI() {
    this.surface = new Surface();
    setTitle("PolyWhirl");
    // set the resolution of the window to be glorious 720p
    setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
    setLocationRelativeTo(null);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    add(this.surface);
  }

  public static void main(String[] args) {

    EventQueue.invokeLater(new Runnable() {
      @Override
      public void run() {
        PolyWhirl polyWhirl = new PolyWhirl();
       // polyWhirl.drawShapes();
        polyWhirl.surface.readAndGenerateShapes();
        polyWhirl.setVisible(true);
      }
    });
  }

  /**
   * The Surface class inherits JPanel and acts as a drawing surface. It is the core of this program
   * and does the following:
   * 
   * -Reads input, creates appropriate instances of shapes, and adds them to the correct list via
   * the readAndGenerateShapes method.
   * 
   * -Manages the lists of shapes and is responsible for rendering them via the drawShapes method.
   * 
   * You are responsible for editing and adding capabilities to this class for the assignment.
   */
  class Surface extends JPanel {

   // List<Crystal> crystals;
    List<Hex> hexagons;
    List<Pent> pentagons;
    List<Quad> quadrilaterals;
    List<Tri> triangles;


    // Add the lists for your shapes below.

    public Surface() {
     // crystals = new ArrayList<Crystal>();
      hexagons= new ArrayList<Hex>();
      pentagons= new ArrayList<Pent>();
      quadrilaterals= new ArrayList<Quad>();
      triangles= new ArrayList<Tri>();


      // initialize your shape lists here.
    }

    @Override
    public void paintComponent(Graphics g) {
      super.paintComponent(g);
      this.drawShapes(g);
      //this.readAndGenerateShapes();
    }

    /**
     * This is where most of your work in this class will be done.
     */
    // TODO: document
    public void readAndGenerateShapes() {
      /*
       * Iterate through reading lines of input. Stop when there is no input left. (You can simulate
       * end of input on the keyboard with ctrl-d).
       */

      /*
       * Create a shape for that line.
       */

      /*
       * Add the shape to a list to be drawn.
       */

      /*
       * Here are some test shapes to show that the system works. Remove them before you turn in
       * your homework. Use the power of the crystals wisely
       *
       */
     // int num;
     // System.out.println("Input the number of vertices and coordinates:");	


      Scanner input= new Scanner(System.in);

       
       

      System.out.println("Input the number of vertices and coordinates: ");
     // String line = input.nextLine();
	 
/*
	
      while (!input.equals("STOP")) {
	     shapes.add(line);

	      System.out.println("Input the number of vertices and coordinates: ");
	      line= input.nextLine();
	*/     

    /*  while ((String line= input.nextLine())>0) {
	      System.out.println("Keep Going!");*/



      if (input.hasNextLine()) {
       String line= input.nextLine();


	String[]array= line.split(" ");
	int[] intArray= new int[array.length];
	for(int i= 0; i< array.length; i++) {
	//	String{} array[i]= line.split(" ");
		intArray[i]= Integer.parseInt(array[i]);
	}


	if(intArray[0] == 3) {
	   this.triangles.add(new Tri(intArray[1], intArray[2]));
	}
	else if(intArray[0] == 4) {
	   this.quadrilaterals.add(new Quad (intArray[1], intArray[2]));
	}
	else if (intArray[0] == 5) {
	   this.pentagons.add(new Pent (intArray[1], intArray[2]));
	}
	else if (intArray[0] == 6) {
	   this.hexagons.add( new Hex(intArray[1], intArray[2]));
	}
	else if (intArray[0] <= 2) {
	   System.out.println( " no shapes");
	}
/*	else {
	   this.crystals.add(new Crystal(intArray[1], intArray[2]));
	}*/
	else {
	   System.out.println("DONE");
	}
    
    }
     


      
      //this.crystals.add(new Crystal(100, 125));
      //this.crystals.add(new Crystal(100, 225));
      //this.crystals.add(new Crystal(200, 125));
    //  this.triangles.add(new Tri( 100,225));
    //  this.quadrilaterals.add(new Quad(200,125));
     // this.pentagons.add(new Pent(100,125));
     // this.hexagons.add(new Hex(200,225));


      // You can stop removing now.
    }

    // TODO: document
    public void drawShapes(Graphics g) {
      // draw background
      // GradientPaint gradient;
      ((Graphics2D) g).setColor(java.awt.Color.WHITE);
      ((Graphics2D) g).fillRect(0, 0, WINDOW_WIDTH, WINDOW_HEIGHT);

    /*  for (Crystal c : this.crystals) {
        c.draw(g);
      }*/
      for (Quad q: this.quadrilaterals){
	q.draw(g);
	}
      for (Pent p: this.pentagons) {
	p.draw(g);
      }
      for (Tri t: this.triangles) {
	t.draw(g);
      }
      for (Hex h: this.hexagons) {
	h.draw(g);
      }



      // Add the loops to draw your shapes below.
    }

  }
}

