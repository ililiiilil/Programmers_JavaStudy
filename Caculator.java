public interface Caculator {
    public int plus(int i, int j);
    public int nultiple(int i, int j);

    default int exec(int i, int j){
        return i * j;
    }
}
