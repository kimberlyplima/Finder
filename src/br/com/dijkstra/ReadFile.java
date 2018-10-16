/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.dijkstra;

import java.io.*;
import java.util.*;

/**
 *
 * @author kimberlyplima
 */
public class ReadFile {
    String line;
    String nameFile = "dados.txt";
    List<String[]> content = new LinkedList();
    
    public List<String[]> readFile(){
        try{
            BufferedReader readFile = new BufferedReader(new FileReader(nameFile));
            while((line = readFile.readLine()) != null){
                String[] data = line.split(";");
                content.add(data);
            }
        }
        
        catch(IOException IOException){
            System.out.println("Erro ao ler o arquivo.");
        }
        
        return content;
    }
}
