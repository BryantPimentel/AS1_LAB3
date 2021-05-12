package gt.com.christmasantigua;

import java.util.*;

public class ChristmasTreeFacade {
    private List<IchristmasTree> treesList;
    public ChristmasTreeFacade() {
        ChristmasTreeFactory christmasTreeFactory = new ChristmasTreeFactory();
        this.treesList = new ArrayList();
        this.treesList.add(christmasTreeFactory.getChristmasTree(kindChristmasTree.LIME));
        this.treesList.add(christmasTreeFactory.getChristmasTree(kindChristmasTree.PLANE));
        this.treesList.add(christmasTreeFactory.getChristmasTree(kindChristmasTree.SYCAMORE));
        this.treesList.add(christmasTreeFactory.getChristmasTree(kindChristmasTree.WELLINGTONIA));
        this.treesList.add(christmasTreeFactory.getChristmasTree(kindChristmasTree.YEW));
    }


    public void ChristmasDecoratorTreess() {
        ChristmasTreeDecoratorFactory decoradorFactory = new ChristmasTreeDecoratorFactory();
        
        for (IchristmasTree christmatree: this.treesList){
           
            AbstractChristmasTreeDecorator treDecoratorLights = decoradorFactory.getChristmasDecoratorTree("Lights", christmatree);
            AbstractChristmasTreeDecorator treDecoratorBall = decoradorFactory.getChristmasDecoratorTree("Ball", christmatree);
            AbstractChristmasTreeDecorator treDecoratorGifts = decoradorFactory.getChristmasDecoratorTree("Gifts", christmatree);
            AbstractChristmasTreeDecorator treDecoratorSnow = decoradorFactory.getChristmasDecoratorTree("Snow", christmatree);
            AbstractChristmasTreeDecorator treDecoratorDolls = decoradorFactory.getChristmasDecoratorTree("Dolls", christmatree);
        }
    }

}