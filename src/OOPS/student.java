package OOPS;

public class student {
    //Attributes

    public int id;
    public int age;
    public String name;
    public int nos;

    //Default Ctor //attr. ---> garbage i.e = 0
    public student() {
        System.out.println("Student Ctor Called");
    }

    //Parameterised Ctor
    public student(int age,int id,int nos,String name){
        System.out.println("Parameterised Ctor");
        this.id = id;
        this.age = age;
        this.name = name;
        this.nos = nos;
    }

    //copy ctor
    public student(student srcObj){  //srcObj --> A
        System.out.println("Source Obj Copied To Ctor");
        this.id = srcObj.id;
        this.age = srcObj.age;
        this.name = srcObj.name;
        this.nos = srcObj.nos;
    }

    //Behaviours

    public void study() {
        System.out.println(name + " studying");
    }

    public void bunk() {
        System.out.println(name + " bunked");
    }

//    public static void main(String[] args) {
//        student A = new student();
//        A.id = 1;
//        A.age = 15;
//        A.name = "RANU";
//        A.nos = 14;
//        System.out.println(A.name);
//        System.out.println(A.age);
//        System.out.println(A.id);
//        System.out.println(A.nos);
//
//        A.bunk();
//        A.study();
//    }

    // Parameterised Ctor
    public static void main(String[] args) {
        student A = new student(12,1,5,"piyush");
//        System.out.println(A.name);
//        System.out.println(A.age);
//        System.out.println(A.id);
//        System.out.println(A.nos);

//        A.bunk();
//        A.study();

        student B = new student(A);
        System.out.println(B.name);
    }
}

