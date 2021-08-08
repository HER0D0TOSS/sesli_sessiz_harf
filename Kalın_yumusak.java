
public class Main {

    public static void main(String[] args) {

        char harf ='a';
        
        char[] kalınHarfler = new char[4];
        kalınHarfler[0] = 'a';
        kalınHarfler[1] = 'ı';
        kalınHarfler[2] = 'o';
        kalınHarfler[3] = 'u';

        char[] yumusakHarfler = new char[4];
        yumusakHarfler[0] = 'e';
        yumusakHarfler[1] = 'i';
        yumusakHarfler[2] = 'ö';
        yumusakHarfler[3] = 'ü';

        for (int i = 0; i < 4; i++) {
            if (yumusakHarfler[i] == harf) {
                System.out.println("BU HARF YUMUŞAKTIR");
            }
            else if (kalınHarfler[i] == harf) {
                System.out.println("BU HARF KALINDIR");
            }
        }
    }
}
