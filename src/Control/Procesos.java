/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Modelo.Transporte;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Stuwar Giron Garcia
 */
public class Procesos {
    
    String ruta = "E:\\ING SISTEMAS\\JAVA\\ExamenParcial\\transporte.txt";
    Transporte objTr = new Transporte();
    FileReader fr;  //lector de archivos
    BufferedReader br;    //recepctor de memoria
    FileWriter fw;        //escribir
    File f;
    
    public ArrayList<Transporte> lista = new ArrayList<>();
    
    //Metodo para crear la tabla
    public void agregar(Transporte t) throws FileNotFoundException, IOException {

        fw = new FileWriter(ruta, true);
        String cad = t.getNPlaca()+ "-" + t.getCol() + "-" + t.getMod() + "-" + t.getDest() + "-" + t.getNPasajeros()
                + "-" + t.PrecioPasje()+ "-" + t.PrecioCombustible()+ "-" +t.montoRecaudado() +"-" +t.Ganancias();
        fw.write(cad);
        fw.write(13); //hace un salto de linea
        fw.close();
    }
    
    //Leer
    public void leer() throws FileNotFoundException, IOException {
        lista.clear();     //Limpiar arrayList 0 elementos
        fr = new FileReader(ruta);
        br = new BufferedReader(fr);
        String cad = br.readLine(); // Leer linea = readLine
        String[] vec;
        while (cad != null) {
            vec = cad.split("-");  //separar la cadena en un vector
            objTr = new  Transporte(vec[0], vec[1],(vec[2]),vec[3] ,Integer.parseInt(vec[4]));
            lista.add(objTr);   //agregar elementos al arrayList
            cad = br.readLine();
        }
        fr.close();
    }
}
