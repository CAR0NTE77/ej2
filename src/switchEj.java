public class switchEj {
    public static void main(String[] args) {
        String estacion = "Otoño";

        switch (estacion){
            case "Primavera":
                System.out.println("Es Primavera, una de las mejores estaciones del año, a disfrutar del dia en el parque");
                break;
            case "Verano":
                System.out.println("Es Verano, que calor!!! a beber cervezas heladas y disfrutar en la piscina");
                break;
            case "Otoño":
                System.out.println("Es Otoño, una de las mejores estaciones del año, a disfrutar del dia con las mascotas");
                break;
            case "Invierno":
                System.out.println("Es Invierno, a tomar chocolatada caliente y ver peliculas");
                break;
            default:
                System.out.println("Esta estacion no existe");
        }
    }
}
