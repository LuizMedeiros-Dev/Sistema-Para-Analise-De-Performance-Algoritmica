package com.mycompany.imagemcarregar;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.*;

public class Ordenacao {
    
    static ArrayList<Integer> num = new ArrayList<>();
    public static void numeros(){
        num.clear();
        
        
        Connection conexao = null;
        String url = "jdbc:mysql://localhost:3306/imagem";
        String user = "root";
        String password = "";
        try {
            
            Class.forName("com.mysql.jdbc.Driver");
            conexao = DriverManager.getConnection(url, user, password);
            System.out.println("Conectado com sucesso.");

            String sql = "select codigo from nomes;";
            
            PreparedStatement consulta = conexao.prepareStatement(sql);
            
            ResultSet rs = consulta.executeQuery();
            while (rs.next()) {
               num.add(rs.getInt("codigo")); 
            }
            
           conexao.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }           
    }
    
    
    
    public static void metodoBolha(int[]imagens){  //metodo bolha
        int numeros=imagens.length;
        int aux;

        for(int i=0;i<numeros-1;i++ ){
            for (int j=0;j<numeros-1-i;j++){
                if (imagens[j]>imagens[j+1]){
                    aux=imagens[j];
                    imagens[j]=imagens[j+1];
                    imagens[j+1]=aux;
                }
            }
        }
    }

    public static void insertionSort(int[]numeros){ //metodo de ordenação
        int aux;
        int n=numeros.length;
        int j;

        for (int i=1;i<n;i++){
            aux=numeros[i];
            j=i-1;
            while (j>=0 && aux<numeros[j]){
                numeros[j+1]=numeros[j];
                j--;
            }
            numeros[j+1]=aux;
        }

    }

    public static void quicksort (int[] numeros){
         quick(numeros,0,numeros.length-1);
    }

    public static void quick(int[]numeros,int inicio,int fim){
        if(inicio<fim){
            int pivo= divide(numeros,inicio,fim);
            quick(numeros,inicio,pivo-1);
            quick(numeros,pivo+1,fim);
        }
    }

    public static int divide(int[]numeros,int inicio,int fim){// também é o metodo usado em quicksort
        int pivo=numeros[fim];
        int i=inicio,aux;
        for (int j=inicio;j<fim;j++){
            if (numeros[j]<pivo){
                aux=numeros[i];
                numeros[i]=numeros[j];
                numeros[j]=aux;
                i++;
            }
        }
        numeros[fim]=numeros[i];
        numeros[i]=pivo;
        return i;
    }

    public static String tempo(String escolha, int []numeros){ // calcula o tempo

        int[]vettemporario=numeros.clone();

        long inicio=System.nanoTime();

        switch (escolha.toLowerCase()){
            case "bolha":
                metodoBolha(vettemporario);
                break;
            case "insertion":
                insertionSort(vettemporario);
                break;
            case "quick":
                quicksort(vettemporario);
                break;
            default:
                JOptionPane.showMessageDialog(null,"Metodo Invalido");

        }

        long fim=System.nanoTime();
        long total=fim-inicio;

        double duracao=total/1_000_000_000.0;
        return  String.format("%.3f segundos",duracao);
    }
    
        
}

//    public static void main(String[] args) {
//        // 1. Ler números do banco
//        Ordenacao.numeros();
//
//        // 2. Converter ArrayList para array
//        int[] imagens = new int[Ordenacao.num.size()];
//        for (int i = 0; i < Ordenacao.num.size(); i++) {
//            imagens[i] = Ordenacao.num.get(i);
//        }
//
//        String escolha="insertion";
//
//        String tempototal=tempo(escolha,imagens);
//
//        System.out.println("Tempo de execução (" + escolha + "): " + tempototal + " ms");
//
//        
//
//    }





