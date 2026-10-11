package xh;
public final class d2 implements Runnable {
    public final int f51289a;
    public final o2 f51290b;

    public d2(o2 o2Var, int i10) {
        this.f51289a = i10;
        this.f51290b = o2Var;
    }

    @Override
    public final void run() {
        switch (this.f51289a) {
            case 0:
                this.f51290b.setReordering(true);
                return;
            case 1:
                this.f51290b.setReordering(true);
                return;
            case 2:
                this.f51290b.f(false);
                return;
            default:
                this.f51290b.setReordering(true);
                return;
        }
    }
}
