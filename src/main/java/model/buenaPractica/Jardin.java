package model.buenaPractica;

public class Jardin {
    /*
         parametro planta -> nombre de la planta,
         parametro requiereAgua -> determina si la planta necesita agua
    */
    public void regarPlanta(String planta, Boolean requiereAgua) {

        if (requiereAgua) {                       /* Si requiereAgua es verdadero (true) entra en el condicional if */
            System.out.println("Regando la planta:  " + planta);

        } else {                                            /*  Si requiereAgua no es verdadero (es decir, es falso), entra en el condicional else */
            System.out.println("La planta " + planta + " no necesita agua en este momento");
        }

    }


}
