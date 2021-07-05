public class main {
    public static void main(String[] args) {
        String a="amr";
        String b="ahmed";
        String Better= better_string.better(a,b,(s1,s2)-> s1.length()>s2.length());
        System.out.println(Better+"  is the better string");



    }
}
