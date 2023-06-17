//Everything in this file will be in public unless compiler error

public class MainPublic {// this class will have different variable and methods

    public int publicInt = 0;
    public static int publicStaticInt = 1;

    public void publicMethod() {
        System.out.println("MainPublic method publicMethod");
    }

    public static void publicStaticMethod() {
        System.out.println("MainPublic method publicStaticMethod");
    }

}

// Access Modifiers public is not allowed here as only one public access modifier at top level is allowed because of JLS Specification. The Compiler expects a single public class with the same name as the source file name
// main is only accessible by a top level class. so no main inside nested class.
class MainPublic2 {// This class will have nested classes
    public int mainPublic2Int = 1;
    public static int staticMainPublic2Int = 2;

    public static class MainPublic21 {
        public void mainPublic21Method() {
            System.out.println("MainPublic2 method MainPublic21Method");
        }

        public static void staticMainPublic21Method() {
            System.out.println("MainPublic2 method StaticMainPublic21Method");
        }
    }

    public class MainPublic22 {
        public int mainPublic22Int = 1;
        public static int staticMainPublic22Int = 2;

        public class MainPublic221 {
            public static void staticMainPublic221Method(int i) {
                System.out.println("MainPublic22 method MainPublic221Method" + i + staticMainPublic22Int + mainPublic22Int + staticMainPublic2Int + mainPublic2Int);
            }

            public void mainPublic221Method(int i) {
                System.out.println("MainPublic22 method MainPublic221Method" + i + staticMainPublic22Int + mainPublic22Int + staticMainPublic2Int + mainPublic2Int);
            }

        }

    }

    public class MainPublic23 {

        public class MainPublic231 {
            public class MainPublic2311 {
                public void MainPublic2311Method() {
                    System.out.println("MainPublic method MainPublic231Method");
                }
            }
        }

        public static class MainPublic232 {
            public void MainPublic232Method() {
                System.out.println("MainPublic method MainPublic232Method");
            }
        }

    }
}

class MainPublic3 {// This class will call different methods from MainPublic and MainPublic2 classes
    static MainPublic staticmainpublic = new MainPublic();
    MainPublic mainpublic1 = new MainPublic();

    public static void main(String[] args) {
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
    public class InsideMainPublic41 {

    }

    public class InsideMainPublic42 {

    }

    public class InsideMainPublic43 {

    }
}

class MainPublic5 {

}