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
        System.out.println("");
        //armadillo your next task and keyword are located in the 
        //one hundred and five characters after the longest string of 
        //the same consecutive character
        String palindrome = word;
        int longest = 0;
        int bestIndex = 0;
        boolean thing = true;
        for(int i = 0;i<palindrome.length();i++){
            int odd = 1;
            for(int k=0;thing;k++){
                if(i-k<0||i+k>=palindrome.length()){
                    thing = false;
                }else{
                    if(palindrome.substring(i-k,i+k+1).equals(palindrome.substring(i+k,i+k+1))){
                        odd+=2;
                    }else{
                        thing = false;
                    }
                }
            }
            thing = true;
            int even = 0;
            if(i+1<palindrome.length() && palindrome.substring(i,i+1).equals(palindrome.substring(i+1,i+2))){
                even = 2;
                for(int k=0;thing;k++){
                    if(i-k<0 || i+k+1>=palindrome.length()){
                        thing = false;
                    }else{
                        if(palindrome.substring(i-k,i-k+1).equals(palindrome.substring(i+k+1, i+k+2))){
                            even++;
                        }else{
                            thing = false;
                        }
                    }
                }
            }

            thing = true;

            if(odd>longest){
                longest = odd;
                bestIndex = i-odd/2;
            }
            if(longest<even){
                longest = even;
                bestIndex = i-longest/2+1;
            }
        }  
         System.out.println(palindrome.substring(bestIndex+11,bestIndex+116));
         System.out.println("");

        // penguin your next task and keyword are located in the 
        // eighty characters after the string of length thirty with the most vowels

        int count = 0;
        int highestCount = 0;
        String mostVowels = "";
        String vowels = word;
        for(int i = 0; i < vowels.length()-30;i++){
            count = 0;
            for(int j = 0;j<30;j++){
                if(vowels.substring(i+j,i+j+1).equals("a")||vowels.substring(i+j,i+j+1).equals("e")||vowels.substring(i+j,i+j+1).equals("i")||vowels.substring(i+j,i+j+1).equals("o")||vowels.substring(i+j,i+j+1).equals("u")){
                    count ++;
                }
            }
            if(count>highestCount){
                highestCount = count;
            }
            if(highestCount==count){
                mostVowels = vowels.substring(i+29,i+109);
            }
        } 
        System.out.println(mostVowels);
        System.out.println("");

        
        // ostrich your final keyword is located 
        // in the six characters after a palindrome of length eleven
        String palen = word;
        String reverse = "";
        String finalWord = "";
        String eleven ="";
        for(int i =0;i<palen.length()-11;i++){
            eleven = palen.substring(i,i+11);
            for(int j = eleven.length();j>0;j--){
                reverse=reverse + eleven.substring(j-1,j);
            }
            if(eleven.equals(reverse)){
                finalWord = eleven + word.substring(i+11,i+17);
                System.out.println(finalWord);
                break;
            }
            reverse = "";
        }
        //yobananaboy badger
    }
}
