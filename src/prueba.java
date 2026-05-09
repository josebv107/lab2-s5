public class prueba {
    public static void main() {
        PatoReal p1 = new PatoReal();
        SuperDrone d1 = new SuperDrone();
        AdaptadorPato adaptadorPato = new AdaptadorPato(d1);

        System.out.println("El dron hace...");
        d1.beep();
        d1.girarRotor();
        d1.despegar();

        System.out.println("\nEl pato hace...");
        testPato(p1);

        //Aquí aplicamos el patrón adapter
        System.out.println("\nEl AdaptadorPato hace...");
        testPato(adaptadorPato);
    }

    static void testPato(Pato pato) {
        pato.cuaquear();
        pato.volar();
    }
}
