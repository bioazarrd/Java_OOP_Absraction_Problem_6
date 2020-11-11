package D_JavaAdvancedOOP.Lecture1_Abstraction.ExProblem3;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // ?? ? ????? ?? ?? ?????? ???? ??? ??????????, ?????? ???? ?? ?????????? ????? ????????
        // ? ???? ?? ?????? ?????????? ????? ?? ???
        CardRank[] cardRank = CardRank.values();
        CardSuit[] suitRank = CardSuit.values();

        String cardFromDeck = reader.readLine();
        String cardSuit = reader.readLine();

        //????????? ?? ?????????? ?? ???? ???, ???? ?? ???? ????? ??    ????? . ?????? (???????) . ???????;     ?   2  ?? ????? ???? ?????;
        int cardPower = CardRank.valueOf(cardFromDeck).getValue();
        int suitPower = CardSuit.valueOf(cardSuit).getValue();
        int result = cardPower + suitPower;

        System.out.println(String.format("Card name: %s of %s; Card power: %d", cardFromDeck, cardSuit, result));

    }
}