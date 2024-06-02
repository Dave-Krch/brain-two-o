package main;

import b2o.Field;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class MainSuite {

    @Test
    public void firstTest() {
        List<String> sourceFolders = new ArrayList<String>();
        sourceFolders.add("D:\\Code\\Java\\brain-two-o\\field");
        Field field = new Field(sourceFolders);

        field.loadItems();
        field.printItems();
    }

}
