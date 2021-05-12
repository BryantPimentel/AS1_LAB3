package gt.com.christmasantigua;

import java.util.*;

public class ChristmasDollsDecoration extends AbstractChristmasTreeDecorator {

    public ChristmasDollsDecoration(IchristmasTree christmasTree) {
         super(christmasTree);
         this.addLDollsTree(christmasTree);
    }

    public void addLDollsTree(IchristmasTree tree) {
       if (tree instanceof ChristmasPlaneTree){        
          System.out.println("Decorando árbol de Platano con Muñecos de navidad");
      }
      if (tree instanceof ChristmasLimeTree){        
          System.out.println("Decorando árbol de Tilo con Muñecos de navidad");
      }
      if (tree instanceof ChristmasWellingtoniaTree){         
          System.out.println("Decorando árbol de Velintonia con Muñecos de navidad");
      }
      if (tree instanceof ChristmasYewTree){         
          System.out.println("Decorando árbol de Tejo con Muñecos de navidad");
      }
      
      if (tree instanceof ChristmasSycamoreTree){         
          System.out.println("Decorando árbol de Morera con Muñecos de navidad");
      }
    }

}