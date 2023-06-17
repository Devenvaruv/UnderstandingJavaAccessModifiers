

public class MainPublic {// this class will have different variable and methods

    public int publicInt = 0;
    public static int publicStaticInt = 1;

    public void publicMethod(){
        System.out.println("MainPublic method publicMethod");
    }
    public static void publicStaticMethod(){
         System.out.println("MainPublic method publicStaticMethod");
    }

}
// Access Modifiers public is not allowed here as only one public access modifier at top level is allowed because of JLS Specification. The Compiler expects a single public class with the same name as the source file name
// main is only accessible by a top level class. so no main inside nested class.
class MainPublic2 {// This class will have
    class MainPublic21 {
        public static void main(String[] args){
            System.out.println("MainPublic2 class MainPublic21");
        }
    }
    public class MainPublic22 {

    }
    public class MainPublic23 {

    }
}

class MainPublic3 {
    static MainPublic staticmainpublic = new MainPublic();
    MainPublic mainpublic1 = new MainPublic();
    public static void main(String[] args){
//        mainpublic mp = new mainpublic();
//        mainpublic.publicMethod();
        MainPublic mainpublic = new MainPublic();
        System.out.println("MainPublic3");
        mainpublic.publicMethod();
        MainPublic.publicStaticMethod();
        System.out.println("MainPublic.publicStaticInt = " + MainPublic.publicStaticInt);
        staticmainpublic.publicMethod();
        System.out.println("MainPublic.publicInt = " + staticmainpublic.publicInt);
    }

}

 class MainPublic4 {
   public class InsideMainPublic41{

   }
    public class InsideMainPublic42{

    }
    public class InsideMainPublic43{

    }
}

class MainPublic5 {

}