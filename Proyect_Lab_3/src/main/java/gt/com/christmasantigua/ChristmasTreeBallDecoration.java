package gt.com.christmasantigua;

import java.util.*;

public class ChristmasTreeBallDecoration extends AbstractChristmasTreeDecorator {

    public ChristmasTreeBallDecoration(IchristmasTree christmasTree) {
        super(christmasTree);
        this.addBallTree(christmasTree);
    }

    public void addBallTree(IchristmasTree tree) {
         if (tree instanceof ChristmasPlaneTree){        
          System.out.println("Decorando árbol de Platano con Pelotas de colores  de navidad");
      }
      if (tree instanceof ChristmasLimeTree){        
          System.out.println("Decorando árbol de Tilo con Pelotas de colores de navidad");
      }
      if (tree instanceof ChristmasWellingtoniaTree){         
          System.out.println("Decorando árbol de Velintonia con Pelotas de colores de navidad");
      }
      if (tree instanceof ChristmasYewTree){         
          System.out.println("Decorando árbol de Tejo con Pelotas de colores de navidad");
      }
      
      if (tree instanceof ChristmasSycamoreTree){         
          System.out.println("Decorando árbol de Morera con Pelotas de colores de navidad");
      }
    }

}