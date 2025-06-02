public class meet_the_builder {
    public static void main(String[] args) {
        String str1 = "Wired";
        String str2 = "Weired";
        String str3 = str1 + str2 + "Strange...";
        System.out.println(str3);
        String to100 = "";
        for(int i=0;i<100;i++){
            to100 = to100 + i + "+";
        }
        System.out.println(to100 + 100);
    }
}