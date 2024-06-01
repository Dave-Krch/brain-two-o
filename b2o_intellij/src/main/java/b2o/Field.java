package b2o;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Field {
    private List<String> sourceFolderPaths;
    private List<String> directories;
    private List<String> files;

    public Field(List<String> sourceFolderPaths) {
        this.sourceFolderPaths = new ArrayList<>(sourceFolderPaths);
        this.directories = new ArrayList<>();
        this.files = new ArrayList<>();
    }

    public void loadItems() {
        for (String source: sourceFolderPaths) {
            File[] files = new File(source).listFiles();

            if(files == null)
                return;

            for (File file : files) {
                if(file.isDirectory()) {
                    this.directories.add(file.getName());
                }
                else if (file.isFile()) {
                    this.files.add(file.getName());
                }
            }

        }
    }

    public void printItems(){
        System.out.println("Directories:");
        for (String dir: directories) {
            System.out.printf(" %s\n", dir);
        }
        System.out.println("Files:");
        for (String file: files) {
            System.out.printf(" %s\n", file);
        }
    }
}
