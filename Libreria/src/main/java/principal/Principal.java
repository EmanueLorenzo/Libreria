package principal;

import excepcion.MiExcepcion;
import menu.Menu;

public class Principal {

    public static void main(String[] args) throws MiExcepcion {
        Menu menu = new Menu();

        menu.interfazPrincipal();
    }
}
