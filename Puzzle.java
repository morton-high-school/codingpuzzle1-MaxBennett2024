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
        String cutText = word;

        for(int i =0;i<10;i++){
            cutText = cutText.substring(cutText.indexOf("giraffe")+7);
        }
        cutText=cutText.substring(0,123);
        System.out.println(cutText);
        //armadillo your next task and keyword are located in the 
        //one hundred and five characters after the longest string of 
        //the same consecutive character\
        
        
    }
}
