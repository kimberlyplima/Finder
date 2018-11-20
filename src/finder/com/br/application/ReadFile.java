/*
 * Classname		ReadFile
 * Version information	x.x.xx
 * Date                 17/11/2018 13:03
 * Author               Kimberly P. Lima
 * Copyright notice     Esta classe implementa o método readFile, responsável
 *                      ler o conteúdo do arquivo "dados.txt" e atribuí-lo a
 *                      uma lista de conteúdo, que será utilizada mais tarde
 *                      para a criação dos workers (profissionais).
 */
package finder.com.br.application;

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
