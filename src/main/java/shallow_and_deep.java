import java.util.Arrays;

class boxes {
    String color;
    char size;
    int inventory;
    boxes(String color, char size,int inv){
        this.color = color;
        this.size = size;
        this.inventory = inv;
    }
}

public class shallow_and_deep {
    public static void main(String[] args){
        boxes[] b1 = {new boxes("red", 'S', 10), new boxes("blue", 'M', 20)};
        boxes[] b2 = new boxes[b1.length];
        boxes[] b3 = new boxes[b1.length];
        // shallow copy
        for(int i=0;i<b1.length;i++) {
            b2[i]=b1[i]; // shallow copy
        }
        System.out.println("b2: " + Arrays.toString(b2));
        b1[0].color = "green";
        System.out.printf("b2 after b1 change: " + (b2[0].color + "%n"));// b2 also changes

        // deep copy
        for (int i = 0; i < b1.length ; i++) {
            boxes b = new boxes(b1[i].color, b1[i].size, b1[i].inventory);
            b3[i]=b;
        }
        System.out.println("b3: " + Arrays.toString(b3));
    }
}
