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

class mainProtected2 {// This class will have nested classes
    protected int mainProtected2Int = 1;
    protected static int staticMainProtected2Int = 2;

    protected static class mainProtected21 {
        protected void mainProtected21Method() {
            System.out.println("mainProtected2 method mainProtected21Method");
        }

        protected static void staticMainProtected21Method() {
            System.out.println("mainProtected2 method StaticMainProtected21Method");
        }
    }

    protected class mainProtected22 {
        protected int mainProtected22Int = 1;
        protected static int staticMainProtected22Int = 2;

        protected class mainProtected221 {
            protected static void staticMainProtected221Method(int i) {
                System.out.println("mainProtected22 method mainProtected221Method" + i + staticMainProtected22Int + mainProtected22Int + staticMainProtected2Int + mainProtected2Int);
            }

            protected void mainProtected221Method(int i) {
                System.out.println("mainProtected22 method mainProtected221Method" + i + staticMainProtected22Int + mainProtected22Int + staticMainProtected2Int + mainProtected2Int);
            }

        }

    }

    protected class mainProtected23 {

        protected class mainProtected231 {
            protected class mainProtected2311 {
                protected void mainProtected2311Method() {
                    System.out.println("mainProtected method mainProtected2311Method");
                }
            }
        }

        protected static class mainProtected232 {
            protected void mainProtected232Method() {
                System.out.println("mainProtected method mainProtected232Method");
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

