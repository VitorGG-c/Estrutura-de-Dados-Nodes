package ProjetoPilha;

public class testePilha {
    public static void main(String[] args) {
        Pilha pilha = new Pilha();

       for(int i =1; i<=5;i++) {
           pilha.push(new NoPilha(i));
       }
        System.out.println(pilha);
       pilha.popNo();
        System.out.println(pilha);
    }
}
