package models;

public class File implements DirectoryComponent{

    String fileName;
    String extension;
    int fileSize;

    public File(String fileName, String extension, int fileSize) {
        this.fileName = fileName;
        this.extension = extension;
        this.fileSize = fileSize;
    }

    public String getInfo() {

        return fileName + "." + extension + " | File Size: " + fileSize + " kb \n";
    }
}
