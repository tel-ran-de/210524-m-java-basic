public class Person {
//    properties/ variables
    private String name;
    private int age;

//    default constructor
//    public Person() {}

//    name - constructor
//    public Person(String name) {
//        this.name = name;
//    }
// age - constructor
//    public Person(int age) /*throws Exception*/ {
//        if (age < 0) {
////            throw new Exception("Incorrect age!");
//            System.out.println("Incorrect age!");
//        } else {
//            this.age = age;
//        }
//    }

//    full params constructor
    public Person(String name, int age) {
        this.name = name;
        if (age < 0) {
            System.out.println("Incorrect age!");
        } else {
            this.age = age;
        }
    }

//    public void setAge(int age) {
//        if (age < 0) {
//            System.out.println("Incorrect age!");
//        } else {
//            this.age = age;
//        }
//    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void print() {
        System.out.println("Hello");
//        InnerLocalClass innerLocalClass = new
//        InnerLocalClass.

//        inner local class
        class InnerLocalClass{
            public void printInfo(){
                System.out.println("Hello from local innser class");
            }
        }
    }


//inner class
    private class Title {
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }



    }
}
