import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        TestBlock block1 = new TestBlock("red", "wood");
        TestBlock block2 = new TestBlock("blue", "steel");
        TestBlock block3 = new TestBlock("red", "steel");

        List<Block> compositeBlocks = new ArrayList<>();
        compositeBlocks.add(block1);
        compositeBlocks.add(block2);
        ComplexBlock complexBlock = new ComplexBlock(compositeBlocks);

        List<Block> wallBlocks = new ArrayList<>();
        wallBlocks.add(block1);
        wallBlocks.add(block2);
        wallBlocks.add(block3);
        wallBlocks.add(complexBlock);

        Wall wall = new Wall(wallBlocks);

        System.out.println("Blok o kolorze czerwonym: " + wall.findBlockByColor("red"));
        System.out.println("Bloków o materiale 'steel': " + wall.findBlocksByMaterial("steel"));
        System.out.println("Liczba bloków w ścianie: " + wall.count());
    }
}