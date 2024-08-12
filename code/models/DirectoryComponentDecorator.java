package models;

public class DirectoryComponentDecorator implements DirectoryComponent{

    DirectoryComponent component;

    public DirectoryComponentDecorator(DirectoryComponent component) {
        this.component = component;
    }
    
    @Override
    public String getInfo() {
        return component.getInfo();
    }
}
