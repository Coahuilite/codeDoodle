public class hellostrings {
    public static void main(String[] args){
        String greetings = "hello world!";
        System.out.println(greetings);
        System.out.println(greetings.length());
        System.out.println(greetings.charAt(5));
        System.out.println(greetings.toUpperCase());
        char[] greetingsArray = greetings.toCharArray();
        for(char i : greetingsArray){
            System.out.print(i);
        }
    }
}
