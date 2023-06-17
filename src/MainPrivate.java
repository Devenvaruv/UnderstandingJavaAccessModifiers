// Access Modifier private is not allowed for top level class
public class MainPrivate {

    private int privateInt = 0;

    private void privateMethod(){
        System.out.println("MainPrivate method privateMethod");
    }
}
class MainPrivate2 {

}

class MainPrivate3 {
     public static void main(String[] args){
//        MainPrivate mainprivate = new MainPrivate();
        System.out.println("MainPrivate class MainPrivate3");
//        mainprivate.privateMethod();
    }

}
class MainPrivate4 {

}
class MainPrivate5 {

}

