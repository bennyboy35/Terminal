import java.util.ArrayList;

public class WordListGenerator {

    public EWords[] generateWordList(EDifficulty difficulty){
        EWords[] wordList = EWords.values();
        ArrayList<EWords> validWords = new ArrayList<EWords>();
        switch(difficulty){

            Default:
               validWords =  getValidWords(wordList, difficulty.getLengthMin(), difficulty.getLengthMax());
                break;
        }

        return
    }

    private ArrayList<EWords> getValidWords(EWords[] wordList, int lengthMin, int lengthMax) {
        ArrayList<EWords> validWords = new ArrayList<EWords>();
        for (EWords eWords : wordList) {
            if (eWords.getLength() >= lengthMin && eWords.getLength() <= lengthMax) {
                validWords.add(eWords);
            }
        }
        return validWords;
    }
}
