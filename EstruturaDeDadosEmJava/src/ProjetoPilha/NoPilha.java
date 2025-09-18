package ProjetoPilha;

public class NoPilha<T> {
    private T dado;
    private NoPilha<T> reNo = null;

    public NoPilha(T dado) {
        this.dado = dado;
    }

    public T getDado() {
        return dado;
    }

    public void setDado(T dado) {
        this.dado = dado;
    }

    public NoPilha<T> getReNo() {
        return reNo;
    }

    public void setReNo(NoPilha<T> reNo) {
        this.reNo = reNo;
    }

    @Override
    public String toString() {
        return "NoPilha{" +
                "dado=" + dado +
                '}';
    }
}
