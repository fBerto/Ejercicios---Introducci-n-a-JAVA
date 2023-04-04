package org.example;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Main {
    public static void main(String[] args){
        String archivo = "D:\\ejemplo.xlsx";
        LectorExcel lector = new LectorExcel();
        Sheet hoja = lector.leerArchivo(archivo);
        ArrayList<Persona> personas = lector.rrecorrerFilasParaAggPersonas(hoja);
        for (Persona persona: personas) {
            System.out.println(persona.nombre);
            System.out.println(persona.dni);
        }
    }
}