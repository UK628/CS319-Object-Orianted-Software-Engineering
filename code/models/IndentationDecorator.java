package models;

public class IndentationDecorator extends DirectoryComponentDecorator {
    public IndentationDecorator(DirectoryComponent component) {
        super(component);
    }

    @Override
    public String getInfo() {
        return addIndentation();
    }

    private String addIndentation2(String[] lines, int index, int numOfTabs, int length) {

        //basecase
        if (index == length) {
            return "";
        }

        if (lines[index].contains("-") && !lines[index].contains("DIRECTORY END")) {
            return addIndentationUtil(lines[index], numOfTabs) + "\n" + addIndentation2(lines, index + 1, numOfTabs + 1, length);
        }

        if (!lines[index].contains("-") && !lines[index].contains("DIRECTORY END")) {
            return addIndentationUtil(lines[index], numOfTabs) + "\n" +addIndentation2(lines, index + 1, numOfTabs, length);
        }

        return addIndentationUtil(lines[index], numOfTabs - 1)  + "\n" + addIndentation2(lines, index + 1, numOfTabs - 1, length);



    }


    private String addIndentation() {
        String[] arr = super.getInfo().split("\n");
        return addIndentation2(arr, 0, 0, arr.length);
    }


    private String addIndentationUtil(String aString, int numOfTabs) {

        String tabs = "";
        while(numOfTabs > 0) {
            tabs += "   ";
            numOfTabs--;
        }

        return tabs + aString;
    }

}
