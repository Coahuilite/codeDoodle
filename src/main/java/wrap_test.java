public class wrap_test {
    public static void main(String[] args){
        int a = 10;
        int b = 20;
        Integer c = Integer.valueOf(30);
        Integer wrapa = new Integer(a);
        Integer wrapb = new Integer(b);
        System.out.println(wrapa);
        System.out.println(wrapb);
        if(wrapa instanceof Integer) {
            System.out.println("It is a object.");
            System.out.println(wrapa instanceof Integer);
        }
        if(wrapb instanceof Integer) {
            System.out.println("It is also a object.");
            System.out.println(wrapb instanceof Integer);
        }
        System.out.printf("%s\n", wrapa.doubleValue() / 3);
        System.out.println(c);
        System.out.println(c.equals(wrapa));
        c = Integer.valueOf(10);
        System.out.println(c == wrapa);
        System.out.println(c.equals(wrapa));
    }
}