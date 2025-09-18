package ProjetoPilha;

public class Pilha {
    private NoPilha refNoEntradaPilha;

    public Pilha() {
        this.refNoEntradaPilha = null;
    }

    public NoPilha topNo() { //retorna a referencia, o topo.
        return refNoEntradaPilha;
    }

    //receberá o novo no
    public void push(NoPilha novoNo) {
        NoPilha refNoAux = refNoEntradaPilha; //Usara de referencia o no anterior
        refNoEntradaPilha = novoNo;
        refNoEntradaPilha.setReNo(refNoAux);
    }

    public NoPilha popNo() {
        if(!this.isEmpty()) {
            NoPilha noPoped = refNoEntradaPilha;
            refNoEntradaPilha = refNoEntradaPilha.getReNo();
            return noPoped;
        }
        return null;
    }

    public boolean isEmpty() {
        return this.refNoEntradaPilha == null ? true : false;
    }

    @Override
    public String toString() {
        String stringRetorno = "-----------------\n";
        stringRetorno += "            Pilha\n";
        stringRetorno += "-----------------\n";

        NoPilha noAuxiliar = refNoEntradaPilha;

        while (true) {
            if (noAuxiliar != null) {
                stringRetorno += "[No{dado = " +
                        noAuxiliar.toString() + "}]\n";
                noAuxiliar = noAuxiliar.getReNo();
            }else{
                break;
            }


        }
        return stringRetorno += "=============\n";
    }
}
