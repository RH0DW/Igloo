package mx.itson.igloo.negocio;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Rodolfo
 */
public class Generacion {
    
    //Generacion de la curp en orden
    
    /**
     * Toma Los 2 primeros caractéres de una cadena.
     * @param Texto El texto de donde se toman los caractéres.
     * @return Los 2 primeros caracteres.
     */
    public String getFirstTwoCharacters(String texto){
        char[] letras = texto.toCharArray();        
        return "" + letras[0] + letras[1];
    }
    /**
     * Toma El primer caractér de una cadena.
     * @param Texto El texto de donde se toma el primer caractér.
     * @return El primer caractér de la cadena.
     */
    public String getFirstCharacter (String texto){
        
        if (texto.length() == 0){
            return "X";
        }
        char[] letras = texto.toCharArray();
        return "" + letras[0];
    }
    /**
     * Verifica y ordena los datos de la fecha de nacimineto.
     * @param dia El dato del dia de naciminto.
     * @param mes El dato del mes de naciminto.
     * @param year El dato del año de naciminto.
     * @return Una cadena de numeros para la curp.
     */
    public String juntarFecha (String dia, String mes, String year){
        
        String fecha = "";
        
        if (year.length() == 4){
            char[] numeros = year.toCharArray();
            fecha = fecha + numeros[2] + numeros[3];
        } else if (year.length() < 2){
            return "";
        } else if (year.length() > 2){
            return "";     
        } else {
            fecha = year;
        }
            
        if (mes.length() > 2){
            return "";           
        } else if (mes.length() < 2){
            fecha = fecha + "0" + mes;
        } else {
            fecha = fecha + mes;
        }
        
        if (dia.length() > 2){
            return "";           
        } else if (dia.length() < 2){
            fecha = fecha + "0" + dia;
        } else {
            fecha = fecha + dia;
        }            
        return fecha;     
    }
    /**
     * Toma La primera consonante valida de una cadena.
     * @param texto El texto de donde se toma la primera consonante valida.
     * @return La primer consonante validad de la cadena.
     */
    public String primeraConsonanteValida (String texto){
        if (texto.length() == 0){
            return "X";
        }               
        String consonante = texto.replace("A","").replace("Á","").replace("E","").replace("É","").replace("I","").replace("Í","").replace("O","").replace("Ó","").replace("U","").replace("Ú","");
        char[] letras = consonante.toCharArray();
        if (texto.startsWith("A")||texto.startsWith("Á")||texto.startsWith("E")||texto.startsWith("É")||texto.startsWith("I")||texto.startsWith("Í")||texto.startsWith("O")||texto.startsWith("Ó")||texto.startsWith("U")||texto.startsWith("Ú")){
            return "" + letras [0];
        }
        return "" + letras[1];        
    }
    /**
     * Verifica el año de nacimineto 
     * @param year El año de nacimineto.
     * @return Un valor "0" para personas que nacieron antes de 1999 y "A" para 
     * personas del 2000 en adelante.
     */
    public String verificarYear (String year){
        if (year.length() == 2){
            return "";
        }else if (year.length() == 4){
            int a = Integer.parseInt(year);
            if(a < 2000){
                return "0";
            }
            return "A";
            
        }else{
            return "";
        }                
    }   
}
