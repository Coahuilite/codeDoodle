public class loop_test {
    public static void main(String[] args){
        int i,j;
        machineCase stoneCaseplus = new machineCase("114514",(byte) 5,(short) 514,"poop");
        back1:
        for(i= 0;i <10 ; i ++){
            back2:
            for(j = 0;j < 10;j ++){
                if(j == 9){
                    System.out.printf("Tire %d case is " + stoneCaseplus.name + ". It is made by " + stoneCaseplus.material + " and it weight is %d\n",stoneCaseplus.tire,stoneCaseplus.weight);
                    continue back2;
                }
            }
            System.out.printf("now i is %d " + "now j is %d\n",i,j);
        }
    }
}
