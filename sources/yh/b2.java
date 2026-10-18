package yh;
public final class b2 implements Runnable {
    public final int f50228a;
    public final m2 f50229b;

    public b2(m2 m2Var, int i10) {
        this.f50228a = i10;
        this.f50229b = m2Var;
    }

    @Override
    public final void run() {
        switch (this.f50228a) {
            case 0:
                this.f50229b.setReordering(true);
                return;
            case 1:
                this.f50229b.setReordering(true);
                return;
            case 2:
                this.f50229b.f(false);
                return;
            default:
                this.f50229b.setReordering(true);
                return;
        }
    }
}
