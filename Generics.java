public class Generics<T> {
    public void print(T a){
        System.out.println("Arugument Received --->"+ a);
    }

    public static void main(String[] args) {
        Generics obj=new Generics();
        obj.print(12);
        obj.print("Mani");
        obj.print("G");
    }
}
