package gt.com.christmasantigua;

import java.util.*;

public class ChristmasTreeGiftsDecoration extends AbstractChristmasTreeDecorator {

    public ChristmasTreeGiftsDecoration(IchristmasTree christmasTree) {
        super(christmasTree);
       this.addGiftsTree(christmasTree);
    }

    public void addGiftsTree(IchristmasTree tree) {
         if (tree instanceof ChristmasPlaneTree){        
          System.out.println("Decorando árbol de Platano con Regalos abajo");
      }
      if (tree instanceof ChristmasLimeTree){        
          System.out.println("Decorando árbol de Tilo con Regalos abajo");
      }
      if (tree instanceof ChristmasWellingtoniaTree){         
          System.out.println("Decorando árbol de Velintonia con Regalos abajo");
      }
      if (tree instanceof ChristmasYewTree){         
          System.out.println("Decorando árbol de Tejo con Regalos abajo");
      }
      
      if (tree instanceof ChristmasSycamoreTree){         
          System.out.println("Decorando árbol de Morera con Regalos abajo");
      }
    }

}