package xh;
public final class d2 implements Runnable {
    public final int f51246a;
    public final o2 f51247b;

    public d2(o2 o2Var, int i10) {
        this.f51246a = i10;
        this.f51247b = o2Var;
    }

    @Override
    public final void run() {
        switch (this.f51246a) {
            case 0:
                this.f51247b.setReordering(true);
                return;
            case 1:
                this.f51247b.setReordering(true);
                return;
            case 2:
                this.f51247b.f(false);
                return;
            default:
                this.f51247b.setReordering(true);
                return;
        }
    }
}
