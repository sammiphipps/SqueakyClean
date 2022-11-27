
public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String replaceSpace = SqueakyClean.clean("my   Id"); 
		System.out.println(replaceSpace); 
		
		String replaceControl = SqueakyClean.clean("my\0Id"); 
		System.out.println(replaceControl); 
		
		String camelCase = SqueakyClean.clean("a-be-c"); 
		System.out.println(camelCase); 
		
		String ommitNotLetters = SqueakyClean.clean("a1😀2😀3😀b"); 
		System.out.println(ommitNotLetters); 
		
		String greekLetters = SqueakyClean.clean("MyΟβιεγτFinder");
		System.out.println(greekLetters); 
	}

}
