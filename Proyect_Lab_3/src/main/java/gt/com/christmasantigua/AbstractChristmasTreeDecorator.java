package gt.com.christmasantigua;

import java.util.*;

public abstract class AbstractChristmasTreeDecorator implements IchristmasTree {
    
    protected IchristmasTree christmasTree;
    public AbstractChristmasTreeDecorator(IchristmasTree christmasTree) {
        this.christmasTree= christmasTree;
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

}