public class Minhaclasse {
    public static void main (String [] args){
        String primeiroNome = "Sarah";
        String segundoNome = "Aguiar";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.println(nomeCompleto);
    }
    public static String nomeCompleto (String primeiroNome, String segundoNome){
           return primeiroNome.concat("").concat(segundoNome);
    }
    
}
