package zadania.domowe;

public class ModuloAlternatywne {
    public static void main(String[] args) {
        System.out.println(alternatywnyModulo(2, 5));
        System.out.println(sprawdzaczFunkcji(2,5));
    }
    public static int alternatywnyModulo(int a, int b){
        int c=a/b;
        int modulo=a-c*b;
        return modulo;
    }
    public static boolean sprawdzaczFunkcji(int a, int b){
        if(alternatywnyModulo(a,b)!=a%b){
            return false;
        }
        return true;
    }

}
