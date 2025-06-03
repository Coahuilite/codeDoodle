public class pointCards {
    public static void main(String []args){
        pointCard card1 = new pointCard("114",500,1);
        pointCard card2 = new pointCard("514",1000,2);
        pointCard card3 = new pointCard("191",9810,10);
        pointCard[] cards = {
                new pointCard("001",114,1),
                new pointCard("002",115,2),
                new pointCard("003",116,3)
        };
        System.out.printf("(%s,%d,%d)%n",card1.cardID,card1.points,card1.bonus);
        System.out.printf("(%s,%d,%d)%n",card2.cardID,card2.points,card2.bonus);
        System.out.printf("(%s,%d,%d)%n",card3.cardID,card3.points,card3.bonus);
        for(pointCard card : cards){
            System.out.printf("(%s,%d,%d)%n",card.cardID,card.points,card.bonus);
        }
    }
    static class pointCard{
        String cardID;
        int points;
        int bonus;
        pointCard(String cardID,int points,int bonus){
            this.cardID = cardID;
            this.points = points;
            this.bonus = bonus;
        }
    }
}
