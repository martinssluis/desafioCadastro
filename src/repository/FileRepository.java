package repository;

import java.io.*;


public class FileRepository {

            File directory = new File("data");
            boolean isDerectoryCreated = directory.mkdir();


            File file = new File(directory, "formulario.txt"); // espera uma String, por isso a conversão
            public void createFile(){
                // converte para caminho absoluto

                try(FileWriter fw = new FileWriter(file);
                    BufferedWriter bw = new BufferedWriter(fw)){
                    bw.write("1 - Qual o nome e sobrenome do pet?\n2 - Qual o tipo do pet (Cachorro/Gato)\n3 - Qual o sexo do animal?\n4 - Qual endereço e bairro que ele foi encontrado?\n5 - Qual a idade aproximada do pet?\n6 - Qual o peso aproximado do pet?\n7 - Qual a raça do pet??");
                    bw.flush();

                } catch (IOException ex){
                    ex.printStackTrace();
                }
            }

            public void readFile(){
                try(FileReader fr = new FileReader(file);
                    BufferedReader br = new BufferedReader(fr)){

                    String line;

                    while ((line = br.readLine()) != null){
                        System.out.println(line);
                    }
                }catch (IOException ex){
                    ex.printStackTrace();
                }
            }
}
