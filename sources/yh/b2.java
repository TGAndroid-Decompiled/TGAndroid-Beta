package yh;
public final class b2 implements Runnable {
    public final int f48798a;
    public final m2 f48799b;

    public b2(m2 m2Var, int i10) {
        this.f48798a = i10;
        this.f48799b = m2Var;
    }

    @Override
    public final void run() {
        switch (this.f48798a) {
            case 0:
                this.f48799b.setReordering(true);
                return;
            case 1:
                this.f48799b.setReordering(true);
                return;
            case 2:
                this.f48799b.f(false);
                return;
            default:
                this.f48799b.setReordering(true);
                return;
        }
    }
}
