package repository;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class FileRepository {

            File directory = new File("data");
            boolean isDerectoryCreated = directory.mkdir();


            public void createFile(){
                // converte para caminho absoluto
                File file = new File(directory, "formulario.txt"); // espera uma String, por isso a conversão

                try(FileWriter fw = new FileWriter(file);
                    BufferedWriter bw = new BufferedWriter(fw)){
                    bw.write("1 - Qual o nome e sobrenome do pet?\n2 - Qual o tipo do pet (Cachorro/Gato)\n3 - Qual o sexo do animal?\n4 - Qual endereço e bairro que ele foi encontrado?\n5 - Qual a idade aproximada do pet?\n6 - Qual o peso aproximado do pet?\n7 - Qual a raça do pet??");
                    bw.flush();

                } catch (IOException ex){
                    ex.printStackTrace();
                }
                System.out.println("Diretorio criado: "+isDerectoryCreated);
                System.out.println("Deu certo!");
            }
}
