/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class TextModel {
    private List<String> lines;
    public TextModel(){
        lines = new ArrayList<>();
    }
    public List<String> getline(){
        return lines;
    }
    // Loadfile lên
    public void loadFile(String file){
        try(BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while((line = br.readLine()) != null){ // nếu có dữ liệu thì đọc dữ liệu lên
                lines.add(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    // lưu file xuống
    public void saveFile(String file){
        try (BufferedWriter wr = new BufferedWriter(new FileWriter(file))){
           for(String line : lines){
               wr.write(line);
               wr.newLine();
           }
        } catch (Exception e) {
           e.printStackTrace();
        }
    }
     public void addLine(String line){
        lines.add(line);
    }
     public void dequy(File directory){
         if(directory.isDirectory()){
             File[] files = directory.listFiles();
             if(files != null){
                 for(File file : files){
                     if(file.isDirectory()){
                         dequy(directory);
                     }else{
                         System.out.println(file.getAbsoluteFile());
                     }
                 }
             }
         }
     }
}
