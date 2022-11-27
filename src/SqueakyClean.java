import java.util.Arrays;
import java.util.regex.Pattern;

public class SqueakyClean {
	private static String replaceSpace(String word) {
		return word.replaceAll(" ", "_"); 
	}
	
	private static String replaceControlCharacters(String word) {
		return  word.replaceAll("\\p{Cntrl}", "CTRL");
	}
	
	private static String convertKebabCase(String word) {
		//convert kebab-case to camelCase
		//split at - 
		String[] wordSplit = word.split("-"); 
		
		//capitalize the letter after the -
		//start at 1
		for(int i = 1; i < wordSplit.length; i++) {
			wordSplit[i] = wordSplit[i].substring(0, 1).toUpperCase() + wordSplit[i].substring(1); 
		}
		
		//return joined word
		return String.join("", wordSplit); 
		
	}
	
	private static String omitNotLetters(String word) {
		return word.replaceAll("[^A-Za-z]", ""); 
	}
	
	public static String clean(String word) {
		//replace empty spaces with underscore 
		String noSpace = replaceSpace(word); 
		String removeControlChar = replaceControlCharacters(noSpace); 
		String camelCase = convertKebabCase(removeControlChar); 
		String onlyLetters = omitNotLetters(camelCase); 
		return onlyLetters; 
	}
}
