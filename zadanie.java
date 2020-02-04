public class zadanie {
    public static void main(String[] args) {
        System.out.println("Zadanie 1 :");
        System.out.println("******************");
        System.out.println("Siemaneczko wszystkim !");
        System.out.println("******************");
        System.out.println("Zadanie 2 :");
        System.out.println("******************");
        String[] table = {"Styczeń", "Luty", "Marzec", "Kwiecień", "Maj", "Czerwiec", "Lipiec","Sierpień", "Wrzesień", "Październik", "Listopad", "Grudzień"};
        for(int i = 0; i < table.length; i++){
            System.out.println(table[i]);
        }
        System.out.println("******************");
        System.out.println("Zadanie 3 :");
        System.out.println("******************");
        for(int f = 0; f < table.length; f++) {
            if (table[f].length() >= 4) {
                System.out.println(table[f]);
            }
        }
        System.out.println("******************");
    }
}
