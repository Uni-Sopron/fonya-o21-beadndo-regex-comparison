package war;
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Main {
    public static void main(String[] args) {
        int elso = 0;
        int masodik = 0;
        int harmadik = 0;
        int negyedik = 0;
        int otodik = 0;

        try {
            File myObj = new File("Windows_2k.log");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
                Pattern pattern = Pattern.compile("^2016-09-29", Pattern.CASE_INSENSITIVE);
                Matcher matcher = pattern.matcher(data);
                boolean matchFound = matcher.find();
                if(matchFound) {
                    elso += 1;
                }
                pattern = Pattern.compile("]$", Pattern.CASE_INSENSITIVE);
                matcher = pattern.matcher(data);
                matchFound = matcher.find();
                if(matchFound) {
                    masodik += 1;
                }
                pattern = Pattern.compile("C.S");
                matcher = pattern.matcher(data);
                matchFound = matcher.find();
                if(matchFound) {
                    harmadik += 1;
                }
                pattern = Pattern.compile("attribute", Pattern.CASE_INSENSITIVE);
                matcher = pattern.matcher(data);
                matchFound = matcher.find();
                if(matchFound) {
                    negyedik += 1;
                }
                pattern = Pattern.compile("y+", Pattern.CASE_INSENSITIVE);
                matcher = pattern.matcher(data);
                matchFound = matcher.find();
                if(matchFound) {
                    otodik += 1;
                }
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        System.out.println("Ennyi sor kezdődik 2016-09-29-el: ");
        System.out.println(elso);
        System.out.println("Ennyi sor végződik szögletes zárójelre: ");
        System.out.println(masodik);
        System.out.println("Ennyi sor tartalmazza a 'C' 'bármilyen karakter' 'S' kifejezést: ");
        System.out.println(harmadik);
        System.out.println("Ennyi sor tartalmazza az 'attribute' kifejezést: ");
        System.out.println(negyedik);
        System.out.println("Ennyi sor tartalmazlegalább egy y betüt: ");
        System.out.println(otodik);
    }
}
