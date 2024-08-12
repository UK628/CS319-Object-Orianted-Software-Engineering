package models;

public class TypeIndicationDecorator extends DirectoryComponentDecorator{

    public TypeIndicationDecorator(DirectoryComponent component) {
        super(component);
    }

    @Override
    public String getInfo() {
        return addTypeIndication();
    }
    
    private String addTypeIndication() {
        String oString = super.getInfo();
        String[] lines = oString.split("\n");
        String typedString = "";


        for(int i = 0; i < lines.length; i++) {
            
            if(lines[i].contains("DIRECTORY END")) {
                typedString += "(!) " + lines[i] + "\n";
            }
            else if(lines[i].contains("-")) {
                typedString += "(d) " + lines[i] + "\n";
            }
            else {
                typedString += "(f) " + lines[i] + "\n";
            }

        }

        return typedString;
    }

    

}
