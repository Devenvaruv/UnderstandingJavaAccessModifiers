//Everything in this file will be protected unless compiler error

//Access Modifier protected is not allowed for top level class(top level class means the first level class of the file

//protected class MainProtected { X
//
//}

class MainProtected {// this class will have different variable and methods

    protected int protectedInt = 0;
    protected static int staticProtectedInt = 1;

    protected void protectedMethod() {
        System.out.println("MainProtected method protectedMethod");
    }
    protected static void staticProtectedMethod() {
        System.out.println("MainProtected method StaticProtectedMethod");
    }

}

class Mainprotected2 {// This class will have nested classes
    protected int mainprotected2Int = 1;
    protected static int staticMainprotected2Int = 2;

    protected static class Mainprotected21 {
        protected void mainprotected21Method() {
            System.out.println("Mainprotected2 method Mainprotected21Method");
        }

        protected static void staticMainprotected21Method() {
            System.out.println("Mainprotected2 method StaticMainprotected21Method");
        }
    }

    protected class Mainprotected22 {
        protected int mainprotected22Int = 1;
        protected static int staticMainprotected22Int = 2;

        protected class Mainprotected221 {
            protected static void staticMainprotected221Method(int i) {
                System.out.println("Mainprotected22 method Mainprotected221Method" + i + staticMainprotected22Int + mainprotected22Int + staticMainprotected2Int + mainprotected2Int);
            }

            protected void mainprotected221Method(int i) {
                System.out.println("Mainprotected22 method Mainprotected221Method" + i + staticMainprotected22Int + mainprotected22Int + staticMainprotected2Int + mainprotected2Int);
            }

        }

    }

    protected class Mainprotected23 {

        protected class Mainprotected231 {
            protected class Mainprotected2311 {
                protected void Mainprotected2311Method() {
                    System.out.println("Mainprotected method Mainprotected231Method");
                }
            }
        }

        protected static class Mainprotected232 {
            protected void Mainprotected232Method() {
                System.out.println("Mainprotected method Mainprotected232Method");
            }
        }

    }
}

class MainProtected3 {// This class will call different methods from MainPublic and MainPublic2 classes

}
class MainProtected4 {

}
class MainProtected5 {

}

