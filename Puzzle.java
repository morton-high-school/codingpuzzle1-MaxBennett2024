import java.util.Scanner;
import java.io.File;

//welcome to your first coding puzzle of the course 
//your second task and first keyword are located 
//in the one hundred and twenty three characters after the tenth giraffe
public class Puzzle {
    public static void main(String []args) throws Exception{
        File text = new File("puzzle.txt");
        Scanner read = new Scanner(text);
        String word = read.nextLine();
        
        int index = word.indexOf("giraffe");
        for(int i =0;i<9;i++){
            index = word.indexOf("giraffe");
            word = word.substring(index+7,word.length());
        }
        word = word.substring(index,index+123);
        System.out.println(word);
    }
}
