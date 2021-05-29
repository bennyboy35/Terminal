public enum EDifficulty {
    EASY(1, 4, 5),
    MEDIUM(4, 6, 7),
    HARD(6, 10, 10);


    private final int lengthMin;
    private final int lengthMax;
    private final int numOfWords;

    EDifficulty(int lengthMin, int lengthMax, int numOfWords){
        this.lengthMin = lengthMin;
        this.lengthMax = lengthMax;
        this.numOfWords = numOfWords;

    }

    public int getLengthMin() {
        return lengthMin;
    }

    public int getLengthMax() {
        return lengthMax;
    }

    public int getNumOfWords() {
        return numOfWords;
    }
}
