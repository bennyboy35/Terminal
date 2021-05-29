public enum EWords {

    THIS(4),
    THAT(4),
    GOOD(4),
    BAD(3),
    INTERSTATE(10),
    MAN(3),
    POLICE(6),
    CALL(3),
    SIXTY(5),
    WOMAN(5),
    CAR(3),
    LAPTOP(6),
    FATHER(6),
    DEGENERATE(10),
    ROAD(4),
    TELEVISION(10),
    TERMINAL(8),
    FALLOUT(7),
    TOILET(6),
    SHOWER(6),
    WATER(5),
    LAMP(4),
    BATHROOM(8),
    MIRROR(6),
    WINDOW(6),
    RADIATOR(8),
    CHAIR(5);


    private final int length;

    EWords(int length){
        this.length = length;
    }

    public int getLength() {
        return length;
    }
}
