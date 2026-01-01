//without object creation we use static keyword
class first {
    static void method1(){
        System.out.println("this is static");
    }
    void display(){
        System.out.println("Hello all of you");
    }
    public static void main(String args[]){
        first b=new first();
        System.out.println("Wel come to my class");
         b.display();
         method1();
    }
    
}
