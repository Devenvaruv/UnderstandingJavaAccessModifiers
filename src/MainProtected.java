//Access Modifier protected is not allowed for top level class(top level class means the first class of the file or the initial class in which other classes methods and objects are created)
class MainProtected {// this class will have different variable and methods

    protected int protectedInt = 0;

    protected void protectedMethod() {
        System.out.println("MainProtected method protectedMethod");
    }

}

class MainProtected2 {
    public void ma(){
        System.out.println("this can not be nested");}
    protected class MainProtected21 {
        public static void main(String[] args){
       System.out.println("this can not be nested");}
        public static void mai(){
            System.out.println("this can not be nested");}
    }
    protected class MainProtected22 {
        MainProtected21 mainprotected21 = new MainProtected21();
        mainprotected21.mai();

    }
    protected class MainProtected23 extends MainProtected21 {
        MainProtected2 mainprotected2 = new MainProtected2();
        MainProtected21 mainprotected21 = new MainProtected21();
        MainProtected2.MainProtected21.mai();
       mainprotected2.mainprotected21.mai();
    }

}

class MainProtected3 {

}
class MainProtected4 {

}
class MainProtected5 {

}

