package xh;
public final class d2 implements Runnable {
    public final int f46154a;
    public final o2 f46155b;

    public d2(o2 o2Var, int i10) {
        this.f46154a = i10;
        this.f46155b = o2Var;
    }

    @Override
    public final void run() {
        switch (this.f46154a) {
            case 0:
                this.f46155b.setReordering(true);
                return;
            case 1:
                this.f46155b.setReordering(true);
                return;
            case 2:
                this.f46155b.f(false);
                return;
            default:
                this.f46155b.setReordering(true);
                return;
        }
    }
}
