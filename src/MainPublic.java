
public class MainPublic {

    public int publicInt = 0;

    public void publicMethod(){
        System.out.println("MainPublic method publicMethod");
    }

}
// Access Modifiers public is not allowed here as only one public access modifier at top level is allowed
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