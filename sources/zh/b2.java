package zh;
public final class b2 implements Runnable {
    public final int f52904a;
    public final m2 f52905b;

    public b2(m2 m2Var, int i10) {
        this.f52904a = i10;
        this.f52905b = m2Var;
    }

    @Override
    public final void run() {
        switch (this.f52904a) {
            case 0:
                this.f52905b.setReordering(true);
                return;
            case 1:
                this.f52905b.setReordering(true);
                return;
            case 2:
                this.f52905b.f(false);
                return;
            default:
                this.f52905b.setReordering(true);
                return;
        }
    }
}
