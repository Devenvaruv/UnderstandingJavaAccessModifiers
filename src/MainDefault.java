// Everything in this file will be default unless it is unable to compile.

class MainDefault {// this class will have different variable and methods
    int defaultInt = 0;
    static int staticDefaultInt = 0;

    void defaultMethod() {
        System.out.println("MainDefault method defaultMethod");
    }
    static void staticDefaultMethod() {
        System.out.println("MainDefault method staticDefaultMethod");
    }
}

class Main2 {// This class will have nested classes
     int main2Int = 1;
     static int staticMain2Int = 2;

     static class Main21 {
         void main21Method() {
            System.out.println("Main2 method Main21Method");
        }

         static void staticMain21Method() {
            System.out.println("Main2 method StaticMain21Method");
        }
    }

     class Main22 {
         int main22Int = 1;
         static int staticMain22Int = 2;

         class Main221 {
             static void staticMain221Method(int i) {
                System.out.println("Main22 method Main221Method" + i + staticMain22Int + main22Int + staticMain2Int + main2Int);
            }

             void main221Method(int i) {
                System.out.println("Main22 method Main221Method" + i + staticMain22Int + main22Int + staticMain2Int + main2Int);
            }

        }

    }

     class Main23 {

         class Main231 {
             class Main2311 {
                 void Main2311Method() {
                    System.out.println("Main method Main2311Method");
                }
            }
        }

         static class Main232 {
             void Main232Method() {
                System.out.println("Main method Main232Method");
            }
        }

    }
}


class MainDefault3 {// This class will call different methods from Main and Main2 classes

}

class MainDefault4 {// This will call method from  a different file
}

class MainDefault5 {// Inheritance

}

class MainDefault6 {// Polymorphism

}

class MainDefault7 {// Abstraction

}

class MainDefault8 {// Encapsulation
}

