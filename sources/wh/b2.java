package wh;
public final class b2 implements Runnable {
    public final int f44034a;
    public final m2 f44035b;

    public b2(m2 m2Var, int i10) {
        this.f44034a = i10;
        this.f44035b = m2Var;
    }

    @Override
    public final void run() {
        switch (this.f44034a) {
            case 0:
                this.f44035b.setReordering(true);
                return;
            case 1:
                this.f44035b.setReordering(true);
                return;
            case 2:
                this.f44035b.f(false);
                return;
            default:
                this.f44035b.setReordering(true);
                return;
        }
    }
}
