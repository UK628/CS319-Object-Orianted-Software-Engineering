import models.*;

class main {
    public static void main(String[] args) {
        /* 
        File aFile = new File("text", "txt", 1);
        Directory aDirectory = new Directory("myFolder");
        Directory seconDirectory = new Directory("cs319");
        Directory thirdDirectory = new Directory("cs201");

        //Part1
        //Example 1
        System.out.println(aFile.getInfo());
    
        //Example 2
        System.out.println("==========================");
        System.out.println(aDirectory.getInfo());

        //Example 3
        System.out.println("==========================");
        aDirectory.addComponent(aFile);  
        System.out.println(aDirectory.getInfo());

        //Example 4
        System.out.println("==========================");
        seconDirectory.addComponent(aFile);  
        thirdDirectory.addComponent(aFile);
        seconDirectory.addComponent(thirdDirectory);
        aDirectory.addComponent(seconDirectory);
        System.out.print(aDirectory.getInfo());


        //Part2

        //type indication
        System.out.println("==========================");
        DirectoryComponent newDirectory = new TypeIndicationDecorator(aDirectory);
        System.out.print(newDirectory.getInfo());

        //indentation
        System.out.println("==========================");
        DirectoryComponent newDirectory2 = new IndentationDecorator(aDirectory);
        System.out.print(newDirectory2.getInfo());

        //together
        System.out.println("==========================");
        DirectoryComponent newDirectory3 = new TypeIndicationDecorator(new IndentationDecorator(aDirectory));
        System.out.print(newDirectory3.getInfo());

        System.out.println("==========================");
        DirectoryComponent newDirectory4 = new IndentationDecorator(new TypeIndicationDecorator(aDirectory));
        System.out.print(newDirectory4.getInfo());


        //part3
        System.out.println("==========================");
        aDirectory.adjustMemoryRepresentation(1);
        aDirectory.applyMemoryRepresentation();
        aDirectory.adjustMemoryRepresentation(2);
        aDirectory.applyMemoryRepresentation();
        */

        //Part1
        //Example 1
        System.out.println("=============PART1================");
        System.out.println("==================================");
        System.out.println();
        System.out.println("=============Example1=============");

        File fileVideo = new File("video" , "mp4" , 200);
        System.out.println(fileVideo.getInfo());

        // Example 2
        System.out.println("=============Example2=============");
        Directory dirMyDocuments = new Directory("MyDocuments");
        System.out.println(dirMyDocuments.getInfo());


        // Example 3
        System.out.println("=============Example3=============");
        Directory dirFavoriteMusic = new Directory("FavoriteMusic");
        File fileMetallica = new File("MetallicaTheUnforgiven" , "mp3" , 100);

        dirFavoriteMusic.addComponent(fileMetallica);
        System.out.println( dirFavoriteMusic.getInfo());

        // Example 4
        System.out.println("=============Example4=============");
        Directory dirBilkentStuff = new Directory("BilkentStuff");

        File fileInternship = new File("InternshipReport" , "pdf" , 10);
        File fileSetup = new File("setup" , "exe" , 5);
        File fileToDo = new File("ToDoList" , "docx" , 15);

        dirBilkentStuff.addComponent(fileInternship);
        dirBilkentStuff.addComponent(fileSetup);
        dirBilkentStuff.addComponent(fileToDo);
        dirBilkentStuff.addComponent(dirFavoriteMusic);

        System.out.println(dirBilkentStuff.getInfo());

        // Example 5
        System.out.println("=============Example5=============");
        Directory dirPc = new Directory("MyPC");

        dirPc.addComponent(dirMyDocuments);
        dirPc.addComponent(dirBilkentStuff);

        System.out.println( dirPc.getInfo());

        //Part 2
        //Example 6 Indentation 
        System.out.println("=============PART2================");
        System.out.println("==================================");
        System.out.println();
        System.out.println("=============Example6=============");

        DirectoryComponent indentedDir = new IndentationDecorator(dirPc);
        System.out.println(indentedDir.getInfo());
         
        //Example 7 Type Indication
        System.out.println("=============Example7=============");
        DirectoryComponent typeInd = new TypeIndicationDecorator(dirPc);
        System.out.println(typeInd.getInfo());

                 
        //Example 8 Together
        System.out.println("=============Example8=============");
        DirectoryComponent together = new TypeIndicationDecorator(new IndentationDecorator(dirPc)) ;
        System.out.println(together.getInfo());

        
        //Part 3
        //Example 9 Size Based
        System.out.println("=============PART3================");
        System.out.println("==================================");
        System.out.println();
        System.out.println("=============Example9=============");

        dirPc.adjustMemoryRepresentation(1);
        dirPc.applyMemoryRepresentation();

        //Example 10 Type Based
        System.out.println("=============Example10=============");
        dirPc.adjustMemoryRepresentation(2);
        dirPc.applyMemoryRepresentation();
    }
}