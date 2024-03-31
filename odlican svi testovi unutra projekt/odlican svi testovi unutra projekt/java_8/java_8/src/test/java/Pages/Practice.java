package Pages;
import java.lang.reflect.Array;
import java.util.*;
public class Practice {

    ArrayList<String> list = new ArrayList<String>();
    ArrayList<Character> dupl = new ArrayList<Character>();
    ArrayList<Character> withoutDupl = new ArrayList<Character>();
    ArrayList<String> listOfString = new ArrayList<String>();
    ArrayList<Integer> listOfInt = new ArrayList<Integer>();
    ArrayList<Integer> listOfInt1 = new ArrayList<Integer>();
    ArrayList<Integer> listOfInt2 = new ArrayList<Integer>();
    ArrayList<Character> listFromString = new ArrayList<Character>();
    ArrayList<Character> reverseListFromString = new ArrayList<Character>();
    String [] inputList = {"Jan","Feb","Mar","Apr","Maj","Jun","Jul","Avg","Sep","Okt","Nov","Dec"};
    Arrays inputListSorted;

    // Form a list of numbers from 0-9.
    public void createList() {
    	listOfInt.clear();
        for (int i = 0; i < 20; i++) {
             Random rand = new Random();
             int randomElement = rand.nextInt(5,20);
            listOfInt.add(randomElement);

        }
        System.out.println("Input list : " + listOfInt);
    }
    
    public void findStringDuplicates(String s) {
    	withoutDupl.clear();
    	char[] duplic;
    	char[] noduplic;
    	duplic = s.toCharArray();
    	
    	for(int i = 0; i <duplic.length; i++) {  
            //count = 1;  
            for(int j = i+1; j <duplic.length; j++) {  
                if(duplic[i] == duplic[j] && duplic[i] != ' ') { 
                	break;
                	
                		
                	}	
                withoutDupl.add(duplic[i]);
                }
            }
    
                 
    String a= withoutDupl.toString();
    System.out.println(a);
              
    }

    public void createIntList() {
        for (int i = 0; i < 10; i++) {
            listOfInt1.add(i);
             i=i+1;
        }
        System.out.println("Input list : " + listOfInt1);
    }
    public void createIntListTwo() {
        for (int i = 0; i < 20; i++) {
            listOfInt2.add(i);

        }
        System.out.println("Input list : " + listOfInt2);
    }

    public void removeExtraSpaces() {
        String str = "Acv bv gsdc EMdc  sdertj";
        System.out.println(str);
        String replacement = str.replaceAll(" ", "");

        System.out.println(replacement);
    }

    public void showList() {

        for (String str : inputList) {
            System.out.print(str + " ");
        }
        System.out.println();
    }

    public boolean isItPalindrome(String str) {
        listFromString.clear();
        reverseListFromString.clear();
        Boolean t = true;
        for (int i = 0; i < str.length(); i++) {
            listFromString.add(str.charAt(i));


        }


        //System.out.println(listFromString);

        for (int i = str.length() - 1; i >= 0; i--) {

            reverseListFromString.add(listFromString.get(i));

        }
        //System.out.println(reverseListFromString);


        for (int i = 0; i < str.length(); i++) {

            if (listFromString.get(i).equals(reverseListFromString.get(i))) {


            } else {
                System.out.println("Not palindromes" + listFromString + " " + reverseListFromString);
                t = false;
                break;
            }

        }
        if (t) {
            System.out.println("Yes palindromes" + listFromString + " " + reverseListFromString);
        }

        return (t);

    }
    public void sameElements(){
        listOfInt1.clear();
        listOfInt2.clear();
        listOfInt1.add(2);
        createIntList();
        createIntListTwo();
        for (int str : listOfInt1) {System.out.println("success");
        }


    }
    public void twoMaxArrayValues() {
        createList();
        
        int maxfirst = 0;
        
       
        for (int str : listOfInt) {

            if (str > maxfirst) {

                maxfirst = str;
               

            }
           
        }
        int min = maxfirst;
        for (int str : listOfInt) {

            if (str > maxfirst) {

                maxfirst = str;
                //maxsecond = maxfirst -1;

            }
            if (min>str )
            {
            	min=str;
            }
        }
        System.out.println("max is: " + maxfirst +"min is: "+ min);
    }


    public int reverseNumber(int numb) {

        int invert = 0;
        while (numb != 0) {
            invert = (invert * 10) + (numb % 10);
            numb = numb / 10;
        }
        return invert;
    }

    public void showSortedList() {

        Arrays.sort(inputList, String.CASE_INSENSITIVE_ORDER);
        for (String str : inputList) {
            System.out.print(str + " ");
        }
        System.out.println();
    }

    public void addDuplicatesToList() {
        // Insert a new set of numbers from 0-5.
        for (int i = 0; i < 5; i++) {
            list.add(String.valueOf(i));


        }
        System.out.println("\nAdded duplicates : " + list);
    }
    public static int sockMerchant(int n, List<Integer> ar) {
        // Write your code here

        int counter = 0;
        int count = 0;
        //
        for (int i = 0; i < ar.size(); i++) {
            count = 1;
            //
            for (int j = i + 1; j < ar.size(); j++) {
                if (ar.get(i) == ar.get(j)) {
                    count++;
                }
            }

            if (count % 2 == 0) {
                counter++;
            }
        }
        System.out.print(counter);
        return counter;
    }

    public static int countingSteps(int n, String path) {
        // Write your code here

        int counter = 0;
        List<Character>listOfString;
        List<Character> chars = new ArrayList<>();

        // For each character in the String
        // add it to the List
        for (char ch : path.toCharArray()) {

            chars.add(ch);
        }

        //
        for (int i = 0; i < chars.size(); i++) {
            //System.out.print(chars.size());
            //System.out.print("\n");

            System.out.print(chars.get(i)+"\n");
               if (chars.get(i).toString().equals("U")){
                   System.out.print("Up"+"\n");
                   counter++;
                   System.out.print("Counter is "+counter+"\n");

               }
            if (chars.get(i).toString().equals("D")){
                System.out.print("Down"+"\n");
                counter--;
                System.out.print("Counter is "+counter+"\n");

            }


            }
        System.out.print("\n" + counter);
        return counter;
    }


//    public void moveDuplicatesFromList(int[] inputListInteger) {
//        //
//        int[] nodupl ;
//        ArrayList<Integer> lst = new ArrayList<Integer>();
//       
//        for (int i = 0; i < inputListInteger.length; i++) {
//            for (int j = i + 1; j < nodupl.length; j++) {
//                if (inputListInteger[i] == nodupl[j]) {
//                   
//                	break;
//                }
//                else {
//                	lst.add(inputListInteger[i]);
//                }
//            }
//
//        }
//        System.out.println("\nFiltered duplicates : " + lst);
//    }
    public void removeDuplicatesFromList(List<Integer> inputListInteger) {
        //
        List<Integer> arlist = inputListInteger;
        List<Integer> dupl = new ArrayList<>();
        
        arlist =inputListInteger;
        //dupl.add(arlist.get(0));
        for (int i=0; i<arlist.size(); i++){
        	 for (int j=i+1; j<arlist.size(); j++) {
                  if ( arlist.get(i)== arlist.get(j)) {
                	  dupl.add(arlist.get(j));
                	  System.out.println("i am here" + arlist.get(j));
                	break;
                   }
                  
                	 
                 
            }
 
        }
            
            System.out.println("\nduplicates : " + dupl);
        }
     
    

    public static void main(String[] args) {
        int number = 24598543;
        Practice obj = new Practice();
        //obj.createList();
        // obj.addDuplicatesToList();
        List<Integer> ar = new ArrayList<>();
        ar.add(1);ar.add(1);ar.add(2);ar.add(4);ar.add(3);ar.add(3);ar.add(6);ar.add(6);ar.add(3);
		//obj.moveDuplicatesFromList(ar);
        obj.findStringDuplicates("aazbukka");
        //obj.showList();
        //obj.showSortedList();
        //obj.removeExtraSpaces();
        obj.twoMaxArrayValues();
        //sockMerchant(7,ar );
        //countingSteps(8, "UUDUUDUD");
        obj.isItPalindrome("Dragan");
        obj.isItPalindrome("ANA");
        obj.findStringDuplicates("Dragann");
        //obj.isItPalindrome("SAIPPUAKIVIKAUPPIAS");
        // System.out.println(obj.reverseNumber(number));
        //obj.twoMaxArrayValues();
        //obj.sameElements();
        //obj.showList();
        obj.removeDuplicatesFromList(Arrays.asList(1,2,2,3,4,4,5));
        System.out.println(obj.reverseNumber(654123));
        //System.out.println("Input list : " + list);
        //System.out.println("\nFiltered duplicates : " + processList(list));
    }


}
