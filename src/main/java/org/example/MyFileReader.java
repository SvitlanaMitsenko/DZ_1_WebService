package org.example;

import java.io.*;

public class MyFileReader {
    private final String fullpath;
    BufferedReader bufferedReader = null;
    public MyFileReader(String innerPath, String fileName) {
        String dirname = System.getProperty("user.dir");
        this.fullpath = dirname + innerPath + File.separator + fileName;
    }
    public String readWithFileReader(){
        String tmp;
        StringBuilder contentXml = new StringBuilder();
        try {
            bufferedReader = new BufferedReader(
                    new FileReader(fullpath));
            while ((tmp = bufferedReader.readLine()) != null) {
                contentXml.append(tmp);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return contentXml.toString();
    }
}
