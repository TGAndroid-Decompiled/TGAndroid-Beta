package yh;
public final class b2 implements Runnable {
    public final int f48799a;
    public final m2 f48800b;

    public b2(m2 m2Var, int i10) {
        this.f48799a = i10;
        this.f48800b = m2Var;
    }

    @Override
    public final void run() {
        switch (this.f48799a) {
            case 0:
                this.f48800b.setReordering(true);
                return;
            case 1:
                this.f48800b.setReordering(true);
                return;
            case 2:
                this.f48800b.f(false);
                return;
            default:
                this.f48800b.setReordering(true);
                return;
        }
    }
}
