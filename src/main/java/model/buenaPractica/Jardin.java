package model.buenaPractica;

public class Jardin {

    public void regarPlanta(String planta, Boolean requierePlanta) {
        if (requierePlanta) {
            System.out.println("Regando la planta:  " + planta);
        } else {
            System.out.println("La planta " + planta + " no necesita agua en este momento");
        }
    }
}
