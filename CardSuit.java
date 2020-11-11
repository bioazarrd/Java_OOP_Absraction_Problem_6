package D_JavaAdvancedOOP.Lecture1_Abstraction.ExProblem3;
public enum CardSuit {


    CLUBS(0),               // 0
    DIAMONDS(13),           // 13
    HEARTS(26),             // 26
    SPADES(39);             // 39

    private int value;      // property ???????!!!

    CardSuit(int value) {
        this.value = value;
    }


    //?????? ?? ????? ?? ?? ???? ?? ??????? ????? ? MAIN: "CardSuit.valueOf(suit).getValue()"
    public int getValue() {
        return this.value;
    }

}
