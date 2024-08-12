package models;

public class TypeBased implements StrategyMemoryRepresentation{

    @Override
    public void useMemoryRepresentation(String text) {
        String[] lines = text.split("\n");
        String typeBased = "{ ";
        typeBased += addTypeRepresentation(lines, 0, 0, lines.length);
        typeBased += "} ";

        System.out.println(typeBased);
    }
    
    private String addTypeRepresentation(String[] lines, int index, int depth, int length) {

        //basecase
        if (index == length) {
            return "";
        }

        if (lines[index].contains("-") && !lines[index].contains("DIRECTORY END")) {
            return "[D" + depth + " " + addTypeRepresentation(lines, index + 1, depth + 1, length);

        }

        if (!lines[index].contains("-") && !lines[index].contains("DIRECTORY END")) {
            return " (F) "+ addTypeRepresentation(lines, index + 1, depth, length);
        }

        return " EOD" + (depth - 1) + "] " + addTypeRepresentation(lines, index + 1, depth - 1, length);
    }

}
