package org.example;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.lang3.StringUtils;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        ObjectMapper mapeador = new ObjectMapper();

        Persona Juancho = new Persona("Juancho",25,"Podio");

        try {
            String personaMapeada = mapeador.writeValueAsString(Juancho);
            System.out.println(personaMapeada);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        String cadena = "Hola mundo!";
        String mayusculas = StringUtils.upperCase(cadena);
        System.out.println(mayusculas);

    }
}