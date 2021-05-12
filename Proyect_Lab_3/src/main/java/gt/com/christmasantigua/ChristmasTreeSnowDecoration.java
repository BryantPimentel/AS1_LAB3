package gt.com.christmasantigua;

import java.util.*;

public class ChristmasTreeSnowDecoration extends AbstractChristmasTreeDecorator {

    public ChristmasTreeSnowDecoration(IchristmasTree christmasTree) {
        super(christmasTree);
        this.addSnowTree(christmasTree);
    }

    public void addSnowTree(IchristmasTree tree) {
          if (tree instanceof ChristmasPlaneTree){        
          System.out.println("Decorando árbol de Platano con Nieve Artificial");
      }
      if (tree instanceof ChristmasLimeTree){        
          System.out.println("Decorando árbol de Tilo con Nieve Artificial");
      }
      if (tree instanceof ChristmasWellingtoniaTree){         
          System.out.println("Decorando árbol de Velintonia con Nieve Artificial");
      }
      if (tree instanceof ChristmasYewTree){         
          System.out.println("Decorando árbol de Tejo con Nieve Artificial");
      }
      
      if (tree instanceof ChristmasSycamoreTree){         
          System.out.println("Decorando árbol de Morera con Nieve Artificial");
      }
    }

}