import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Wall implements Structure {
    private List<Block> blocks;

    public Wall(List<Block> blocks) {
        this.blocks = blocks;
    }

    public Optional<Block> findBlockByColor(String color) {
        for (Block block : blocks) {
            if (block instanceof CompositeBlock) {
                for (Block innerBlock : ((CompositeBlock) block).getBlocks()) {
                    if (innerBlock.getColor().equals(color)) {
                        return Optional.of(innerBlock);
                    }
                }
            } else if (block.getColor().equals(color)) {
                return Optional.of(block);
            }
        }
        return Optional.empty();
    }

    public List<Block> findBlocksByMaterial(String material) {
        List<Block> result = new ArrayList<>();
        for (Block block : blocks) {
            if (block instanceof CompositeBlock) {
                for (Block innerBlock : ((CompositeBlock) block).getBlocks()) {
                    if (innerBlock.getMaterial().equals(material)) {
                        result.add(innerBlock);
                    }
                }
            } else if (block.getMaterial().equals(material)) {
                result.add(block);
            }
        }
        return result;
    }

    public int count() {
        int count = 0;
        for (Block block : blocks) {
            if (block instanceof CompositeBlock) {
                count += ((CompositeBlock) block).getBlocks().size();
            } else {
                count++;
            }
        }
        return count;
    }

}