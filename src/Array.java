import java.util.Arrays;

class Kunal{
    String name; int rollno;
    Kunal(String name, int rollno){
        this.name = name;
        this.rollno= rollno;
    }
}
public class Array {
    public static void main(String[] args) {
    Kunal [] kk= new Kunal[5];
    kk[0]= new Kunal("Kunal",21);
    kk[1]= new Kunal("Navreet",22);
    kk[2]= new Kunal("Kheeva",23);
        for(int i=0; i<=kk.length; i++){
            System.out.println(kk[i]);
        }
    }
}

