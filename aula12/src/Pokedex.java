public class Pokedex {
    public static void main(String[] args) throws Exception {
        Eevee e = new Eevee();
        Jolteon j = new Jolteon();

        System.out.println(" --- SOU A EEVEE --- ");
        System.out.println("Ataque: "+e.ataque());
        System.out.println("Defesa: "+e.defesa());
        System.out.println("Especial: "+e.especial());
        System.out.println("\n");

        System.out.println(" --- SOU O JOLTEON ---");
        System.out.println("Ataque: "+j.ataque());
        System.out.println("Defesa: "+j.defesa());
        System.out.println("Especial: "+j.especial());
        System.out.println("\n");
    }
}
