// Access Modifier private is not allowed for top level class

//private class MainPrivate {  X
//
//}

class MainPrivate {// this class will have different variable and methods

    private int privateInt = 0;
    private static int staticPrivateInt = 1;

    private void privateMethod() {
        System.out.println("MainPrivate method privateMethod");
    }
    private static void staticPrivateMethod() {
        System.out.println("MainPrivate method privateMethod");
    }
}

class mainPrivate2 {// This class will have nested classes
    private int mainPrivate2Int = 1;
    private static int staticMainPrivate2Int = 2;

    private static class MainPrivate21 {
        private void mainPrivate21Method() {
            System.out.println("mainPrivate2 method MainPrivate21Method");
        }

        private static void staticMainPrivate21Method() {
            System.out.println("MainPrivate2 Method StaticMainPrivate21Method");
        }
    }

    private class mainPrivate22 {
        private int mainPrivate22Int = 1;
        private static int staticMainPrivate22Int = 2;

        private class mainPrivate221 {
            private static void staticMainPrivate221Method(int i) {
                System.out.println("mainPrivate22 method mainPrivate221Method" + i + staticMainPrivate22Int + mainPrivate22Int + staticMainPrivate2Int + mainPrivate2Int);
            }

            private void mainPrivate221Method(int i) {
                System.out.println("mainPrivate22 method mainPrivate221Method" + i + staticMainPrivate22Int + mainPrivate22Int + staticMainPrivate2Int + mainPrivate2Int);
            }

        }

    }

    private class mainPrivate23 {

        private class mainPrivate231 {
            private class mainPrivate2311 {
                private void mainPrivate2311Method() {
                    System.out.println("mainPrivate method mainPrivate2311Method");
                }
            }
        }

        private static class mainPrivate232 {
            private void mainPrivate232Method() {
                System.out.println("mainPrivate method mainPrivate232Method");
            }
        }

    }
}

class MainPrivate3 {// This class will call different methods from MainPublic and MainPublic2 classes

    public static void main(String[] args) {
        MainPrivate mainprivate = new MainPrivate();
        System.out.println("MainPrivate3");
//        mainprivate.privateMethod();
    }

}

class MainPrivate4 {

}

class MainPrivate5 {

}

