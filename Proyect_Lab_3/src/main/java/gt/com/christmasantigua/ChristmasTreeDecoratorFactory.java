package gt.com.christmasantigua;

import java.util.*;

public class ChristmasTreeDecoratorFactory {

    public ChristmasTreeDecoratorFactory() {
    }

    public AbstractChristmasTreeDecorator getChristmasDecoratorTree(String treeDecoratorType, IchristmasTree christmas) {
         switch(treeDecoratorType){
           case "Lights": return new ChristmasTreeLightsDecoration(christmas);
           case "Ball": return new ChristmasTreeBallDecoration(christmas);
           case "Gifts": return new ChristmasTreeGiftsDecoration(christmas);
           case "Snow": return new ChristmasTreeSnowDecoration(christmas);
           case "Dolls": return new ChristmasDollsDecoration(christmas);
           default: return null;
       }
    }

}