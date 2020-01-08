package org.hala.exceptions_demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Reader {
    public static List<String> read(String url){
        BufferedReader reader = null;
        try {
            reader = Files.newBufferedReader(Paths.get(url));
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            if(reader != null){
                try{
                    reader.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
        }
        return (List<String>) reader;
    }
}
