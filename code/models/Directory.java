package models;
import java.util.ArrayList;

public class Directory implements DirectoryComponent{
    String directoryName;
    ArrayList<DirectoryComponent> components;
    StrategyMemoryRepresentation strategy;

    public Directory(String directoryName) {
        this.directoryName = directoryName;
        components = new ArrayList<DirectoryComponent>();
    }

    public void adjustMemoryRepresentation(int representation) {

        if(representation == 1) {
            strategy = new SizeBased();
        }
        else if (representation == 2) {
            strategy = new TypeBased();
        }else {
            System.out.println("Invalid representation method!!!!!");
        }
    }

    public void applyMemoryRepresentation() {
        strategy.useMemoryRepresentation(getInfo());
    }


    public boolean addComponent(DirectoryComponent component) {
        return components.add(component);
    }

    public boolean removeComponent(DirectoryComponent component) {
        return components.remove(component);
    }

    public String getInfo() {
        String info = "- " + directoryName + "\n";

        for(int i = 0; i < components.size(); i++) {
            info += components.get(i).getInfo();
        }

        info += "- DIRECTORY END | " + directoryName + "\n";
        return info;
    }
}
