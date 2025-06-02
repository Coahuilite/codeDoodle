class machineCase {
    byte tire;
    short weight;
    String material;
    String name;
    machineCase(String name, byte tire, short weight, String material){
        this.name = name;
        this.tire = tire;
        this.weight = weight;
        this.material = material;
    }
}
public class class_test {
    public static void main (String[] args){
        machineCase stoneCase = new machineCase("Stone Case", (byte) 1, (short) 100,"stone");
        machineCase ironCase = new machineCase("Iron Case", (byte) 2, (short) 200, "iron");
        System.out.printf("Tire %d case is " + stoneCase.name + ". It is made by " + stoneCase.material + " and it weight is %d\n",stoneCase.tire,stoneCase.weight);
        System.out.printf("Tire %d case is " + ironCase.name + ". It is made by " + ironCase.material + " and it weight is %d\n",ironCase.tire,ironCase.weight);
    }
}
