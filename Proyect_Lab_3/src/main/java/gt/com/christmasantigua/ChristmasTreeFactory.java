package gt.com.christmasantigua;

import java.util.*;

public class ChristmasTreeFactory {

    public ChristmasTreeFactory() {
    }

    public IchristmasTree getChristmasTree(kindChristmasTree christmastreeType) {
         switch(christmastreeType){
           case PLANE: return new ChristmasPlaneTree();
           case SYCAMORE: return new ChristmasSycamoreTree();
           case LIME: return new ChristmasLimeTree();
           case WELLINGTONIA: return new ChristmasWellingtoniaTree();
           case YEW: return new ChristmasYewTree();
           default: return null;
       }
    }

}