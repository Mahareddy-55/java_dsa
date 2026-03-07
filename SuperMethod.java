class C{
    void speak(){
        System.out.println("Animal makes sound");
    }
}
class D extends C{
    void speak(){
        super.speak();
        System.out.println("Dog Barks");
    }
}
public class SuperMethod {
    public static void main(String[] args){
        D d=new D();
        d.speak();
    }
}