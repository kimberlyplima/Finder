/*
 * Classname		(nome da classe)
 * Version information	(versionamento)
 * Date                 (data e hora)
 * Author               (autor)
 * Copyright notice     (descrição detalhada da classe e métodos)
 */
package br.com.finder;

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
