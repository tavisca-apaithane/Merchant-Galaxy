import java.util.ArrayList;

public class ParseSentenceToCredits {

    public double parse(String text)
    {

     String[] firstSeparation = text.split("is");

     String[] wordAmountList = new String[firstSeparation[0].split(" ").length-1];
     for(int i=0;i<(firstSeparation[0].split(" ").length-1);i++)
         wordAmountList[i]=firstSeparation[0].split(" ")[i];

     

     ArrayList<Integer> wordAmountInRupeesList = generateNumberList(wordAmountList);
     int totalNumericalValueOfItems = generateTotalNumericalListValue(wordAmountInRupeesList);
     int givenTotalValue = Integer.parseInt(firstSeparation[1].split(" ")[1]);
        String finding=firstSeparation[0].split(" ")[0];
        String key = firstSeparation[0].split(" ")[firstSeparation[0].split(" ").length-1];
     CurrencyConverter.baseDictionary.put(key,(double)(givenTotalValue/totalNumericalValueOfItems));

     return (double)(givenTotalValue/totalNumericalValueOfItems);

    }



    public int generateTotalNumericalListValue(ArrayList<Integer> wordAmountInRupeesList) {
        int[] wordAmountInRupeesArray= new int[wordAmountInRupeesList.size()];

        for(int i=0;i<wordAmountInRupeesList.size();i++) {
            wordAmountInRupeesArray[i]=  wordAmountInRupeesList.get(i);

        }

        while(wordAmountInRupeesArray.length!=1)
        {
            wordAmountInRupeesArray = reduceWordAmountInRupeesArray(wordAmountInRupeesArray);
        }
       // System.out.println(wordAmountInRupeesArray[0]+" "+wordAmountInRupeesArray.length+" here2");
        return wordAmountInRupeesArray[0];
    }



    //done
    public int[] reduceWordAmountInRupeesArray(int[] wordAmountInRupeesArray) {

        if(wordAmountInRupeesArray[0]<wordAmountInRupeesArray[1])
            wordAmountInRupeesArray[1]=wordAmountInRupeesArray[1]-wordAmountInRupeesArray[0];
        else
            wordAmountInRupeesArray[1]=wordAmountInRupeesArray[0]+wordAmountInRupeesArray[1];

        int[] newWordAmountInRupeesArray= new int[wordAmountInRupeesArray.length-1];

        for(int i=1;i<wordAmountInRupeesArray.length;i++)
            newWordAmountInRupeesArray[i-1]=wordAmountInRupeesArray[i];

        return newWordAmountInRupeesArray;

    }
//done
    public ArrayList<Integer> generateNumberList(String[] wordAmountList) {

        ArrayList<Integer> NumberList = new ArrayList();
        for(int i=0;i<wordAmountList.length;i++)
        {
            NumberList.add((Integer) CurrencyConverter.baseDictionary.get(wordAmountList[i]));
        }
        return NumberList;
    }



}
