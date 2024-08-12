package models;

public class SizeBased implements StrategyMemoryRepresentation{

    @Override
    public void useMemoryRepresentation(String text) {
        String[] lines = text.split("\n");

        System.out.print("{ ");

        for(int i = 0; i < lines.length; i++) {

            if(lines[i].contains("DIRECTORY END")) {
                System.out.print(" ]");
            }
            else if(lines[i].contains("-")) {
                System.out.print(" [ ");
            }
            else {
                String str = (lines[i].split("File Size:", 2))[1];
                str = str.replaceAll("[^0-9]", "");
                System.out.print(" (" + Integer.parseInt(str) + ") ");
            }

        }

        System.out.println(" }");
    }
    
}
