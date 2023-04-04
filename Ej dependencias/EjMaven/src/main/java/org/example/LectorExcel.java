package org.example;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class LectorExcel {
    public ArrayList<Persona> personas=new ArrayList<Persona>();
    public Sheet  leerArchivo(String archivo){
        FileInputStream inputStream = null;
        try {
            inputStream = new FileInputStream(archivo);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        Workbook libro = null;
        try {
            libro = new XSSFWorkbook(inputStream);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Sheet hoja = (Sheet) libro.getSheetAt(0);
        return hoja;
    }
    public ArrayList<Persona> rrecorrerFilasParaAggPersonas(Sheet hoja){
        for (Row fila : hoja) {
            String nombre = fila.getCell(0).getStringCellValue();
            int dni = (int) fila.getCell(1).getNumericCellValue();
            Persona persona = new Persona(nombre,dni);
            this.personas.add(persona);
        }
        return  personas;
    }
}
