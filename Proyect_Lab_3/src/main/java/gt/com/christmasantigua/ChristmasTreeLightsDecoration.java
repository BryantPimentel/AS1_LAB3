package gt.com.christmasantigua;

import java.util.*;

public class ChristmasTreeLightsDecoration extends AbstractChristmasTreeDecorator {

    public ChristmasTreeLightsDecoration(IchristmasTree christmasTree) {
        super(christmasTree);
        make();
        place();
        this.addLightsTree(christmasTree);
        
        
    }
    @Override
    public void make() {
        // TODO implement here
        christmasTree.make();
    }

    @Override
    public void place() {
        // TODO implement here
        christmasTree.place();
    }


    public void addLightsTree(IchristmasTree tree) {
      if (tree instanceof ChristmasPlaneTree){        
          System.out.println("Decorando árbol de Platano con Luces de navidad");
      }
      if (tree instanceof ChristmasLimeTree){        
          System.out.println("Decorando árbol de Tilo con Luces de navidad");
      }
      if (tree instanceof ChristmasWellingtoniaTree){         
          System.out.println("Decorando árbol de Velintonia con Luces de navidad");
      }
      if (tree instanceof ChristmasYewTree){         
          System.out.println("Decorando árbol de Tejo con Luces de navidad");
      }
      
      if (tree instanceof ChristmasSycamoreTree){         
          System.out.println("Decorando árbol de Morera con Luces de navidad");
      }
    }

}