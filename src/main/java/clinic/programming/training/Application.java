package clinic.programming.training;
import java.util.List;
import java.util.ArrayList;
import org.apache.commons.lang3.StringUtils;

public class Application {

    public static int countWords(String words){

        String[] separateWords = StringUtils.split(words,' ');
        return(separateWords==null) ? 0 : separateWords.length ;

    }

    public void greet(){

        List <String> greetings = new ArrayList<>();
        greetings.add("Hello");

        for(String greeting : greetings){
            System.out.println("greetings : "+ greeting);
        }
    }
    
    public Application() {
        System.out.println ("Inside Application");
    }

    // method main(): ALWAYS the APPLICATION entry point
    public static void main (String[] args) {
    	System.out.println ("Starting Application");
	    Application app = new Application();

        int count = countWords("i have four words");
        System.out.println("word count : "+ count);
    }
}