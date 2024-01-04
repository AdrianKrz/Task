import java.util.List;

public class ComplexBlock implements CompositeBlock {
    private List<Block> blocks;

    public ComplexBlock(List<Block> blocks) {
        this.blocks = blocks;
    }

    public List<Block> getBlocks() {
        return blocks;
    }

    public String getColor() {
        return "ComplexBlock nie ma jednolitego koloru";
    }

    public String getMaterial() {
        return "ComplexBlock nie ma jednolitego materiału";
    }
}