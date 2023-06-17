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

class Mainprivate2 {// This class will have nested classes
    private int mainprivate2Int = 1;
    private static int staticMainprivate2Int = 2;

    private static class Mainprivate21 {
        private void mainprivate21Method() {
            System.out.println("Mainprivate2 method Mainprivate21Method");
        }

        private static void staticMainprivate21Method() {
            System.out.println("Mainprivate2 method StaticMainprivate21Method");
        }
    }

    private class Mainprivate22 {
        private int mainprivate22Int = 1;
        private static int staticMainprivate22Int = 2;

        private class Mainprivate221 {
            private static void staticMainprivate221Method(int i) {
                System.out.println("Mainprivate22 method Mainprivate221Method" + i + staticMainprivate22Int + mainprivate22Int + staticMainprivate2Int + mainprivate2Int);
            }

            private void mainprivate221Method(int i) {
                System.out.println("Mainprivate22 method Mainprivate221Method" + i + staticMainprivate22Int + mainprivate22Int + staticMainprivate2Int + mainprivate2Int);
            }

        }

    }

    private class Mainprivate23 {

        private class Mainprivate231 {
            private class Mainprivate2311 {
                private void Mainprivate2311Method() {
                    System.out.println("Mainprivate method Mainprivate231Method");
                }
            }
        }

        private static class Mainprivate232 {
            private void mainPrivate232Method() {
                System.out.println("MainPrivate method MainPrivate232Method");
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

