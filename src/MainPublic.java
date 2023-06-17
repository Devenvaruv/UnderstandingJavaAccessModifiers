
public class MainPublic {

    public int publicInt = 0;

    public void publicMethod(){
        System.out.println("MainPublic method publicMethod");
    }

}
// Access Modifiers public is not allowed here as only one public access modifier at top level is allowed because of JLS Specification. The Compiler expects a single public class with the same name as the source file name
class MainPublic2 {

}

class MainPublic3 {

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