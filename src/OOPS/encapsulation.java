package OOPS;

public class encapsulation {
    public int id;
    private String gf;

    public String getgf(){
        return this.gf;
    }

    public void getgf(String a){
        this.gf = a;
    }

    private void gfChatting(){
        System.out.println("GF se chatting");
    }

    public encapsulation(int id, String gf){
        System.out.println("Encapsulated");
        this.id = id;
        this.gf = gf;
    }

    public static void main(String[] args) {
        encapsulation A = new encapsulation(1,"Rudrakshi");
        System.out.println(A.gf);
    }
}


// same class mai isliye idhar private chal rha hai
// dusre class mai nhi chalegi
// isliye getter or setter use krna pdega