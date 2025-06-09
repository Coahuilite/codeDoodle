public class try_args {
    public static void main(String[] args){
        for(String arg : args){
            if(arg.equals("-hello")){
                System.out.println("Hello, world!");
            }else {
                System.out.println("Unknown argument: " + arg);
                System.out.println("Why not try with '-hello' ?");
            }
            break;
        }
    }
}
