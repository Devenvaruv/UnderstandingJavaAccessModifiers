// Access Modifier private is not allowed for top level class
class MainPrivate {// this class will have different variable and methods

    private int privateInt = 0;

    private void privateMethod(){
        System.out.println("MainPrivate method privateMethod");
    }
}
class MainPrivate2 {
 private class MainPrivate21{
     public static void main(String[] args){
         System.out.println("MainPrivate2 class MainPrivate21");
     }
 }
 private class MainPrivate22{
     public static void main(String[] args){
         class MainPrivate221{

//             System.out.println("MainPrivate2 class MainPrivate22");

         }
     }

 }
 private class MainPrivate23{
     public static void main(String[] args){
         System.out.println("MainPrivate2 class MainPrivate23");
     }

 }
}

class MainPrivate3 {
     public static void main(String[] args){
        MainPrivate mainprivate = new MainPrivate();
          System.out.println("MainPrivate3");
//        mainprivate.privateMethod();
    }

}
class MainPrivate4 {

}
class MainPrivate5 {

}

