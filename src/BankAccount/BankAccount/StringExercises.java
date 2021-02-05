import com.sun.xml.internal.fastinfoset.util.CharArray;

public class StringExercises {

    public void charInd(int a){
        String string = "Romania";
        System.out.println(string.charAt(a-1));
    }

    public boolean stringContains(CharSequence sequence){
        String string = "Romania";
        if(string.contains(sequence)){
            System.out.println("true");
            return true;
        }else{
            System.out.println("false");
            return false;
        }

    }

    public void replaceCharacter(char oldChar, char newChar){
        String string = "Alakablam ";
        char[] array = string.toCharArray();
        for (int i = 0; i < array.length ; i++) {
            if(array[i] == oldChar){
                array[i] = newChar;
            }
        }
        string = String.valueOf(array);
        System.out.println(string);
    }

    public void uppercaseEveryLetter(){
        String string = "ana are mere";
        char[] array = string.toCharArray();
        if(Character.isLowerCase(array[0])){
            array[0] = (char) (array[0] - 32);
        }
        for (int i = 1; i < array.length; i++) {
            if(array[i] == ' '){
                array[i+1] = (char) (array[i+1] - 32);
            }
        }
        string = String.valueOf(array);
        System.out.println(string);
    }

}

