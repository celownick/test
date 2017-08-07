package src.main.Exercises;

/**
 * Created by kcabaj on 14-Jul-17.
 */
 public class String_Object_Exploration {
    public static void main(String[] args) {

        String popular_thopic = "Selenium Web Driver";
        int number_of_signs = popular_thopic.length();
        System.out.println("popular thopic is:" + popular_thopic);
        System.out.println("number of signs" + popular_thopic.length());
    }
}

class ConcatenatingString {
        public static void main (String[] args){
            //declaring String values
            String sImie = "Krzysiek";
            String sNazwisko = "Cabaj";
            String sMiastoZmieszkania = "Wrocław";
            String sSpace = " ";

            System.out.println(sImie.concat(sNazwisko) + sMiastoZmieszkania);
            System.out.println("Krzysiek" + sSpace + "Cabaj" + " " + sMiastoZmieszkania);
        }
}