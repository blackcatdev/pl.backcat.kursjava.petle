package pl.blackcat.kursjava.petle;

public class temperature {

    public static void main(String[] args) {
        int temperature = 35;
        //VER1: sprawdzanie switcha, czy zachowuje się podobnie do C++
        //VER2: naprawa prostego pliku
        switch (temperature) {
            case 35 : {
                System.out.println("Jesteś bardzo osłabiony!");
                break;
            }
            case 36 : {
                System.out.println("Jesteś niezbyt osłabiony!");
                break;
            }
            case 37 : {
                System.out.println("Masz stan podgorączkowy!");
                break;
            }
            case 38 : {
                System.out.println("Masz gorączkę!");
                break;
            }
            case 39 : {
                System.out.println("Masz wysoką gorączkę!");
                break;
            }
            default : {
                System.out.println("Temperatura poza skalą, natychmiast biegnij do lekarza lub kup nowy termometr. :>");
                break;
            }
        }


    }
}